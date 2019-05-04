
package com.mycompany.turnero.clases;


public class persona {
    int id;
    char nombre;
    char apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getApellido() {
        return apellido;
    }

    public void setApellido(char apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
