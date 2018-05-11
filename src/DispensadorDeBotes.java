/**
 * @author Alejandro Marco
 */
import java.util.*;
public class DispensadorDeBotes {

    private int botes; //Numero actual de botes.

    /* Inicializa el dispensador y pone i botes en él*/
    /* Entrada: int i, numero de botes en el dispensador*/
    /* Salidas: Ninguna */
    public void IniciarDispensadorDeBotes (int i){
        Scanner tec= new Scanner (System.in);
        System.out.println("Introduzca la cantidad de botes que va ha introducir en la maquina");
        i=tec.nextInt();
        botes=i;
    }
 
    /* Intenta dar un bote, devuelve true si es posible 
    y falso si no hay botes */
    /* Entrada: Ninguna */
    /* Salidas: bool, true si entrega el bote */
    public boolean PulsarBoton (){
        boolean bool=true;
        if (botes >0){
            bool=true;
            System.out.println("Dar bote");
            botes--;
        }
        else{
            bool=false;
            System.out.println("No quedan botes");
        }
        return bool;
    }

    /*Muestra el numero de botes disponibles en el dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int, el numero de botes */
    public int BotesDisponibles (){
        return botes;
    }
}


