package practica1;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args){
        /*Programa para calcular el area de un triangulo*/

        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Ingresa la base: ");
        int base = entrada.nextInt();
        System.out.println("Ingresa la altura: ");
        int altura= entrada1.nextInt();

        System.out.println("El área del triangulo es "+(base*altura)/2 );
        

    }
    
}
