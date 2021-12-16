package practica1;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args){
        /*Programa para calcular el area de un triangulo*/

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la base: ");
        float base = entrada.nextFloat();
        System.out.println("Ingresa la altura: ");
        float altura= entrada.nextFloat();
       
entrada.close();
        System.out.println("El área del triangulo es "+(base*altura)/2 );
        

    }
    
}
