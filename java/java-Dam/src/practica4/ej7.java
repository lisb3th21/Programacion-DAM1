package practica4;

import java.util.Scanner;

//Escribe un programa que pida la altura de un triángulo y lo dibuje al reves
public class ej7 {
    static void triangulo( int altura){

        for (int i=altura; i>0; i--){
            String resultado= new String(new char[i]).replace("\0", "# ");
            System.out.println(resultado);
        }
    }
    public static void main(String[] args) {
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo:");

        int altura= entrada1.nextInt();
        triangulo(altura);
        entrada1.close();
    }
    
}
