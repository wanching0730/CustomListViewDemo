package com.example.customlistviewdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by James Ooi on 19/7/2017.
 */

public class CitiesList {
    private static String[] names = {
            "Beijing",
            "Brisbane",
            "Busan",
            "George Town",
            "Hong Kong",
            "Kuala Lumpur",
            "Kuching",
            "Melbourne",
            "Seoul",
            "Shanghai",
            "Sydney",
            "Taipei",
            "Ulan Bator",
    };

    private static String[] countries = {
            "China",
            "Australia",
            "South Korea",
            "Malaysia",
            "China, HK SAR",
            "Malaysia",
            "Malaysia",
            "Australia",
            "South Korea",
            "China",
            "Australia",
            "Taiwan",
            "Mongolia",
    };

    public static ArrayList<City> getCities() {
        ArrayList<City> cities = new ArrayList<>();

        for(int i = 0; i < names.length; i++) {
            City city = new City(names[i], countries[i]);
            cities.add(city);
        }

        return cities;
    }
}
