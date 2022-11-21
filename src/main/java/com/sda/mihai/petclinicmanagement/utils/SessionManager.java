package com.sda.mihai.petclinicmanagement.utils;

import com.sda.mihai.petclinicmanagement.model.Consult;
import com.sda.mihai.petclinicmanagement.model.Pet;
import com.sda.mihai.petclinicmanagement.model.Veterinarian;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("pet_clinic_management_system");
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        // Hibernate Model will be added here

        configuration.addAnnotatedClass(Veterinarian.class);
        configuration.addAnnotatedClass(Pet.class);
        configuration.addAnnotatedClass(Consult.class);
    }
}
