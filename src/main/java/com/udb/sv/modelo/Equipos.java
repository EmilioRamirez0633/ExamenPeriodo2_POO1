/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udb.sv.modelo;

/**
 *
 * @author Estudiante
 */
public class Equipos {
    private int CodiEqui;
    private String nombreEqui;
    private String descEqui;
    private byte[] img;

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
   
    public int getCodiEqui() {
        return CodiEqui;
    }

    public void setCodiEqui(int CodiEqui) {
        this.CodiEqui = CodiEqui;
    }

    public String getNombreEqui() {
        return nombreEqui;
    }

    public void setNombreEqui(String nombreEqui) {
        this.nombreEqui = nombreEqui;
    }

    public String getDescEqui() {
        return descEqui;
    }

    public void setDescEqui(String descEqui) {
        this.descEqui = descEqui;
    }

    public Equipos(int CodiEqui, String nombreEqui, String descEqui,byte[] img) {
        this.CodiEqui = CodiEqui;
        this.nombreEqui = nombreEqui;
        this.descEqui = descEqui;
        this.img = img;
    }

    public Equipos() {
    }
    
    @Override
    public String toString() {
        return this.nombreEqui ;
    }
}
