
package Controlador;

/**
 *
 * @author ALEX
 */
import java.util.Scanner;
public class Juego {
    
    public void iniciar(Dado dado1, Dado dado2, String mensaje){
        int indicador;
        do{
            indicador = preguntar(mensaje);
        }while(indicador != 1 && indicador != 2);
        if(validarEleccion(indicador)){
            boolean resultado = empezarRonda(dado1, dado2);
            mostrarResultado(resultado);
            iniciar(dado1,  dado2, "¿Quieres jugar otra ronda?");
        }
    }
    
    public boolean empezarRonda (Dado dado1, Dado dado2){
        dado1.lanzarDado();
        dado2.lanzarDado();
        mostrarCarasResultantes(dado1, dado2);
        int resultado = dado1.getCaraVisible() + dado2.getCaraVisible();
        if (resultado == 7){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int preguntar (String mensaje){
        int eleccion;
        Scanner leer = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.println("1.- Si");
        System.out.println("2.- No");
        try{
            eleccion = leer.nextInt();
            if (eleccion != 1 && eleccion != 2){
                System.out.println("Introduzca una opción válida por favor");
            }
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Introduzca un número entero por favor.");
            eleccion = -1;
        }
        return eleccion;
    }
    
    public boolean validarEleccion(int eleccion){
        switch(eleccion){
            case 1:
                return true;
            default:
                return false;
        }
    }
    
    public void mostrarResultado(boolean resultado){
        if(resultado){
            System.out.println("Has ganado");
        }
        else{
            System.out.println("Has perdido");
        }
    }
    
    public void mostrarCarasResultantes(Dado dado1, Dado dado2){
        System.out.println("El resultado del primer dado fue: "+dado1.getCaraVisible());
        System.out.println("El resultado del segundo dado fue: "+dado2.getCaraVisible());
    }
}
