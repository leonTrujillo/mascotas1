package com.coursera.semana3.mascotas1;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorMascotas extends RecyclerView.Adapter<AdaptadorMascotas.MascotaViewHolder> {
    ArrayList<Mascota> mascotaArrayList;
    Activity activity;

    public AdaptadorMascotas(ArrayList<Mascota> mascotaArrayList, Activity activity) {
        this.mascotaArrayList = mascotaArrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mas = mascotaArrayList.get(position);
        mascotaViewHolder.foto.setImageResource(mas.getFoto());
        mascotaViewHolder.nombre.setText(mas.getNombre());
        mascotaViewHolder.rating.setText(String.valueOf(mas.getRating()));


        mascotaViewHolder.foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, mas.getNombre(), Toast.LENGTH_SHORT).show();
               /* Intent in=new Intent(activity,DetalleContacto.class);
                in.putExtra("foto",cont.getFoto());
                in.putExtra(activity.getResources().getString(R.string.nombre),cont.getNombre());
                in.putExtra(activity.getResources().getString(R.string.rating),cont.getTelefono());
                in.putExtra(activity.getResources().getString(R.string.texEmail),cont.getEmail());
                activity.startActivity(in);*/

            }
        });

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Has dado like a: " + mas.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        mascotaViewHolder.btnRate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Has puntuado a: " + mas.getNombre(), Toast.LENGTH_SHORT).show();
                mas.setRating(mas.getRating()+1);
                mascotaViewHolder.rating.setText(String.valueOf(mas.getRating()));

            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotaArrayList.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView  foto;
        private TextView nombre, rating;
        private ImageButton btnLike, btnRate;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = (ImageView) itemView.findViewById(R.id.imgFoto);
            nombre = (TextView) itemView.findViewById(R.id.suNombre);
            rating = (TextView) itemView.findViewById(R.id.suRating);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            btnRate = (ImageButton) itemView.findViewById(R.id.btnRate);
        }
    }
}
