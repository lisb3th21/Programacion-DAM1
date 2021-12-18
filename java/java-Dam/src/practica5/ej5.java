package practica5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Escribe un programa que te pida números cada vez más grandes y que se
guarden en una lista. Para acabar de escribir los números, escribe un
número que no sea mayor que el anterior. El programa termina escribiendo la lista de números:
*/
public class ej5 {
    public static void main(String[] args) {
        List <Integer> listaNum= new ArrayList<Integer>();
        Scanner entrada= new Scanner(System.in);
        int num, longitud, ultimo;
        System.out.println("Ingrese un numero:");
        num=entrada.nextInt();
        listaNum.add(num);
        ultimo=num;
        do{
            System.out.println("Ingrese un número mayor a "+ultimo);
            listaNum.add(num);
            longitud= listaNum.size();
            ultimo=listaNum.get(longitud);

        }while(num<ultimo);
        
        

    }
    
}
/*
        while (num2<=num){
            num2=num;
            System.out.println("ingrese un numero mayor a "+num);
            num=entrada.nextInt();
            listaNum.add(num);
        }
        int ultimo= listaNum.size();
        System.out.println(listaNum);

        //listaNum.toArray();

        String string="";
        for (int numeros: listaNum){
            string+=numeros;


        }
        System.out.println(string);
*/