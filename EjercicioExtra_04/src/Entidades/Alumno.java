/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

public class Alumno implements Comparator<Alumno> {

    private String nombreCompleto;
    private Integer DNI;
    private int cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return nombreCompleto + "\nDNI: " + DNI + "\nCantidad de votos: " + cantidadVotos + "\n";
    }

    @Override
    public int compare(Alumno alumno1, Alumno alumno2) {
        return alumno2.cantidadVotos - (alumno1.cantidadVotos);
    }

}