package ru.marshenina;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainWeekPlans {
    public static void main(String[] args) {

        WeekPlansList plan1 = new WeekPlansList("Понедельник", "Танцы");
        WeekPlansList plan2 = new WeekPlansList("Вторник", "Квиз");
        WeekPlansList plan3 = new WeekPlansList("Среда", "Курсы");
        WeekPlansList plan4 = new WeekPlansList("Суббота", "Массаж");
        WeekPlansList plan5 = new WeekPlansList("Суббота", "Массаж");

        Set<WeekPlansList> listOfWeekPlans = new LinkedHashSet<>();
        listOfWeekPlans.add(plan1);
        listOfWeekPlans.add(plan2);
        listOfWeekPlans.add(plan3);
        listOfWeekPlans.add(plan4);
        listOfWeekPlans.add(plan5);

        plan5.getWeekPlansList(listOfWeekPlans);

        listOfWeekPlans.remove(plan5);
        plan5.getWeekPlansList(listOfWeekPlans);
    }

}
