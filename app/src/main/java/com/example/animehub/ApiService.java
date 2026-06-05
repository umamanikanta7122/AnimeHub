package com.example.animehub;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("top/anime?limit=20")
    Call<AnimeResponse> getTopAnime();
}