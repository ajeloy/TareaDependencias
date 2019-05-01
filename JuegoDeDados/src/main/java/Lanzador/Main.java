
package Lanzador;

import Controlador.Dado;
import Controlador.Juego;

/**
 *
 * @author ALEX
 */
public class Main {
    public static void main (String [] args){
        Juego juego = new Juego();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        juego.iniciar(dado1, dado2,"¿Quieres iniciar el juego?");
    }
}
