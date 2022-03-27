package com.coursera.semana3.mascotas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar=(Toolbar)findViewById(R.id.miActionBar);
        myToolbar.setNavigationIcon(R.drawable.pata);
        ImageView star=new ImageView(this);
        star.setImageResource(R.drawable.cincoestrella);
        Toolbar.LayoutParams tbl=new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
        tbl.gravity= Gravity.END;
        star.setLayoutParams(tbl);
        myToolbar.addView(star);
        setSupportActionBar(myToolbar);

        star.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Vamos a favoritos", Toast.LENGTH_SHORT).show();
                Intent in=new Intent(MainActivity.this,MascotasFavoritas.class);
                startActivity(in);
            }
        });


        listaMascotas=(RecyclerView) findViewById(R.id.recyclerViewMascotas);
        LinearLayoutManager myLinearManager=new LinearLayoutManager(this);
        myLinearManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(myLinearManager);
        rellenaLista();
        inicializaAdaptador();
    }
    public void inicializaAdaptador(){
        AdaptadorMascotas adaptador=new AdaptadorMascotas(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
    public void rellenaLista(){
         mascotas=new ArrayList<Mascota>();
        mascotas.add(new Mascota(" Dog ",R.drawable.dog,0));
        mascotas.add(new Mascota(" Gato ",R.drawable.cat,0));
        mascotas.add(new Mascota(" Draco ",R.drawable.draco,0));
        mascotas.add(new Mascota(" Fluffy ",R.drawable.beast,0));
        mascotas.add(new Mascota(" Gizmo ",R.drawable.gremlin,0));
        mascotas.add(new Mascota(" Pluto ",R.drawable.pluto,0));
        mascotas.add(new Mascota(" Dino ",R.drawable.dino,0));
        mascotas.add(new Mascota(" Mimi ",R.drawable.warbeastpng,0));


    }
}