package com.example.sp4.austintourguideapp;

import android.content.Context;

import java.util.List;

public class Historic {

    public static void historicList(List<Location> list, Context context) {
        list.add(new Location(
                context.getString(R.string.historic_bartonSprings_name),
                context.getString(R.string.historic_bartonSprings_description),
                context.getString(R.string.historic_bartonSprings_address)

        ));

        list.add(new Location(
                context.getString(R.string.historic_paramount_name),
                context.getString(R.string.historic_paramount_description),
                context.getString(R.string.historic_paramount_address)
        ));

        list.add(new Location(
                context.getString(R.string.historic_bridge_name),
                context.getString(R.string.historic_bridge_description),
                context.getString(R.string.historic_bridge_address)
        ));
    }

}
