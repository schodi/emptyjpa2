package jpa1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Pupil {

    @Id
    @GeneratedValue
    Long id;

    private String lastName;
    private String matNr;
    private String firstName;

    public Pupil() {}

    public Pupil(String firstName, String lastName, String matNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matNr = matNr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatNr() {
        return matNr;
    }

    public void setMatNr(String matNr) {
        this.matNr = matNr;
    }
    
}
