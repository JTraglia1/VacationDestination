package com.hfad.vacationdestination;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {

    private static ArrayList<VacationDestination> allDestinations;

    public static ArrayList<VacationDestination> getDestinations()
    {
        if (allDestinations == null)
        {
            loadData();
        }

        return allDestinations;
    }

    private static void loadData()
    {
        allDestinations = new ArrayList<VacationDestination>();

        //Put in loop
        //allDestinations.add(new VacationDestination("New Delhi", R.drawable.thumb_1_0));

        ArrayList<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.thumb_4_1);
        images.add(R.drawable.thumb_4_2);
        images.add(R.drawable.thumb_4_3);
        images.add(R.drawable.thumb_4_4);
        images.add(R.drawable.thumb_4_7);
        images.add(R.drawable.thumb_4_8);
        images.add(R.drawable.thumb_4_0);
        images.add(R.drawable.thumb_7_0);
        images.add(R.drawable.thumb_7_1);
        images.add(R.drawable.thumb_7_2);
        images.add(R.drawable.thumb_4_5);
        images.add(R.drawable.thumb_4_6);
        images.add(R.drawable.thumb_1_0);
        images.add(R.drawable.thumb_1_1);
        images.add(R.drawable.thumb_1_2);
        images.add(R.drawable.thumb_1_3);
        images.add(R.drawable.thumb_1_4);
        images.add(R.drawable.thumb_1_5);
        images.add(R.drawable.thumb_1_6);
        images.add(R.drawable.thumb_1_7);
        images.add(R.drawable.thumb_1_8);
        images.add(R.drawable.thumb_1_9);
        images.add(R.drawable.thumb_2_0);
        images.add(R.drawable.thumb_2_1);
        images.add(R.drawable.thumb_4_9);
        images.add(R.drawable.thumb_5_0);
        images.add(R.drawable.thumb_5_1);
        images.add(R.drawable.thumb_5_2);
        images.add(R.drawable.thumb_5_3);
        images.add(R.drawable.thumb_5_4);
        images.add(R.drawable.thumb_5_5);
        images.add(R.drawable.thumb_5_6);
        images.add(R.drawable.thumb_5_7);
        images.add(R.drawable.thumb_5_8);
        images.add(R.drawable.thumb_5_9);
        images.add(R.drawable.thumb_6_0);
        images.add(R.drawable.thumb_6_1);
        images.add(R.drawable.thumb_6_2);
        images.add(R.drawable.thumb_6_3);
        images.add(R.drawable.thumb_6_4);
        images.add(R.drawable.thumb_6_5);
        images.add(R.drawable.thumb_6_6);
        images.add(R.drawable.thumb_6_7);
        images.add(R.drawable.thumb_6_8);
        images.add(R.drawable.thumb_6_9);
        images.add(R.drawable.thumb_2_2);
        images.add(R.drawable.thumb_2_3);
        images.add(R.drawable.thumb_2_4);
        images.add(R.drawable.thumb_2_5);
        images.add(R.drawable.thumb_2_6);
        images.add(R.drawable.thumb_2_7);
        images.add(R.drawable.thumb_2_8);
        images.add(R.drawable.thumb_2_9);
        images.add(R.drawable.thumb_3_0);
        images.add(R.drawable.thumb_3_1);
        images.add(R.drawable.thumb_3_2);
        images.add(R.drawable.thumb_3_3);
        images.add(R.drawable.thumb_3_4);
        images.add(R.drawable.thumb_3_5);
        images.add(R.drawable.thumb_3_6);
        images.add(R.drawable.thumb_3_7);
        images.add(R.drawable.thumb_3_8);
        images.add(R.drawable.thumb_3_9);
        images.add(R.drawable.thumb_7_3);
        images.add(R.drawable.thumb_7_4);


        ArrayList<String> names = new ArrayList<String>();
        names.add("New Delhi");
        names.add("Manchester");
        names.add("Nottingham");
        names.add("Portsmouth");
        names.add("Agra");
        names.add("Hyderabad");
        names.add("Goa");
        names.add("Srinagar");
        names.add("Xian");
        names.add("Shanghai");
        names.add("Buffalo");
        names.add("Boise");
        names.add("Pittsburgh");
        names.add("Scottsdale");
        names.add("Boston");
        names.add("Philly");
        names.add("Darjeeling");
        names.add("Jaipur");
        names.add("DC");
        names.add("Minneapolis");
        names.add("New York City");
        names.add("Denver");
        names.add("Asheville");
        names.add("Hull");
        names.add("Liverpool");
        names.add("Detroit");
        names.add("Adelaide");
        names.add("Tasmania");
        names.add("Austin");
        names.add("Kansas City");
        names.add("Seattle");
        names.add("Oakland");
        names.add("Las Vegas");
        names.add("New Orleans");
        names.add("Bath");
        names.add("Norwich");
        names.add("Mumbai");
        names.add("Cambridge");
        names.add("London");
        names.add("Bristol");
        names.add("Brighton");
        names.add("Durham");
        names.add("San Diego");
        names.add("Brooklyn");
        names.add("Chicago");
        names.add("Charleston");
        names.add("Nashville");
        names.add("York");
        names.add("Stratford-upon-Avon");
        names.add("Bournemouth");
        names.add("Beijing");
        names.add("Miami");
        names.add("Portland");
        names.add("Chengdu");
        names.add("Hangzhou");
        names.add("Suzhou");
        names.add("Huangshan");
        names.add("Hong Kong");
        names.add("Cairns");
        names.add("Perth");
        names.add("Brisbane");
        names.add("Kakadu National Park");
        names.add("Melbourne");
        names.add("Great Barrier Reef");
        names.add("Sydney");

        ArrayList<Boolean> favorites = new ArrayList<Boolean>();
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);
        favorites.add(false);


        for (int i = 0; i < images.size(); i++)
        {
            allDestinations.add(new VacationDestination(names.get(i), images.get(i), favorites.get(i)));
        }
    }

}
