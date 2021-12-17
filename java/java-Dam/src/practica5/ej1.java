package practica5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
/*
Escribe un programa que te pida palabras y las guarde en una lista.
Para terminar de introducir palabras, simplemente pulsa Enter. El
programa termina escribiendo la lista de palabras.
*/
public class ej1 {
    public static void main(String[] args) {
        List<String> listaLetras=new ArrayList<String>();
        String palabra="";
        do{
            palabra= JOptionPane.showInputDialog("Ingrese una palabra: ");
            if (!palabra.equals("")){
                listaLetras.add(palabra);
            }
        }while (!palabra.equals(""));
        JOptionPane.showMessageDialog(null, "Las palabras que ha escrito son:\n"+listaLetras);
    }
}
