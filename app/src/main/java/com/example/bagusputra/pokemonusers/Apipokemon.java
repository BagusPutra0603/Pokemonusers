package com.example.bagusputra.pokemonusers;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apipokemon {

    @GET("search/users?q=pokemon")
    Call<Pokemonitemrespon> getItems();

}
