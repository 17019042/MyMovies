package com.example.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> alMovieList;
    CustomAdapter caMovie;
    ImageView ivRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alMovieList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,11,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2014,5,15);

        Movie item1 = new Movie("The Avengers"
                , "2012"
                , "pg13"
                , "Action | Sci-Fi"
                , date1
                , "GoldenVillage"
                , "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");

        Movie item2 = new Movie("Planes"
                , "2013"
                , "pg"
                , "Animation | Comedy"
                , date2
                , "Cathay - AMK Hub"
                , "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");

        alMovieList.add(item1);
        alMovieList.add(item2);
        caMovie = new CustomAdapter(this,R.layout.row,alMovieList);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("test",alMovieList);

                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
