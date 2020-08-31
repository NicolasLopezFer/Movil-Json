package com.example.mainactivity.model;

public class Pais {
    String capital;
    String nombre;

    public Pais(String capital, String nombre) {
        this.capital = capital;
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "capital='" + capital + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
