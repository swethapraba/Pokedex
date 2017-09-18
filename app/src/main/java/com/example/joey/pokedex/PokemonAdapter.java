package com.example.joey.pokedex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by joey on 9/17/17.
 */

public class PokemonAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<Pokedex.Pokemon> pokemons = new ArrayList<>();

    //need to update with information
    public PokemonAdapter(Context context, ArrayList<Pokedex.Pokemon> pokemons){
        this.context = context;
        this.pokemons = new ArrayList<Pokedex.Pokemon>(pokemons);
    }

    public PokemonAdapter.PokemonListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_row, parent, false);
        return new PokemonListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PokemonListViewHolder holder, int position) {
        Pokedex.Pokemon pokemon = pokemons.get(position);
        holder.pokemonName.setText(pokemon.name);

    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    class PokemonListViewHolder extends RecyclerView.ViewHolder{
        TextView pokemonName;
        ImageView portrait;

        public PokemonListViewHolder(View v){
            super(v);
            pokemonName = (TextView) v.findViewById(R.id.pokemonName);
            portrait = (ImageView) v.findViewById(R.id.profile);
        }


    }
}
