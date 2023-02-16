package org.example;

import clases.Villano;
import org.example.paquetico.Pareja;

public class CuartelGeneral {
    public static void main(String[] args) {

        // Ahora que tenemos los moldes creados, vamos a crear un heroe, un villano
        Heroe heroe = new Heroe();// No se tuvo que importar por que esta en el mismo paquete

        // Use de SET:  para modificar nombre y poder
        heroe.setNombre("Batman");
        heroe.setPoder(99);

        // Uso de GET para imprimir nombre y poder del heroe
        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPoder());


        Villano villano = new Villano();



        Pareja pareja = new Pareja("David Villegas");





    }
}