package practica6;

import java.util.Scanner;

//Escribe un programa que lea (entrada por teclado) una frase, y la pase como parámetro a un procedimiento, y éste debe mostrar la frase con un carácter en cada línea.
public class ej3 {
    public static void procedimiento(String cadena){
        
        String resultado="";
        for (int i=0; i<cadena.length(); i++){
            resultado+="\n"+cadena.charAt(i);
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cadena=input.nextLine();
        procedimiento(cadena);
        input.close();
    }
    
}
