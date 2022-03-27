package com.coursera.semana3.mascotas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
      private RecyclerView listaFavoritos;
      ArrayList<Favoritos>favorito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);

        Toolbar myToolbar=(Toolbar)findViewById(R.id.miActionBar);
        myToolbar.setNavigationIcon(R.drawable.atras);
        ImageView star=new ImageView(this);
        ImageView pata=new ImageView(this);
        star.setImageResource(R.drawable.cincoestrella);
        pata.setImageResource(R.drawable.pata);
        Toolbar.LayoutParams tbl=new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
        tbl.gravity= Gravity.END;
        star.setLayoutParams(tbl);
        myToolbar.addView(star);
        myToolbar.addView(pata);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaFavoritos=(RecyclerView) findViewById(R.id.favoritosRecycler);
        LinearLayoutManager myLinearManager=new LinearLayoutManager(this);
        myLinearManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaFavoritos.setLayoutManager(myLinearManager);
        rellenaLista();
        inicializaAdaptador();
    }

    public void inicializaAdaptador(){
        AdaptadorFavoritos adaptador=new AdaptadorFavoritos(favorito,this);
        listaFavoritos.setAdapter(adaptador);
    }
    public void rellenaLista(){
        favorito=new ArrayList<Favoritos>();
        favorito.add(new Favoritos(" Dog ","Un perro super simpatico",R.drawable.dog));
        favorito.add(new Favoritos(" Gato ","Es lo que ves...un gato",R.drawable.cat));
        favorito.add(new Favoritos(" Draco ","Monisimo ahora...ya veras cuando crezca!!",R.drawable.draco));
        favorito.add(new Favoritos(" Fluffy ","Pero tu lo has visto?? como te va a gustar eso???!!!",R.drawable.beast));
        favorito.add(new Favoritos(" Gizmo ","Un encanto...con sorpresa!!!",R.drawable.gremlin));


    }

}