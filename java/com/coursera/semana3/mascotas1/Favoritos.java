package com.coursera.semana3.mascotas1;

public class Favoritos {
    public String nombre,explicacion;
    public int foto;

    public Favoritos(String nombre, String explicacion, int foto) {
        this.nombre = nombre;
        this.explicacion = explicacion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
