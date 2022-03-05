package practica6;

public class ej13 {
    public static boolean esPrimoFor(int numero) {
        boolean esPrimo = false;
        if (numero == 2) {
            esPrimo = true;
        }
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                esPrimo = false;
            } else {
                esPrimo = true;
            }
        }
        return esPrimo;
    }

    public static boolean esPrimoWhile(int numero) {
        boolean esPrimo = false;
        int contador =0;
        int x=1;
        if (numero == 2) {
            esPrimo = true;
        }
        while(x<=numero){
            if(numero%x==0) contador++;
            x++;
        }
        if (contador==2){
            esPrimo=true;
        }else{
            esPrimo=false;
        }
        return esPrimo;

    }
    public static void main(String[] args) {
        System.out.println(esPrimoWhile(2));
    }
}
