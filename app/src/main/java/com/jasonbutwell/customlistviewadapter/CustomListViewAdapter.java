package com.jasonbutwell.customlistviewadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

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

            row = View.inflate(R.id.single_row,parent, false);

        } else {
            row = (View) convertView;
        }
        //imageView.setImageResource(images.get(position));

        return row;
    }

}
