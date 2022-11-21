package com.sda.mihai.petclinicmanagement.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.awt.print.Book;

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
    }
}
