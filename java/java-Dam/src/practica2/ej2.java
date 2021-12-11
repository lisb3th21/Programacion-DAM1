package practica2;
import javax.swing.*;
//Pida al usuario el espacio recorrido por un coche y el tiempo que ha tardado en horas y que calcule a qué velocidad media había realizado el recorrido.
public class ej2 {
    public static void main(String[] args){
        String espacio=JOptionPane.showInputDialog("Ingrese el espacio que ha recorrido en metros: ");
         float x=Float.parseFloat(espacio);


         String tiempo=JOptionPane.showInputDialog("Ingrese el tiempo que ha tardado en minutos: ");
         float t=Float.parseFloat(tiempo);

         System.out.println("La velocidad media de su recorrido ha sido de "+ (x/t)+ "m/min");
         


    }
    
}
