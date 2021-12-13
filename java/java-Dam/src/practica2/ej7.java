package practica2;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        //Pida al usuario tres número que serán el día, mes y año. Comprueba que la fecha introducida es válida. 


        Scanner entradaDia= new Scanner(System.in);

        Scanner entradaMes= new Scanner(System.in);

        Scanner entradaAño= new Scanner(System.in); 

        System.out.println("Ingrese un día: ");
        int dia = entradaDia.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = entradaMes.nextInt();
        System.out.println("Ingrese un año: ");
        int año = entradaAño.nextInt();
        String verdad="La fecha es verdadera";
        String falso="La fecha es falsa";

entradaDia.close();
entradaAño.close();
entradaMes.close();

        if (dia<31 && dia>0){
            switch (mes){
                case 1: System.out.println(verdad);
                break; 

                case 2: 

                if (año%4==0 && dia<=29){
                    System.out.println(verdad);
                }
                else{
                    System.out.println(falso);
                }
                break;
                case 3: System.out.println(verdad);
                break;

                case 4:
                if (dia>30){
                    System.out.println(falso);
                }
                else{
                    System.out.println(verdad);
                }
                break;
                case 5: System.out.println(verdad);
                break;
                case 6: 
                if (dia>30){
                    System.out.println(falso);
                }
                else{
                    System.out.println(verdad);
                }
                break;
                case 7: System.out.println(verdad);
                break;
                case 8: System.out.println(verdad);
                break;
                case 9: 
                if (dia>30){
                    System.out.println(falso);
                }
                else{
                    System.out.println(verdad);
                }
                break;
                case 10: System.out.println(verdad);
                break;
                case 11: if (dia>30){
                    System.out.println(falso);
                }
                else{
                    System.out.println(verdad);
                }
                break;
                case 12: System.out.println(verdad);
                break;

                default: System.out.println(falso);
            }
        }
        else{
            System.out.println(falso);
        }



    }
    
}
