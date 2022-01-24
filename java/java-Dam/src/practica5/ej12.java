package practica5;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int minimo, maximo;
        int numAdivinar=0;
        System.out.println("Bienvenido al juego ADIVINA EL NÚMERO");
        System.out.println("Ingresa el número mínimo:");
        minimo= input.nextInt();
        System.out.println("Ingresa el número máximo: ");
        maximo= input.nextInt();
        int contador=0;
        while (numAdivinar>maximo || numAdivinar<minimo ){
            double num= Math.random()*100;
            numAdivinar=(int) num;
        }

       // System.out.println("numero "+numAdivinar);
        System.out.println("Piensa en un número entre el "+minimo+" y "+maximo+". Yo intentare adivinarlo.\nIngresa MAYOR si me he pasado, ingresa MENOR si me he quedado corto e ingresa IGUAL y he acertado :) ");
        int intento=0;
        String respuesta="";
        do{
            while (intento>maximo || intento<minimo ){
                double num= Math.random()*100;
                numAdivinar=(int) num;
            }
            System.out.println("¿Es el número "+intento);
            respuesta=input.nextLine();
            if (respuesta.equalsIgnoreCase("mayor")){
                minimo=intento;
            }else if (respuesta.equalsIgnoreCase("menor")){
                maximo=intento;
            }else{
                System.out.println("Lo he conseguido!!!!");
            }
        
        }while(respuesta.equalsIgnoreCase("igual")==false);

    }
    
}

