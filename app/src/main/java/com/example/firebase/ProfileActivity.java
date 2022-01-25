package com.example.firebase;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firebase.model.Constants;
import com.example.firebase.model.MovieResponse;
import com.example.firebase.model.Result;
import com.example.firebase.retrofit.ApiService;
import com.example.firebase.retrofit.RetrofitClient;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {

    public static final String TAG = ProfileActivity.class.getSimpleName();
    private MovieAdapter adapter;
    private List<Result>movies;
    private RecyclerView recyclerView;
    TextView textTop, textPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        textPopular = findViewById(R.id.text_popular);

        getPopularMovies();
    }

    private void getPopularMovies(){
        ApiService service = RetrofitClient.getRetrofitClient().create(ApiService.class);
        Call<MovieResponse>call = service.getPopularMovies(Constants.API_KEY);
        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                MovieResponse movieResponse = response.body();
                movies = movieResponse.getResults();
                initRecyclerView();
            }
            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                Toast.makeText(ProfileActivity.this, TAG + "erreur fetching movies", Toast.LENGTH_LONG).show();
            }
        });
    }


    private void initRecyclerView(){
        recyclerView = findViewById(R.id.recycler);
        adapter = new MovieAdapter(this, movies);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new MovieAdapter.OnClickListener() {
            @Override
            public void OnItemClick(int position) {
                Toast.makeText(ProfileActivity.this, "Clicked at position: " + position, Toast.LENGTH_LONG).show();
                Result result = movies.get(position);
                Intent intent = new Intent(ProfileActivity.this, MovieActivity.class);
                intent.putExtra(MovieActivity.KEY_MOVIE, result);
                startActivity(intent);
            }
        });
        adapter.notifyDataSetChanged();
    }



}

