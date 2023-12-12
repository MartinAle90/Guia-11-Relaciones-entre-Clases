/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Revolver;

//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
//Métodos:
public class ServicioRevolver {

    Revolver pistola = new Revolver();

//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    public void llenarRevolver() {
        pistola.setPosicionActual((int) (Math.random() * (0 - 6)) + 6);
        pistola.setPosicionAgua((int) (Math.random() * (0 - 6)) + 6);
    }

    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        return pistola.getPosicionActual() == pistola.getPosicionAgua();
    }
    
    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        if (mojar()==false) {
            if (pistola.getPosicionActual()<6) {
                pistola.setPosicionActual(pistola.getPosicionActual()+1);
            }else if(pistola.getPosicionActual()==6 ){
                pistola.setPosicionActual(1);
            }
         }
    }

    //• toString(): muestra información del revolver (posición actual y donde está el agua)
    public void mostrarRevolver() {
        System.out.println(pistola.toString());
    }

}
