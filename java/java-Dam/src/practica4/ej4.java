package practica4;
import java.util.Scanner;
public class ej4 {
    static int factorial(int num){
        int resultado=1;
        for (int i=num; i>0; i--){
            resultado*=i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese el numero que desea calcular el factorial: ");
        int num= entrada1.nextInt();
        int resultado= factorial(num);
        System.out.print("El factorial de "+ num+" es "+resultado);
        entrada1.close();
    }
}
