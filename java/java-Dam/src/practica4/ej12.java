package practica4;
//mira si el numero es primo :)
import javax.swing.JOptionPane;

public class ej12 {
    static boolean esPrimo(int num){
        boolean primo=true;
        for (int i=2; i<num; i++){
            if (num%i==0){
                primo=false;
            }
        }
        return primo; 
    }
    public static void main(String[] args) {
        String num1= JOptionPane.showInputDialog("Ingrese un numero");
        int num= Integer.parseInt(num1); 
        boolean primo= esPrimo(num);
        if (primo==true){
            JOptionPane.showMessageDialog(null, "El numero "+ num+ " es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+ num+ " no es primo");        }
    }
    
}
