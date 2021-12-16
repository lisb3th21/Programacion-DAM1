package practica1;
import java.util.Scanner;

//De grados centigrados a fatenheit 
public class ej2 {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingresa los grados Centigrados que deseas convertir: ");
        float centigrados= entrada.nextFloat();
        System.out.println(centigrados+" ºC son "+ ((centigrados*(9f/5f))+32f)+ " ºF");
entrada.close();
    }
    
}


