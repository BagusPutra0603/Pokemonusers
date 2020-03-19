package com.example.bagusputra.pokemonusers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemonitemrespon {

    @SerializedName("items")
    @Expose
    private List<Pokemonitem> items;

    public List<Pokemonitem> getItems(){
        return items;
    }
    public void setItems(List<Pokemonitem>items){
        this.items = items;
    }

}
