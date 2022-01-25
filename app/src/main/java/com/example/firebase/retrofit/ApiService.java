package com.example.firebase.retrofit;

import com.example.firebase.model.Constants;
import com.example.firebase.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET(Constants.URL_POPULAR)
    Call<MovieResponse> getPopularMovies
            (@Query("api_key") String apiKey);


}
