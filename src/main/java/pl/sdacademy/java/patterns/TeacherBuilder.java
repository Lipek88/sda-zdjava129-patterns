package pl.sdacademy.java.patterns;

import java.util.Set;

public class TeacherBuilder {

    private Person person;
    private Set<String> subjectCodes;

    public TeacherBuilder person(Person person){
        this.person = person;
        return this;
    }

    public TeacherBuilder subjectCodes(Set<String> subjectCodes){
        this.subjectCodes = subjectCodes;
        return this;
    }

    public String subject(String subjectCode){
        if (subjectCode == "MAT" || subjectCode == "BIO" || subjectCode == "ENG"){
            subjectCodes.add(subjectCode);
        }else{
            subjectCodes.add("");
        }
        return subjectCodes.toString();
    }

    public Teacher build(){
        return new Teacher(subjectCodes);
    }

}
