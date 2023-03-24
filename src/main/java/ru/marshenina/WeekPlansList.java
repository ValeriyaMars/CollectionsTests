package ru.marshenina;

import java.util.Iterator;
import java.util.Set;

public class WeekPlansList {

    private final String dayOfWeek;
    private final String plan;

    public WeekPlansList(String dayOfWeek, String plan) {
        this.dayOfWeek = dayOfWeek;
        this.plan = plan;
    }

    public void getWeekPlansList(Set<WeekPlansList> listOfWeekPlans) {
        System.out.println("Планы на неделю:");
        Iterator<WeekPlansList> i = listOfWeekPlans.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    @Override
    public String toString() {
        return "День недели: " + dayOfWeek +
                " - " + plan;
    }
}
