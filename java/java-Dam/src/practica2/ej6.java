package practica2;
//Pida al usuario el precio de un producto y el nombre del producto y muestre el mensaje con el precio del IVA (21%). Por ejemplo: “Tu bicicleta vale 100 euros y con el 21 % de IVA se queda en 121 euros en total”.

import javax.swing.JOptionPane;

public class ej6 {
    public static void main(String[] args) {
        
        String producto, precio;

        float iva=21f; 

        producto=JOptionPane.showInputDialog("Ingrese el nombre del producto");

        precio=JOptionPane.showInputDialog("Ingrese el precio: ");

        float precio1=Float.parseFloat(precio);

        JOptionPane.showMessageDialog(null, "El producto "+ producto+ " con IVA incluido cuesta "+ (precio1+(precio1*iva)/100)+ " euros");
    }
}
