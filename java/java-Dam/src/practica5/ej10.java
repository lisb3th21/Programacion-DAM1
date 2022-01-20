package practica5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Map<String, String> boletin = new HashMap<String, String>();
        String alumno = "";
        String salir = "s";
        float nota = 0;
        Scanner input = new Scanner(System.in);
        String listaNotas = "";

        do {
            System.out.println("Ingresa el nombre del alumno: ");
            alumno = input.nextLine();
            if (alumno.equalsIgnoreCase(salir) == false) {
                do {
                    System.out.println("Ingresa la nota de " + alumno + ": ");
                    nota = input.nextFloat();
                    if (nota <= 10) {
                        String notaString = Float.toString(nota);
                        listaNotas = listaNotas + "  -  " + notaString;
                    }

                } while (nota <= 10);
                input.nextLine();
            }

            boletin.put(alumno, listaNotas);
        } while (alumno.equalsIgnoreCase(salir) == false);
        input.close();
        boletin.remove("s");

        System.out.println("La nota de los alumnos son: ");
        for (String clave : boletin.keySet()) {
            String valor = boletin.get(clave);
            System.out.println(clave + "  --->" + valor);
        }

    }

}
