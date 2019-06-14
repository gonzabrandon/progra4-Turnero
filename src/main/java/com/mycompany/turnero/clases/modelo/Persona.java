package com.mycompany.turnero.clases.modelo;

import java.lang.Override;
import java.lang.String;
import java.lang.String;


public class Persona {
    int id;
    String  nombre;
    String apellido;
    
    public Persona(String nom,String ape){
        this.nombre=nom;
        this.apellido=ape;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
