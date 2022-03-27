package com.coursera.semana3.mascotas1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorFavoritos extends RecyclerView.Adapter<AdaptadorFavoritos.FavoritosViewHolder>{
    ArrayList<Favoritos> favoritasArrayList;
    Activity activity;

    public AdaptadorFavoritos(ArrayList<Favoritos> favoritasArrayList, Activity activity) {
        this.favoritasArrayList = favoritasArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public FavoritosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favoritos, parent, false);
        return new FavoritosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritosViewHolder holder, int position) {
                Favoritos favoritos=favoritasArrayList.get(position);
                holder.foto.setImageResource(favoritos.getFoto());
                holder.nombre.setText(favoritos.getNombre());
                holder.explicacion.setText(favoritos.getExplicacion());
    }

    @Override
    public int getItemCount() {
        return favoritasArrayList.size();
    }

    public static class FavoritosViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView nombre, explicacion;

        public FavoritosViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = (ImageView) itemView.findViewById(R.id.imgFavorito);
            nombre = (TextView) itemView.findViewById(R.id.nombreFavorito);
            explicacion = (TextView) itemView.findViewById(R.id.explicacionMascota);

        }
    }

}
