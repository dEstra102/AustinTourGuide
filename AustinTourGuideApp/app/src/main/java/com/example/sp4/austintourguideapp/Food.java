package com.example.sp4.austintourguideapp;

import android.content.Context;

import java.util.List;

public class Food {
    public static void foodList(List<Location> list, Context context) {
        list.add(new Location(
                context.getString(R.string.food_hollaMode_name),
                context.getString(R.string.food_hollaMode_description),
                context.getString(R.string.food_hollaMode_address)
        ));

        list.add(new Location(
                context.getString(R.string.food_hayElotes_name),
                context.getString(R.string.food_hayElotes_description),
                context.getString(R.string.food_hayElotes_address)
        ));

        list.add(new Location(
                context.getString(R.string.food_steelCity_name),
                context.getString(R.string.food_steelCity_description),
                context.getString(R.string.food_steelCity_address)
        ));
    }
}
