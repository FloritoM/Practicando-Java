package com.mycompany.proyecto_bar;

import java.util.Scanner;

public class Menu {

    private String nombre;
    private double precio;

    public Menu() {
    }

    public Menu(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "* " + this.nombre + " * Precio: " + this.precio;
      }

    
    
    
}
