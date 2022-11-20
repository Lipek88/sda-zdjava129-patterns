package pl.sdacademy.java.patterns;

public class StudentBuilder{

    private Person person;
    private String groupCode;

    public StudentBuilder person(Person person) {
        this.person = person;
        return this; // zwracamy obiekt w którym jesteśmy ??
    }

    public StudentBuilder groupCode(String groupCode) {
        this.groupCode = groupCode;
        return this; // zwracamy obiekt w którym jesteśmy ??
    }

    public Student build(){
        return new Student(person, groupCode); //wywołanie metody
    }
}
