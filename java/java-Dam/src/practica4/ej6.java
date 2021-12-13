package practica4;

import java.util.Scanner;

public class ej6 {

    static void triangulo(int altura){

        for (int i=0; i<=altura; i++){
            String resultado=new String(new char[i]).replace("\0", "#");
            System.out.println(resultado);
        }
    }
    public static void main(String[] args) {
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo: ");
        int altura= entrada1.nextInt();
        triangulo(altura);
    }
}
