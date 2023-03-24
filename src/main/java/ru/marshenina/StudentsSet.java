package ru.marshenina;

import java.util.Iterator;
import java.util.Set;

public class StudentsSet {

    private final int id;
    private final String firstName;
    private final String lastName;

    public StudentsSet(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getStudentsSet(Set<StudentsSet> setOfStudents) {
        System.out.println("Список студентов:");
        Iterator<StudentsSet> i = setOfStudents.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", имя: " + firstName +
                ", фамилия: " + lastName;
    }
}
