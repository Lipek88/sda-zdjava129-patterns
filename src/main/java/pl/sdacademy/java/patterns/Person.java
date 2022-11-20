package pl.sdacademy.java.patterns;

import java.util.UUID;

public class Person {

    private UUID uuid;
    private String firstName;
    private String lastName;

    public Person(UUID uuid, String firstNAme, String lastName) {
        this.uuid = uuid;
        this.firstName = firstNAme;
        this.lastName = lastName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
