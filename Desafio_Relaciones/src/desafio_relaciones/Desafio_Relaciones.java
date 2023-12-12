/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_relaciones;

import Entidades.Producto;
import Servicios.ServicioProducto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Desafio_Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioProducto sp = new ServicioProducto();

        ArrayList<Producto> listaProductos1 = new ArrayList<>();
        listaProductos1 = sp.generarListaProductos();
        ArrayList<Producto> listaProductos2 = new ArrayList<>();
        listaProductos2 = sp.generarListaProductos();
        ArrayList<Producto> listaProductos3 = new ArrayList<>();
        listaProductos3 = sp.generarListaProductos();



    }

}
