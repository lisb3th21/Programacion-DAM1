package practica6;
import java.util.Scanner;

public class ej11 {
    public static boolean palindroma(String fraseSin) {
        String fraseReves="";
        for (int i=fraseSin.length()-1; i>=0; i--){
            fraseReves+=fraseSin.charAt(i);

        }
        if (fraseSin.equalsIgnoreCase(fraseReves)){
            return true;
        }else{
            return false;
        }
    }

    public static String sinEspacios(String frase){
String fraseSin="";
        for(int i=0; i<frase.length(); i++ ){
            if (frase.charAt(i)!=' '){
                fraseSin+=frase.charAt(i);
            }else{
                i++;
            }
        }
        return fraseSin;
    }
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Ingresa la palabra que quieres analizar: ");
    String frase=input.nextLine();
    String fraseSin=sinEspacios(frase);


    if (palindroma(fraseSin)){
        System.out.println("La frase "+frase.toUpperCase()+" es palindorma o capicúa");
    }else{
        System.out.println("La frase "+frase.toUpperCase()+" no es palindorma o capicúa");
    }
}
    
    
}
