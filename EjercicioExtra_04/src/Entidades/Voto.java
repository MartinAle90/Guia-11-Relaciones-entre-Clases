/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Voto {
    
    private Alumno votante;
    private ArrayList<Alumno> votados;

    public Voto() {
        votados = new ArrayList<Alumno>();
    }

    public Voto(Alumno votante, ArrayList<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Votante: " + votante + "\nVotados: " + votados;
    }
    
    
    
}
