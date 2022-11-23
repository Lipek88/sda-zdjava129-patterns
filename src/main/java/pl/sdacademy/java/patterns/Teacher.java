package pl.sdacademy.java.patterns;

import java.util.Set;

class Teacher implements HasPerson {

   private Person person;
   private Set<String> subjectCodes;

   public Teacher(Set<String> subjectCodes) {
      this.subjectCodes = subjectCodes;
   }

   @Override
   public Person getPerson() {
      return person;
   }

   public Set<String> getSubjectCodes() {
      return subjectCodes;
   }

   public static TeacherBuilder builder(){
      return new TeacherBuilder();
   }
}
