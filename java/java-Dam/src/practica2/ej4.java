package practica2;
//Pide al usuario que introduzca 3 calificaciones, y calcule la media de estas.

import javax.swing.*;

public class ej4 {
    public static  void main(String[] args) {
        
        String num1, num2, num3; 

         num1=JOptionPane.showInputDialog("Ingrese la primera nota: ");
         float numero1=Float.parseFloat(num1);

         num2=JOptionPane.showInputDialog("Ingrese la segunda nota: ");
         float numero2=Float.parseFloat(num2);

         num3=JOptionPane.showInputDialog("Ingrese la tercera nota: ");
         float numero3=Float.parseFloat(num3);
    
JOptionPane.showMessageDialog(null, "El promedio es "+ (numero1+numero2+numero3)/3);


    }
    
}
