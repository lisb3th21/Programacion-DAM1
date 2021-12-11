package practica3;

import java.util.Scanner;

//Pida al usuario 5 números y diga cuál es el mayor y cuál el menor.
public class ej1 {
    public static void main(String[] args) {
        
        Scanner entrada1=new Scanner(System.in);
        
        Scanner entrada2=new Scanner(System.in);
        
        Scanner entrada3=new Scanner(System.in);
        
        Scanner entrada4=new Scanner(System.in);
        
        Scanner entrada5=new Scanner(System.in);

        System.out.println("ingrese un número: ");
        int num1= entrada1.nextInt();
        
        System.out.println("ingrese un número: ");
        int num2= entrada2.nextInt();

        System.out.println("ingrese un número: ");
        int num3= entrada3.nextInt();

        System.out.println("ingrese un número: ");
        int num4= entrada4.nextInt();

        System.out.println("ingrese un número: ");
        int num5= entrada5.nextInt();

        //Pongo el igual por si el usuario ingresa dos numeros iguales, el programa no tendra un error 
        if (num1>=num2 && num1>=num3 && num1>=num4 && num1>=num5){
            System.out.println("El numero "+num1+" es mayor");
        }else if(num2>=num1  && num2>=num3 && num2>=num4 && num2>=num5 ){
            System.out.println("El numero "+num2+" es mayor");
        }else if(num3>=num1  && num3>=num2 && num3>=num4 && num3>=num5 ){
            System.out.println("El numero "+num3+" es mayor");
        }else if(num4>=num1  && num4>=num2 && num4>=num3 && num4>=num5 ){
            System.out.println("El numero "+num4+" es mayor");
        }else if(num5>=num1  && num5>=num2 && num5>=num3 && num5>=num4 ){
            System.out.println("El numero "+num5+" es mayor");
        }

        entrada1.close();
        entrada2.close();
        entrada3.close();
        entrada4.close();
        entrada5.close();
    }
    
}
