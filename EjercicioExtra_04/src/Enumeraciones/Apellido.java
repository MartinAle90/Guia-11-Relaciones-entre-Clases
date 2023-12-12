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
public enum Apellido {
GONZALES,PEREZ,FERNANDEZ,LOPEZ,RODRIGUEZ,MARTINEZ,DIAZ,GARCIA,SANCHEZ,ROMERO;

    private static final Random PRNG = new Random();

    public static Apellido randomApellidos() {
        Apellido[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
