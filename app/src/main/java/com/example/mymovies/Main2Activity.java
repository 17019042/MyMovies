package com.example.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    TextView tvTitle, tvDetail, tvWatched, tvTheatre, tvDescription;
    ImageView tvRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        ArrayList<Movie> alMovie = (ArrayList<Movie>)bundle.getSerializable("test");

        tvTitle = findViewById(R.id.textViewTitle);
        tvDetail = findViewById(R.id.textViewDescription);
        tvRating =findViewById(R.id.imageViewRating);

        tvWatched = findViewById(R.id.textViewWatchOn);
        tvTheatre = findViewById(R.id.textViewTheatre);
        tvDescription = findViewById(R.id.textViewDescription1);



    }
}
