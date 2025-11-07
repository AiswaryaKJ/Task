package Collection;

import java.util.*;

public class StudentSetDemo {

    static void displayStudents(Set<String> students) {
        System.out.println("Students: " + students);
    }

    static void searchStudent(Set<String> students, String name) {
        if (students.contains(name))
            System.out.println(name + " is present in the list.");
        else
            System.out.println(name + " not found.");
    }

    static void removeStudent(Set<String> students, String name) {
        if (students.remove(name))
            System.out.println(name + " removed.");
        else
            System.out.println(name + " not found.");
    }

    public static void main(String[] args) {

        Set<String> students = new TreeSet<>();


        students.add("Aiswarya");
        students.add("John");
        students.add("Meera");
        students.add("John"); 

        displayStudents(students);

        searchStudent(students, "Meera");
        searchStudent(students, "Arun");

        removeStudent(students, "John");
        removeStudent(students, "Arun");

        System.out.println("Total Students: " + students.size());

        students.clear();
        System.out.println("Cleared Set. Final Students: " + students);
    }
}

