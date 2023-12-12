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
public enum Nombre {
PEDRO, PABLO, JUAN, ANA, MARIA, JACOBO, EVA, RUT, PANCRACIO, MACARIO;   

    private static final Random PRNG = new Random();

    public static Nombre randomNombres() {
        Nombre[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
