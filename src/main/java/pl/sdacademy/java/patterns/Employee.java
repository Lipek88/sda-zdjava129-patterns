package pl.sdacademy.java.patterns;

import java.util.UUID;

public class Employee extends Person {
    private float salary;
    private int employmentDate;

    public Employee(UUID uuid, String firstName, String lastName, float salary, int employmentDate) {
        super(uuid, firstName, lastName);
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

}
