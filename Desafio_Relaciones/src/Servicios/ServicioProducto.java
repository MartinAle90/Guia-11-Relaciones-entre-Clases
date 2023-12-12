/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import Enums.NombreProducto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto CrearProducto() {
        Producto product = new Producto();
        product.setNombreProducto(String.valueOf(NombreProducto.values()[(int) (Math.random() * NombreProducto.values().length)]));
        product.setPrecio((int) (Math.random() * (50 - 10 + 1)) + 10);
        return product;
    }

    public void MostrarProductos(Producto prodRecibido) {
        System.out.println(prodRecibido);
    }

    public void ModificarProducto(ArrayList listaProductos) {
        boolean band = true;
        ArrayList<Producto> listaAux = listaProductos;
        System.out.println("***Se modificara producto de forma aleatoria***");
        do {
            System.out.println("Nombre del producto que desea modificar");
            String prodAModif = leer.next();
            for (int i = 0; i < listaAux.size(); i++) {
                if (listaAux.get(i).getNombreProducto().equalsIgnoreCase(prodAModif)) {
                    do {
                        int cont = 0;
                        Producto prodAux = CrearProducto();
                        for (int j = 0; j < listaProductos.size(); j++) {
                            if (listaAux.get(j).getNombreProducto().equalsIgnoreCase(prodAux.getNombreProducto())) {
                                cont++;
                            }
                        }
                        if (cont == 0) {
                            listaAux.get(i).setNombreProducto(prodAux.getNombreProducto());
                            listaAux.get(i).setPrecio(prodAux.getPrecio());
                            band = false;
                        }
                    } while (band);
                }
            }
        } while (band);

    }

    public void EliminarProducto(ArrayList listaProductos) {

        ArrayList<Producto> listaAux = listaProductos;
        System.out.println("***Se eliminara un producto de la lista***");
        System.out.println("Nombre del producto a eliminar");
        String prodAModif = leer.next();
        for (int i = 0; i < listaAux.size(); i++) {
            if (listaAux.get(i).getNombreProducto().equalsIgnoreCase(prodAModif)) {
                listaAux.remove(i);
            } else {
                System.out.println("producto no encontrado");
            }

        }

    }

    public ArrayList<Producto> generarListaProductos() {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        boolean band;
        int cont;
        for (int i = 0; i < 10; i++) {
            band = true;
            do {
                cont = 0;
                Producto prodAux = CrearProducto();
                for (int j = 0; j < listaProductos.size(); j++) {
                    if (listaProductos.get(j).getNombreProducto().equalsIgnoreCase(prodAux.getNombreProducto())) {
                        cont++;
                    }
                }
                if (cont == 0) {
                    listaProductos.add(prodAux);
                    band = false;
                }
            } while (band);
        }
        return listaProductos;
    }

}
