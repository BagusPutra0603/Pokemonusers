package com.example.bagusputra.pokemonusers;

import android.app.ProgressDialog;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

//    private Pokemonitem pokemonitem;
//    ProgressDialog pd;
//    private SwipeRefreshLayout swipeContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Retrofitbase Retrofitbase = new Retrofitbase();
        Apipokemon apiService =
                Retrofitbase.getClient().create(Apipokemon.class);
        Call<Pokemonitemrespon> call = apiService.getItems();
        call.enqueue(new Callback<Pokemonitemrespon>() {
            @Override
            public void onResponse(Call<Pokemonitemrespon> call, Response<Pokemonitemrespon> response) {
                List<Pokemonitem> items = response.body().getItems();
                recyclerView.setAdapter(new Pokemonitemadapter(getApplicationContext(), items));
            }

            @Override
            public void onFailure(Call<Pokemonitemrespon> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Cannot get API Data", Toast.LENGTH_SHORT).show();
            }
        });

    }

}


