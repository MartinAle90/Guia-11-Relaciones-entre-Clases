/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
public class Revolver {

//    private final int posicionActual = (int) (Math.random() * (0 - 6)) +6;
//    private final int posicionAgua = (int) (Math.random() * (0 - 6)) + 6;
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    public void llenarRevolver() {
        setPosicionActual((int) (Math.random() * (0 - 6)) + 6);
        setPosicionAgua((int) (Math.random() * (0 - 6)) + 6);
    }

    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        return getPosicionActual() == getPosicionAgua();
    }

    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        if (mojar() == false) {
            if (getPosicionActual() < 6) {
                setPosicionActual(getPosicionActual() + 1);
            } else if (getPosicionActual() == 6) {
                setPosicionActual(1);
            }
        }
    }

    //• toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua +  "}";
    }

}
