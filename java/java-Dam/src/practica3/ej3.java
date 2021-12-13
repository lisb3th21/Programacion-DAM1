package practica3;
//Pida al usuario si quiere calcular el área de un triángulo o un cuadrado, y pida los datos según que caso y muestre el resultado.


import java.util.Scanner;

import javax.swing.JOptionPane;



public class ej3{
    public static void main(String[] args) {
        
        Scanner opcion=new Scanner(System.in);

        System.out.println("Seleccione una opcion: \n1. Trianulo\n2. Cuadrado");
        int opcion1= opcion.nextInt();

        switch (opcion1){
            case 1:
                int base, altura;

                Scanner b=new Scanner(System.in);
                System.out.println("Ingrese la base del triangulo: ");

                base=b.nextInt();
                Scanner h=new Scanner(System.in);
                System.out.println("Ingrese la altura del triangulo: ");

                altura=h.nextInt();

                JOptionPane.showMessageDialog(null, "El área del triangulo es de "+ (base*altura)/2 + " cm");
                break; 

            case 2:
                int lado;

                Scanner l=new Scanner(System.in);
                System.out.println("Ingrese el lado del cuadrado ");
                lado=l.nextInt();
                JOptionPane.showMessageDialog(null, "El área del cuadrado es de "+ (lado*lado) + " cm");
                break;
            default: JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            
        }
        opcion.close();
    }
}