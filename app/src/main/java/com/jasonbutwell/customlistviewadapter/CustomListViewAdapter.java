package com.jasonbutwell.customlistviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by J on 05/12/2016.
 */

public class CustomListViewAdapter extends BaseAdapter {

    private Context context;

    //Integer[] imageIDs;
    ArrayList<PersonRecord> people;

    public CustomListViewAdapter(Context c, ArrayList people) {
        context = c;
        this.people = people;
    }

    //---returns the number of images---
    public int getCount() {
        return people.size();
    }

    //---returns the ID of an item---
    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    //---returns an ImageView view---
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = null;

        if (convertView == null) {

            LayoutInflater customInflater = LayoutInflater.from(context);
            row = customInflater.inflate(R.layout.row ,parent, false);

            TextView firstName = (TextView)row.findViewById(R.id.firstName);
            TextView secondName = (TextView)row.findViewById(R.id.secondName);
            TextView jobTitle = (TextView)row.findViewById(R.id.jobTitle);
            TextView age = (TextView)row.findViewById(R.id.age);
            ImageView image = (ImageView)row.findViewById(R.id.personImage);

            // Set the row values based on the record being indexed
            firstName.setText(people.get(position).getFirstName());
            secondName.setText(people.get(position).getSecondName());
            jobTitle.setText(people.get(position).getJobTitle());
            age.setText(people.get(position).getAge());

            // Sets the image here if we have one
            //image.setImageResource(people.get(position).getImageID());

        } else {
            row = (View) convertView;
        }

        return row;
    }

}
