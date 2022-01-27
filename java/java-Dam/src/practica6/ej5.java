package practica6;

import java.util.Scanner;

//Escribe un programa que te pida una frase y una vocal (entrada por teclado), y pase estos datos como parámetro a una función que se encargará de cambiar todas las vocales de la frase por la vocal seleccionada. Devolverá la función la frase modificada, y el programa principal la imprimirá:
public class ej5 {
    public static String cambiarVocal(String frase, char vocal){
        String resultado="";
        for (int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' ){
                resultado+=vocal;
            }else{
                resultado+=frase.charAt(i);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase=input.nextLine();
        
        char vocal=' ';
        do{
            System.out.println("Ingresa una vocal: ");
            vocal=input.next().charAt(0);
        }while(vocal!='a' && vocal!='e' && vocal!='i' && vocal!='o' && vocal!='u');
System.out.println();
        System.out.println(cambiarVocal(frase, vocal));
        input.close();
    }
    
}
