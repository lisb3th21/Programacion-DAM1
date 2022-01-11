package practica3;

import java.util.Scanner;

//Pida al usuario un importe en euros y diga si el cajero automático le 	puede dar dicho importe utilizando el mismo billete y el más grande 	(recuerda que el billete puede ser de 500, 200, 100, 50, 20, 10 y 5 	€).
 	

public class ej5 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingresa la cantidad que quieres retirar: ");
        
        int retiro= entrada.nextInt();

        if (retiro%500==0){
            int resto = retiro/500 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 500");
        }else if (retiro%200==0){
            int resto = retiro/200 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 200");
        } else if (retiro%100==0){
            int resto = retiro/100 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 100");
        }else if (retiro%50==0){
            int resto = retiro/50;

            System.out.println("Le devolveremos "+ resto+" billetes de 50");
        }else if (retiro%20==0){
            int resto = retiro/20 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 20");
        }else if (retiro%10==0){
            int resto = retiro/10 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 10");
        }else if (retiro%5==0){
            int resto = retiro/5 ;

            System.out.println("Le devolveremos "+ resto+" billetes de 5");
        }else {
            

            System.out.println("No podemor darle esa cantidad en mismos billetes");
        }
        
entrada.close();
    }
}
