package practica2;

import javax.swing.JOptionPane;


public class ej5 {
    public static void main(String[] args) {
    
     
        String numero = JOptionPane.showInputDialog("Ingrese un número de hasta 3 cifras:");
int num=Integer.parseInt(numero);
if (num>=-999 && num<=999 ){
    JOptionPane.showMessageDialog(null, "El número es correcto!");
}
else{
    JOptionPane.showMessageDialog(null, "El número es incorrecto!");
}

    }
    
}
