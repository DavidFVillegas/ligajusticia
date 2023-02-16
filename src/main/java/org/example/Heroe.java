package org.example;

public class Heroe {
    /*--------------------------------------------------------------
    Atributos
    --------------------------------------------------------------*/
    //Variables globales
    public String nombre;
    public int poder = 100; // 0-100
    /*--------------------------------------------------------------
    Getters and Setters
    --------------------------------------------------------------*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if(poder >= 0 && poder <= 100) {
            this.poder = poder;
        } else {
            System.out.println("poder incorrecto");
        }
    }
    /*--------------------------------------------------------------
    Métodos especiales
    --------------------------------------------------------------*/

    // Constructor vacio
    public Heroe() {
    }

    // Constructor lleno
    public Heroe(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    /*--------------------------------------------------------------
    Métodos ordinarios
    --------------------------------------------------------------*/





    // Cualquier variable definida aquí es local
    public String saludar(String nombre) {
        return "Te vencere" + nombre;

    }




}
