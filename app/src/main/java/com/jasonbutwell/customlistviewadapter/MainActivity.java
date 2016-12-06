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

        // Initialise our ArrayList for our people
        people = new ArrayList<>();

        // put some data in our person records

        // String firstName, String secondName, String jobTitle, int age, int imageID
        people.add( new PersonRecord( "Jason", "Butwell", "Android Developer", 42, R.drawable.jason ) );
        people.add( new PersonRecord( "Nick", "Whitelegg", "University Lecturer", 45, R.drawable.nick ) );
        people.add( new PersonRecord( "Ray", "Butcher", "Professional Musician", 42, R.drawable.ray ) );
        people.add( new PersonRecord( "Joe", "Blogs", "Retired", 76, -1 ) );


        ListView peopleListView = (ListView)findViewById( R.id.listView );
        peopleListView.setAdapter( new CustomListViewAdapter( this, people ) );

    }
}
