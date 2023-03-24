package ru.marshenina;

import java.util.ArrayDeque;

public class MainQueue {

    public static void main(String[] args) {

        PeopleQueue peopleQueue1 = new PeopleQueue(1, "Пупкин");
        PeopleQueue peopleQueue2 = new PeopleQueue(2, "Кротов");
        PeopleQueue peopleQueue3 = new PeopleQueue(3, "Львов");
        PeopleQueue peopleQueue4 = new PeopleQueue(4, "Eглов");

        ArrayDeque<PeopleQueue> queue = new ArrayDeque<>();
        queue.add(peopleQueue1);
        queue.add(peopleQueue2);
        queue.add(peopleQueue3);
        queue.add(peopleQueue4);

        PeopleQueue.getFirstElementQueue(queue);
        PeopleQueue.getLastElementQueue(queue);
        PeopleQueue.getQueueSize(queue);
        PeopleQueue.getQueue(queue);

        queue.removeFirst();

        PeopleQueue.getQueue(queue);
        PeopleQueue.getQueueSize(queue);


    }
}
