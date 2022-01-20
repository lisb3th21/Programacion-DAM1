package practica5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Escribe un programa que te pida nombres de personas y sus números de teléfono.
Para terminar debe pulsar “S” cuando te pida el nombre. El programa termina escribiendo
nombres y números de teléfono. Nota: La lista en la que se guardan los nombres y números
de teléfono tiene esta estructura[[nombre1, telef1], [nombre2, telef2], [nom3, telef3], etc],
es decir, lista de listas.

*/
public class ej9 {
    /*public static String nombres(){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu contacto: ");
        String nombre=input.nextLine();
        input.close();
        return nombre;
    }
    public static String telefono(){
        Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el teléfono de tu contacto: ");
        String telefono=input.nextLine();
        input.close();
        return telefono;
    }*/
    public static void main(String[] args) {
        Map<String, String> agenda=new HashMap<String, String>();
        String nombre="";
        String telefono="";
        String salir="s";
        Scanner input =new Scanner(System.in);

        do{
            System.out.println("Ingrese el nombre de tu contacto: ");
            nombre=input.nextLine();
            if (nombre.equalsIgnoreCase(salir)==true){
                break;
            }
            System.out.println("Ingrese el teléfono de tu contacto: ");
            telefono=input.nextLine();
            agenda.put(nombre, telefono);
        }while(nombre.equalsIgnoreCase(salir)==false);
        input.close();
        /////////////////////////
        System.out.println("\n \n \n \n \n \n \n#################################" );

        System.out.println("\nSu agenda es:\n ");
        for (String clave: agenda.keySet()){
            String valor=agenda.get(clave);
            //System.out.println(agenda.get(clave));
            System.out.println(clave+" --> "+valor+"\n");
        }
        System.out.println("#################################");

    }
}
