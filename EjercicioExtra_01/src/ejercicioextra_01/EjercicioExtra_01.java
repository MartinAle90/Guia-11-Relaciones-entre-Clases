/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_01;

import Entidad.Perro;
import Entidad.Persona;
import Enumeraciones.RazaPerro;
import Enumeraciones.TamanioPerro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_01 {

//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Perro> listaPerros = new ArrayList<>();

    public static void main(String[] args) {

//        ArrayList<Perro>  listaPerros = new ArrayList<>();
        Perro m1 = new Perro("Jamon", RazaPerro.randomRazaPerro(), 5, TamanioPerro.randomTamanio());
        Perro m2 = new Perro("Coco", RazaPerro.randomRazaPerro(), 3, TamanioPerro.randomTamanio());
        Perro m3 = new Perro("Vladimir", RazaPerro.randomRazaPerro(), 4, TamanioPerro.randomTamanio());
        Perro m4 = new Perro("Peron", RazaPerro.randomRazaPerro(), 3, TamanioPerro.randomTamanio());
        listaPerros.add(m1);
        listaPerros.add(m2);
        listaPerros.add(m3);
        listaPerros.add(m4);
        Persona p1 = new Persona("Martin", "Angel", 33, 123456789);
        Persona p2 = new Persona("Nicolas", "Angel", 35, 987654321);

        adoptar(p1);
        adoptar(p2);

        System.out.println(p1);

        System.out.println(p2);

    }

    public static void adoptar(Persona persona1) {

        System.out.println("Lista de perros sin dueño");
        for (Perro p : listaPerros) {
            if (p.getDuenio() == null) {
                System.out.println(p.toString());
            }
        }
        Perro auxPerro = new Perro();
        String nombrePerro;
        do {
            System.out.println("ingrese el nombre del perro a adoptar");
            nombrePerro = leer.next();
            auxPerro = buscarPerro(nombrePerro);
            if (auxPerro == null) {
                System.out.println("nombre perro mal ingresado");
            }
        } while (auxPerro == null);
        persona1.setPerro(auxPerro);
        for (Perro p : listaPerros) {
            if (auxPerro == p) {
                p.setDuenio(persona1);
            }
        }

    }

    private static Perro buscarPerro(String nombreBuscado) {

        for (Perro p : listaPerros) {
            if (p.getNombrePerro().equalsIgnoreCase(nombreBuscado)) {
                return p;
            }
        }
        return null;
//        Iterator<Perro> it = listaPerros.iterator();
//        while (it.hasNext()) {
//            if (it.next().getNombrePerro().equalsIgnoreCase(nombreBuscado)) {
//                return it.;
//            }
//        }
//        return null;
//    }

    
    }
}
