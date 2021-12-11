package practica1;
import java.util.Scanner;

public class ej3 {

    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere analizar: ");
        int num= entrada.nextInt();
entrada.close();
        if (num%2==0) {
            System.out.println("El número "+ num+" es par.");

        }
        else{
            System.out.println("El número "+ num+" es impar");
        }

    }

}
