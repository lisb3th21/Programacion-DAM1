package practica4;
//Crea un triangulo equilatero 
import java.util.Scanner;

public class ej8 {
    static void triangulo(int ancho ){
        for (int i=0; i<ancho; i++){
            String resultado=new String(new char[i]).replace("\0", "# ");
            System.out.println(resultado);
        }
        for (int i=ancho; i>0; i--){
            String resultado= new String(new char[i]).replace("\0", "# ");
            System.out.println(resultado);
        }
    }
    public static void main(String[] args) {
        Scanner entrada1= new Scanner(System.in);
        System.out.println("Ingrese el ancho del triángulo: ");
        int ancho= entrada1.nextInt();
        triangulo(ancho);
        entrada1.close();
    }

    
}
