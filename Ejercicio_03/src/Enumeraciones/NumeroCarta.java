/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

import java.util.Random;

/**
 *
 * @author Martin
 */
public enum NumeroCarta {
    UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, DIEZ, ONCE, DOCE;
    
         private static final Random PRNG = new Random();

    public static NumeroCarta randomNumeroCarta() {
        NumeroCarta[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
