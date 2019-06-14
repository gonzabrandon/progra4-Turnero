/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turnero.clases.modelo;
import javax.persistence.Id;
import javax.persistence.column;


/**
 * @author Brandon Carvajal
 */
@Entity
public class Servicio {
    
    @Id
    private String sigla;
    @column
    private String nombre;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
