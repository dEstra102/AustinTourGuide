package com.example.sp4.austintourguideapp;

import android.content.Context;

import java.util.List;

public class Attractions {
    public static void attractionsList(List<Location> list, Context context) {
        list.add(new Location(
                context.getString(R.string.attractions_zoo_name),
                context.getString(R.string.attractions_zoo_description),
                context.getString(R.string.attractions_zoo_address)

        ));

        list.add(new Location(
                context.getString(R.string.attractions_kayaks_name),
                context.getString(R.string.attractions_kayaks_description),
                context.getString(R.string.attractions_kayaks_address)
        ));

        list.add(new Location(
                context.getString(R.string.attractions_zip_name),
                context.getString(R.string.attractions_zip_description),
                context.getString(R.string.attractions_zip_address)
        ));
    }
}
