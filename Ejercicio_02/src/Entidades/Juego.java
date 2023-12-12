/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//10
    public void llenarJuego(ArrayList<Jugador> listajugadores, Revolver r) {
        setJugadores(listajugadores);
        setRevolver(r);
    }

//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda() {

        Collections.shuffle(jugadores);
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).disparo(revolver);
            System.out.println(jugadores.get(i));
            if (jugadores.get(i).isMojado()) {
                System.out.println("fue mojado");
                break;
            }
            System.out.println("sigue seco");
            if (i == jugadores.size() - 1) {
                i = -1;
            }
        }

    }

    @Override
    public String toString() {
        return "Juego{" + '\n' + "jugadores=" + jugadores + '\n' + "revolver=" + revolver + '}';
    }

}
