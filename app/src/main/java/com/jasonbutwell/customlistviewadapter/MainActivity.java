package com.jasonbutwell.customlistviewadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonRecord> people = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        people = new ArrayList<>();

        // put some data in our person records

        // String firstName, String secondName, String jobTitle, int age, int imageID

        people.add(new PersonRecord("Jason","Butwell","Android Developer",42,0));

        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter(this,people);
        ListView peopleListView = (ListView)findViewById(R.id.listView);
        peopleListView.setAdapter(customListViewAdapter);


    }
}
