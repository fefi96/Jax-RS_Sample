package de.hhn.swp.rest.model;

import java.time.LocalDate;

public class Person {

    private final String firstName, lastName;

    private final LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
