/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_03;

import Entidades.Carta;
import Enumeraciones.CartaPalo;
import Servicios.ServicioCarta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Carta> baraja = new ArrayList<>();
        ServicioCarta sc = new ServicioCarta();

        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    sc.llenarPalo(baraja, CartaPalo.ESPADA);
                    break;
                case 2:
                    sc.llenarPalo(baraja, CartaPalo.BASTO);
                    break;
                case 3:
                    sc.llenarPalo(baraja, CartaPalo.COPA);
                    break;
                case 4:
                    sc.llenarPalo(baraja, CartaPalo.ORO);
                    break;
            }
        }

        sc.barajar(baraja);
//        sc.mostrarBaraja(baraja);

        sc.darCartas(baraja);
        sc.darCartas(baraja);
        sc.cartasDisponibles(baraja);
        sc.cartasMonton();
    }

}
