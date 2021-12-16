package practica4;
//dibuja un rectangulo 
import java.util.Scanner;

public class ej9{
    static void Rectangulo(int base, int altura){
        String inicio=new String(new char[base]).replace("\0", "# ")+"\n";
        String medio= "# "+ new String (new char[base-2]).replace("\0", "  ") + "# "+"\n";
        String resultado="";
        for (int i=1; i<=altura; i++ ){
            if (i==1 || i==altura){
                resultado+=inicio;
            }
            else{
                resultado+=medio; 
            }
        }System.out.println(resultado);
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la base de su rectangulo: ");
        int base= entrada.nextInt();
        System.out.println("Ingrese la altura de su rectangulo: ");
        int altura= entrada.nextInt();
        entrada.close();
        Rectangulo(base, altura);
    }
}