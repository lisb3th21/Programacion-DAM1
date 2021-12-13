package practica4;

import java.util.Scanner;

//Escribe un programa que pida la altura y ancho de un rectángulo y lo dibuje
public class ej5 {
    static void dibujo(int h, int b){
        for (int i=0;i<h; i++ ){
            System.out.println("");
            for (int j=0; j<b; j++){
                System.out.print("# ");

            }
        }

    }
    public static void main(String[] args) {
        Scanner entrada1=new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo:");
        int h= entrada1.nextInt();

        Scanner entrada2=new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        int b= entrada2.nextInt();

        entrada1.close();
        entrada2.close();
        dibujo(h, b);
    }

    
    
}
