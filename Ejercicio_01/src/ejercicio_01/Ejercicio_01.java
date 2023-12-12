/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01;

import Entidad.Perro;
import Entidad.Persona;
import Enumeraciones.RazaPerro;
import Enumeraciones.TamanioPerro;

/**
 *
 * @author Martin
 */
public class Ejercicio_01 {

//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
    public static void main(String[] args) {

        Perro m1 = new Perro("Jamon", RazaPerro.randomRazaPerro(), 5, TamanioPerro.randomTamanio());
        Perro m2 = new Perro("Coco", RazaPerro.randomRazaPerro(), 3, TamanioPerro.randomTamanio());
        
        Persona p1 = new Persona("Martin", "Angel", 33, 123456789, m1);
        Persona p2 = new Persona("Nicolas", "Angel", 35, 987654321, m2);
        
        System.out.println(p1);
        
        System.out.println(p2);

    }

}
