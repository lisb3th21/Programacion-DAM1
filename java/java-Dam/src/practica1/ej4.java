package practica1;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args){
        Scanner entrada1= new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        float a= entrada1.nextFloat();
        Scanner entrada2= new Scanner(System.in);
        System.out.print("Ingrese el segundo numero: ");
        float b= entrada2.nextFloat();

        if (a>b){
            System.out.println("El numero "+ a+ " es mayor que "+ b);
        }
        else{
            System.out.println("El numero "+ b+ " es mayor que "+ a);

        }

    }
    
}
