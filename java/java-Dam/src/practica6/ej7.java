package practica6;

import java.util.Scanner;

public class ej7 {
    public static int vocalA(String frase){
        frase=frase.toLowerCase();
        int vocalesA=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='a' ){
                vocalesA++;
            }
        }
        return vocalesA;
    }
    public static int vocalE(String frase){
        frase=frase.toLowerCase();
        int vocalesE=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='e' ){
                vocalesE++;
            }
        }
        return vocalesE;
    }
    public static int vocalI(String frase){
        frase=frase.toLowerCase();
        int vocalesI=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='i' ){
                vocalesI++;
            }
        }
        return vocalesI;
    }
    public static int vocalO(String frase){
        frase=frase.toLowerCase();
        int vocalesO=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='o' ){
                vocalesO++;
            }
        }
        return vocalesO;
    }
    public static int vocalU(String frase){
        frase=frase.toLowerCase();
        int vocalesU=0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i)=='u' ){
                vocalesU++;
            }
        }
        return vocalesU;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase=input.nextLine();
        System.out.println("Vocales A:" + vocalA(frase));
        System.out.println("Vocales E: "+vocalE(frase));
        System.out.println("Vocales I: "+vocalI(frase));
        System.out.println("Vocales O: "+vocalO(frase));
        System.out.println("Vocales U: "+vocalU(frase));
        input.close();
    }
    
}
