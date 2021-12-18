package practica5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
Escribe un programa que pida notas y los guarde en una lista. Para terminar
de introducir notas, escribe una nota que no esté entre 0 y 10. El programa
termina escribiendo la lista de notas.
*/
public class ej3 {
    public static void main(String[] args) {
        List <String> listaNum= new ArrayList<String>();
        String num=""; 
        String regex ="\\d+";
        int num1=0;
        do {
            num= JOptionPane.showInputDialog("Ingrese un número superior a 0: ");
            num1= Integer.parseInt(num);
            if (num.matches(regex) && num1>=0){
                listaNum.add(num);
            }
        }while (num1>=0);
        JOptionPane.showMessageDialog(null, "Los numeros que ha ingresado son:\n"+listaNum);
    }
}
