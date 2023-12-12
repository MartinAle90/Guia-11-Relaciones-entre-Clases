/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Martin
 */
public enum NombreProducto {
    PAPA, TOMATE, CEBOLLA, ZAPALLO, ZANAHORIA,
     ZAPALLITO, LECHUGA, PIMIENTO, CHOCLO, BERENJENA,
     NARANJA, BANANA, MANZANA, MANDARINA, PERA,
     LIMON, UVA, DURAZNO, CIRUELA, MELON;
    
     public int size(){
         int tamanio;
         tamanio=NombreProducto.values().length;
         return tamanio;
     }
}
