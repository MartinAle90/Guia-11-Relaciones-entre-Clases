/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_02 {

//Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
//un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
//se dispara y se moja.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Revolver r = new Revolver();
        Juego game = new Juego();
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        r.llenarRevolver();
        System.out.println("Cuantos jugadores son (1 a 6)");
        int num = leer.nextInt();
        if (num <1 || num > 6) {
            System.out.println("Cantidad de jugadores incorrecta");
            System.out.println("Jugadores por defecto 6");
            for (int i = 1; i < 7; i++) {
                Jugador j = new Jugador();
                j.setNombre("Jugador " + i);
                j.setId(i);
                j.setMojado(false);
                listajugadores.add(j);
            }
        }else{
            for (int i = 1; i < num+1; i++) {
                Jugador j = new Jugador();
                j.setNombre("Jugador " + i);
                j.setId(i);
                j.setMojado(false);
                listajugadores.add(j);
            }
        }
        
        System.out.println(r.toString());
        System.out.println("");
        System.out.println("***** Que Empiece El Juego *****");

        game.llenarJuego(listajugadores, r);
        game.ronda();

        System.out.println("********* Fin del Juego *********");
    }

}
