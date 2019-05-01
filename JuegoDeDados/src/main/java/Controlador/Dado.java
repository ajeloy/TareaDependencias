
package Controlador;

/**
 *
 * @author ALEX
 */
import java.util.Random;
public class Dado {
    private int caraVisible;
    private int cantidadDeCaras;
    
    public Dado(){
        cantidadDeCaras = 6;
    }
    
    public void lanzarDado(){
        Random rNum = new Random();
        caraVisible = (int)rNum.nextInt(cantidadDeCaras)+1;
    }
    
    public int getCaraVisible(){
        return caraVisible;
    }
}
