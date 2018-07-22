package com.example.sp4.austintourguideapp;

import android.content.Context;

import java.util.List;

public class Festivals {
    public static void festivalsList(List<Location> list, Context context) {
        list.add(new Location(
                context.getString(R.string.festivals_bat_name),
                context.getString(R.string.festivals_bat_description),
                context.getString(R.string.festivals_bat_address)
        ));

        list.add(new Location(
                context.getString(R.string.festivals_parade_name),
                context.getString(R.string.festivals_parade_description),
                context.getString(R.string.festivals_parade_address)
        ));

        list.add(new Location(
                context.getString(R.string.festivals_acl_name),
                context.getString(R.string.festivals_acl_description),
                context.getString(R.string.festivals_acl_address)
        ));
    }
}
