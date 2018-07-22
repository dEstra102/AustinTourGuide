package com.example.sp4.austintourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context,int resources, List<Location> locationList) {
        super(context,0,locationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Location currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.guide_list, parent, false);

        }


        TextView locationName = (TextView) listItemView.findViewById(R.id.name_textView);
        locationName.setText(currentLocation.getName());

        TextView locationDescription = (TextView) listItemView.findViewById(R.id.description_textView);
        locationDescription.setText(currentLocation.getDescription());

        TextView locationAddress = (TextView)
                listItemView.findViewById(R.id.address_textView);
       locationAddress.setText(currentLocation.getAddress());

        return listItemView;
    }
}
