package clases;


import org.example.Heroe;

public class Villano {
    /*--------------------------------------------------------------
    Atributos
    --------------------------------------------------------------*/
    public String nombre;
    public int poder;
    public Heroe heroe;

    /*--------------------------------------------------------------
    Método ordinario
    --------------------------------------------------------------*/
    public int destruir() {
        int resultado = this.poder - this.heroe.poder;
        return resultado;
    }



}
