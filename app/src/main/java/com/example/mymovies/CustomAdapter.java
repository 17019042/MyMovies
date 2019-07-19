package com.example.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> MovieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        MovieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);
        TextView  tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView  tvDescription = rowView.findViewById(R.id.textViewDescription);

        Movie currentItem = MovieList.get(position);

        tvTitle.setText(currentItem.getTitle());

        tvDescription.setText(currentItem.getYear()
                + "-"
                + currentItem.getGenre());

        if( currentItem.getRated().equals("g")){
            ivRating.setImageResource(R.drawable.rating_g);
        }
        else if (currentItem.getRated().equals("pg")){
            ivRating.setImageResource(R.drawable.rating_pg);
        }
        else if (currentItem.getRated().equals("pg13")){
            ivRating.setImageResource(R.drawable.rating_pg13);
        }
        else if (currentItem.getRated().equals("nc16")){
            ivRating.setImageResource(R.drawable.rating_nc16);
        }
        else if (currentItem.getRated().equals("m18")){
            ivRating.setImageResource(R.drawable.rating_m18);
        }
        else if (currentItem.getRated().equals("r21")){
            ivRating.setImageResource(R.drawable.rating_r21);
        }
        else{

        }






        return rowView;
    }






}
