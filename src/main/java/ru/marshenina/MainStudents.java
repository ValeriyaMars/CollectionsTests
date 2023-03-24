package ru.marshenina;

import java.util.HashSet;
import java.util.Set;

public class MainStudents {

    public static void main(String[] args) {

        StudentsSet student1 = new StudentsSet(1, "Владимир", "Котов");
        StudentsSet student2 = new StudentsSet(2, "Александра", "Петрова");
        StudentsSet student3 = new StudentsSet(3, "Зорик", "Гомбо");

        Set<StudentsSet> setOfStudents = new HashSet<>();
        setOfStudents.add(student1);
        setOfStudents.add(student2);
        setOfStudents.add(student3);

        student1.getStudentsSet(setOfStudents);

        setOfStudents.remove(student2);

        student1.getStudentsSet(setOfStudents);
    }
}
