package com.streams;
/**
 * para la lectura de buffers utilizare el resultado de la cartelera de peliculas
 * por ello primero deberás ejecutar leerEscribirBytes.java
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class lecturaBuffer {

    public static void readBuffer() {
        try {
            FileReader archivo = new FileReader("resultado.txt");
            BufferedReader reader = new BufferedReader(archivo);
            ;
            String linea;
            do {
                 linea= reader.readLine();
                 if(linea != null){
                    System.out.println(linea);
                 }
                 
            } while (linea != null);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public static void main(String[] args) {
        readBuffer();
    }
}
