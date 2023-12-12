/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.CartaPalo;

//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podrá realizar la baraja son:

public class Carta {
    private int numeroCarta;
    private CartaPalo paloCarta;

    public Carta() {
    }

    public Carta(int numeroCarta, CartaPalo paloCarta) {
        this.numeroCarta = numeroCarta;
        this.paloCarta = paloCarta;
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(int numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public CartaPalo getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(CartaPalo paloCarta) {
        this.paloCarta = paloCarta;
    }

    
    
    
    @Override
    public String toString() {
        return "Carta{" + "numeroCarta=" + numeroCarta + ", paloCarta=" + paloCarta +'}' +'\n';
    }
    

    
    
}
