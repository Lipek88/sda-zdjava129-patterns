package pl.sdacademy.java.patterns;

import java.util.Set;

public class Teacher implements HasPerson{

    public Person person;
    private Set<String> subjectCodes;

    @Override
    public Person getPerson() {
        return person;
    }

    public Set<String> getSubjectCodes() {
        return subjectCodes;
    }
}
