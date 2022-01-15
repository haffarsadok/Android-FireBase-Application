package com.example.firebase;



import retrofit2.Call;
import retrofit2.http.GET;


public interface MoviesApiService {
    @GET("/movie/popular")
    Call<Movie> getPopularMovies(String cb);
}
