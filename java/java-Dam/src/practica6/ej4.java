package practica6;
//Escribe un programa que pida una frase (entrada por teclado), y le pase como parámetro a una función dicha frase. La función debe sustituir todos los espacios en blanco de una frase por un asterisco, y devolver el resultado para que el programa principal la imprima por pantalla.
import java.util.Scanner;

public class ej4 {
    public static String remplaza(String frase){
        String resultado="";
        for (int i=0; i<frase.length(); i++){
            if(frase.charAt(i)==' '){
                resultado+="*";
            }else{
                resultado+=frase.charAt(i);
            }
        }
        return resultado;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase=input.nextLine();
        System.out.println(remplaza(frase));
        input.close();
    }
    
}
