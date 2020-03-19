package com.example.bagusputra.pokemonusers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Pokemonitemadapter extends RecyclerView.Adapter<Pokemonitemadapter.ViewHolder> implements Filterable {
    private List<Pokemonitem> items;
    private Context context;


    public Pokemonitemadapter(Context applicationContext, List<Pokemonitem> itemArrayList) {
        this.context = applicationContext;
        this.items = itemArrayList;

    }

    @Override
    public Pokemonitemadapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_pokemonuser, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Pokemonitemadapter.ViewHolder viewHolder, int i) {
        viewHolder.pokemontitle.setText(items.get(i).getLogin());

        Picasso.with(context)
                .load(items.get(i).getAvatarUrl())
                .into(viewHolder.pokemonimage);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pokemontitle;
        private ImageView pokemonimage;


        public ViewHolder(View view) {
            super(view);
            pokemontitle = (TextView) view.findViewById(R.id.rowtitle);
            pokemonimage = (ImageView) view.findViewById(R.id.rowimage);
        }
    }

}
