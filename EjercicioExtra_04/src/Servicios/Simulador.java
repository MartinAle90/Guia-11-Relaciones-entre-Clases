/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import Entidades.Voto;
import Enumeraciones.Apellido;
import Enumeraciones.Nombre;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Simulador {

    public static ArrayList<Alumno> generadorAlumnos() {
        Scanner scann = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        System.out.println("Por favor ingrese el número de alumnos que desea generar:");
        int cantidadAlumnos = scann.nextInt();
        HashSet<Integer> listaDni = generadorDni(cantidadAlumnos);

        for (int i = 0; i < cantidadAlumnos; i++) {
            String nombre = String.valueOf(Nombre.values()[(int) (Math.random() * 10)]);
            String apellido = String.valueOf(Apellido.values()[(int) (Math.random() * 10)]);
            Integer dni = (Integer) listaDni.toArray()[i];
            listaAlumnos.add(new Alumno((nombre + " " + apellido), dni, 0));
        }

        return listaAlumnos;
    }

    public static HashSet<Integer> generadorDni(int cantidad) {
        HashSet<Integer> listaDni = new HashSet<>();
        int max = 99999999;
        int min = 10000000;

        while (listaDni.size() < cantidad) {
            listaDni.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }

        return listaDni;
    }

    public static ArrayList<Voto> votacion() {
        ArrayList<Alumno> listaAlumnos = generadorAlumnos();
        ArrayList<Voto> votos = new ArrayList<>();

        for (Alumno alumno : listaAlumnos) {
            Voto voto = new Voto();
            voto.setVotante(alumno);
            for (int i = 0; i < 3; i++) {
                Alumno alumnoVotado = listaAlumnos.get((int) (Math.random() * listaAlumnos.size()));
                if (!voto.getVotados().contains(alumnoVotado) && !alumno.equals(alumnoVotado)) {
                    voto.getVotados().add(alumnoVotado);
                    alumnoVotado.setCantidadVotos(alumnoVotado.getCantidadVotos() + 1);
                } else {
                    i--;
                }
            }
            votos.add(voto);
        }
        return votos;
    }
    
    
}
