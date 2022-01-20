package practica5;

import java.util.Scanner;

public class ej11 {
    int intentos=0;

    public static int numAdivinar(){
        double num = Math.random()*100;
        int numAdininar=(int) num;
        return numAdininar;
    }

    public static void main(String[] args) {
        int intentos=6;
        int prueba=0;
        System.out.println("ADIVINA EL NÚMERO");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario: ");
        String usuario=input.nextLine();
        System.out.println("Bienvenid@ "+usuario.toUpperCase() +"!\nEstoy pensando en un  número entre el 0 y el 100.\nIntenta adivinar el número en 6 intentos");
        int numAdivinar=numAdivinar();
System.out.println(numAdivinar);
        while (intentos>0 && numAdivinar!=prueba){
            System.out.println("\nIngrese un numero del 0 al 100: ");
            prueba=input.nextInt();
            if (prueba>100){
                intentos-=1;
                System.out.println("Es un número muy grande. El número que he escogido esta entre el 1 y 100.\nTe quedan "+intentos+" intentos");
            }else if (prueba<0){
                intentos-=1;
                System.out.println("Es un número muy pequeño. El número que he escogido esta entre el 1 y 100.\nTe quedan "+intentos+" intentos");
            }else if (prueba>numAdivinar){
                intentos-=1;
                System.out.println("Es un número muy grande. Intenta con uno más pequeño \nTe quedan "+intentos+" intentos");
            }else if (prueba<numAdivinar){
                intentos-=1;
                System.out.println("Es un número muy pequeño. Intenta con uno más pequeño \nTe quedan "+intentos+" intentos");
            }
        }
        if (prueba==numAdivinar){
            System.out.println("Lo has adivinado!!! \n Lo has conseguido en "+(7-intentos)+" intentos.");

        }else {
            System.out.println("GAME OVER");
        }
    }
    
}
