package com.sda.mihai.petclinicmanagement.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "race")
    private String race;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "is_vaccinated")
    private Boolean isVaccinated;

    @Column(name = "owner_name")
    private String ownerName;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    private Veterinarian veterinarian;

    @OneToMany(mappedBy = "pet")
    private List<Consult> consults;

    public Pet(String race, Date birthdate, Boolean isVaccinated, String ownerName, Veterinarian veterinarian) {
        this.race = race;
        this.birthdate = birthdate;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;
        this.veterinarian = veterinarian;
    }

    private Pet() {


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", birthdate=" + birthdate +
                ", isVaccinated=" + isVaccinated +
                ", ownerName='" + ownerName + '\'' +
                ", veterinarian=" + veterinarian +
                '}';
    }
}