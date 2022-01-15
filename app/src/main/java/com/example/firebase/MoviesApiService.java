package com.example.firebase;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MoviesApiService {
    @GET("/movie/popular")
    Call<Movie> getPopularMovies(@Query("API_KEY") String API_KEY);
}
