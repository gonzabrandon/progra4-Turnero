/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turnero.clases.modelo;
import java.io.Serializable;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 *
 * @author Brandon Carvajal
 */
@Entity
public class Turno implements Serializable { //POJO - Plain Ild Java Object
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Servicio servicio;
    @Column
    private int secuencia;
    @Column
    private String usuario;  
    @ManyToOne
    private Modulo modulo;
    
}
