package com.rockbass.rickandmortyapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Character {
    @GET("character")
    Call<ResultCharacter> getCharacters( @Query("page") int page);
}
