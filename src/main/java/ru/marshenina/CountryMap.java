package ru.marshenina;


import java.util.Set;

public class CountryMap {

    public CountryMap() {
    }

    private final String russia = "Россия";
    private final Set<String> citiesInRussia = Set.of(
            "Москва", "Санкт-Петербург", "Сызрань"
    );
    private final String latvia = "Латвия";
    private final Set<String> citiesInLatvia = Set.of(
            "Рига", "Даугавпилс", "Резекне"
    );
    private final String кazakhstan = "Казахстан";
    private final Set<String> citiesInKazakhstan = Set.of(
            "Астана", "Алматы", "Павлодар"
    );

    public String getКazakhstan() {
        return кazakhstan;
    }

    public Set<String> getCitiesInKazakhstan() {
        return citiesInKazakhstan;
    }

    public String getLatvia() {
        return latvia;
    }

    public Set<String> getCitiesInLatvia() {
        return citiesInLatvia;
    }

    public String getRussia() {
        return russia;
    }

    public Set<String> getCitiesInRussia() {
        return citiesInRussia;
    }
}
