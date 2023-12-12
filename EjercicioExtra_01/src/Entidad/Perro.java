/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos

import Enumeraciones.RazaPerro;
import Enumeraciones.TamanioPerro;

//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

public class Perro {
    
    private String nombrePerro;
    private RazaPerro razaPerro;
    private int edadPerro;
    private TamanioPerro tamanioPerro;
    private Persona duenio;

    public Perro() {
    }

    public Perro(String nombrePerro, RazaPerro razaPerro, int edadPerro, TamanioPerro tamanioPerro) {
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.edadPerro = edadPerro;
        this.tamanioPerro = tamanioPerro;

    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public RazaPerro getRazaPerro() {
        return razaPerro;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public void setRazaPerro(RazaPerro razaPerro) {
        this.razaPerro = razaPerro;
    }

    public int getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }

    public TamanioPerro getTamanioPerro() {
        return tamanioPerro;
    }

    public void setTamanioPerro(TamanioPerro tamanioPerro) {
        this.tamanioPerro = tamanioPerro;
    }

    @Override
    public String toString() {
        if (duenio == null) {
            return "Perro{" + "nombrePerro=" + nombrePerro + ", razaPerro=" + razaPerro + ", edadPerro=" + edadPerro + ", tamanioPerro=" + tamanioPerro + ", Sin dueño" + '}';
        }
        return "Perro{" + "nombrePerro=" + nombrePerro + ", razaPerro=" + razaPerro + ", edadPerro=" + edadPerro + ", tamanioPerro=" + tamanioPerro + ", duenio=" + duenio.getNombrePersona()+ '}';
    }



   

    
    
    
    
}
