package Collection;

import java.util.*;

public class DepartmentSubjectDemo {

    static void displaySubjects(Set<String> subjects) {
        System.out.println("Subjects: " + subjects);
    }

    static void searchSubject(Set<String> subjects, String subject) {
        if (subjects.contains(subject))
            System.out.println(subject + " is offered by the department.");
        else
            System.out.println(subject + " is NOT offered.");
    }

    static void removeSubject(Set<String> subjects, String subject) {
        if (subjects.remove(subject))
            System.out.println(subject + " removed.");
        else
            System.out.println(subject + " not found.");
    }

    public static void main(String[] args) {

        Set<String> subjects = new LinkedHashSet<>();

        subjects.add("Data Structures");
        subjects.add("Operating Systems");
        subjects.add("Networks");
        subjects.add("Java Programming");
        subjects.add("Data Structures"); 

        displaySubjects(subjects);

      
        searchSubject(subjects, "Networks");
        searchSubject(subjects, "Compiler Design");

     
        removeSubject(subjects, "Java Programming");
        removeSubject(subjects, "Python");

  
        System.out.println("Total Subjects: " + subjects.size());


        subjects.clear();
        System.out.println("After clearing: " + subjects);
    }
}
