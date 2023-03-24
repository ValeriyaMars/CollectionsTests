package ru.marshenina;

import java.util.ArrayDeque;

public class PeopleQueue {
    private final int number;
    private final String lastName;

    public PeopleQueue(int number, String lastName) {
        this.number = number;
        this.lastName = lastName;
    }

    public static void getFirstElementQueue(ArrayDeque<PeopleQueue> queue) {
        System.out.println(queue.getFirst());
    }

    public static void getLastElementQueue(ArrayDeque<PeopleQueue> queue) {
        System.out.println(queue.getLast());
    }

    public static void getQueueSize(ArrayDeque<PeopleQueue> queue) {
        System.out.printf("В очереди: %d \n", queue.size());
    }

    public static void getQueue(ArrayDeque<PeopleQueue> queue) {
        while (queue.peek() != null) {
            System.out.println(queue);
            break;
        }
    }


    @Override
    public String toString() {
        return "Номер: " + number +
                " Фамилия: " + lastName;
    }
}
