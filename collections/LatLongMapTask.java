package com.hughes.collections;

import java.util.HashMap;
import java.util.Map;

public class LatLongMapTask {

    public static void main(String[] args) {

        HashMap<String, String[]> mp = new HashMap<>();
        mp.put("hyderabad", new String[]{"17.3850° N", "78.4867° E"});
        mp.put("mumbai", new String[]{"19.0760° N", "72.8777° E"});
        mp.put("chennai", new String[]{"13.0827° N", "80.2707° E"});
        mp.put("calcutta", new String[]{"22.5726° N", "88.3639° E"});
        mp.put("bihar", new String[]{"25.5941° N", "85.1376° E"});

        String cityName = "mumbai";

        if (mp.containsKey(cityName)) {
            String[] coordinates = mp.get(cityName);
            System.out.println("Coordinates for " + cityName + ":");
            System.out.println("Latitude: " + coordinates[0]);
            System.out.println("Longitude: " + coordinates[1]);
        } else {
            System.out.println("Coordinates not found for " + cityName);
        }
    }
}
