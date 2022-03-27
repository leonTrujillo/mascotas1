package com.coursera.semana3.mascotas1;

import androidx.annotation.Nullable;

public class Mascota {
    public String nombre;
    public int foto,rating;

    public Mascota(String nombre, int foto,int rating) {
        this.nombre = nombre;
        this.foto = foto;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
