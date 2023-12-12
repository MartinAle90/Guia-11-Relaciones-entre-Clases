/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Carta;
import Enumeraciones.CartaPalo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCarta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int contCarta = -1;
    ArrayList<Carta> cartasQuitadas = new ArrayList<>();

    public void llenarPalo(ArrayList<Carta> baraja, CartaPalo palo) {
        for (int j = 1; j < 13; j++) {
            if (j == 8 || j == 9) {
            } else {
                Carta carta1 = new Carta(j, palo);
                baraja.add(carta1);
            }
        }
    }

//• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja);
    }

//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(ArrayList<Carta> baraja) {
        System.out.println(baraja);
    }

//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(ArrayList<Carta> baraja) {
        if (cartasQuitadas.size() >= 40) {
            System.out.println("No hay mas cartas");
        }
//        contCarta++;
//        cartasQuitadas.add(baraja.get(contCarta));
//        baraja.remove(0);
        return baraja.get(0);

    }

//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(ArrayList<Carta> baraja) {
        System.out.println("cartas disponibles " + baraja.size());
    }

//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas(ArrayList<Carta> baraja) {
        int bandera=0;
        cartasDisponibles(baraja);
        System.out.println("cuantas cartas quiere");
        int cuantasCartas;
        do {
            cuantasCartas = leer.nextInt();
            if (cuantasCartas <= baraja.size()) {
                bandera=baraja.size();
                for (int i = 0; i < cuantasCartas; i++) {
                    System.out.println(siguienteCarta(baraja));
                    cartasQuitadas.add(baraja.get(0));
                    baraja.remove(0);
                }
            } else {
                System.out.println("La cantidad de cartas es mayor a las disponibles");
                cartasDisponibles(baraja);
                System.out.println("cuantas cartas quiere");
            }
        } while (cuantasCartas > bandera);
    }
    
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(){
        if (cartasQuitadas.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
            
        }else{
            System.out.println("cartas que han salido");
             mostrarBaraja(cartasQuitadas);
        }
       
    }

}
