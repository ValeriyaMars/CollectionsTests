package ru.marshenina;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainCountryMap {
    public static void main(String[] args) {

        CountryMap devices = new CountryMap();

        Map<String, Set<String>> devicesMap = new LinkedHashMap<>();

        devicesMap.put(devices.getRussia(), devices.getCitiesInRussia());

        System.out.println(devicesMap.get(devices.getRussia()));

        devicesMap.put(devices.getLatvia(), devices.getCitiesInLatvia());
        devicesMap.put(devices.getКazakhstan(), devices.getCitiesInKazakhstan());

        System.out.println(devicesMap.entrySet());

        devicesMap.remove(devices.getКazakhstan());
        System.out.println(devicesMap.values());

    }
}
