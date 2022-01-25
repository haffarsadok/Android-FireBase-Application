package com.example.firebase;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.firebase.model.Constants;
import com.example.firebase.model.Result;
import androidx.appcompat.app.AppCompatActivity;


public class MovieActivity extends AppCompatActivity {

    public static final String KEY_MOVIE = "key_movie";

    TextView title, date, description, rating;
    ImageView imagePoster;
    private Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);


        imagePoster = findViewById(R.id.poster);
        title = findViewById(R.id.movieTitle);
        rating = findViewById(R.id.movierating);
        date = findViewById(R.id.movieDate);
        description = findViewById(R.id.movieDesc);

        result = getIntent().getParcelableExtra(KEY_MOVIE);
        String image = result.getPosterPath();
        String loadImage = Constants.IMAGE_URL_BASE_PATH + image;

        Glide.with(this).load(loadImage).into(imagePoster);

        getSupportActionBar().setTitle(result.getTitle());

        title.setText(result.getTitle());
        rating.setText(String.valueOf(result.getVoteAverage()));
        description.setText(result.getOverview());
        date.setText(result.getReleaseDate());
    }

}
