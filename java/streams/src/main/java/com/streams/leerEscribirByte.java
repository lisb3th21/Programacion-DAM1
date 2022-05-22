package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 * Clase que lee y escribe byte to byte un fichero que contiene
 * información de una pelicula.
 * Escribirá, en un nuevo fichero que se le indique la información de la
 * película con un formato en especifico.
 */

public class leerEscribirByte {

    /**
     * 
     * Este método solo se ejecutará un vez, para imprimir el encabezado de la cartelera de cine
     */
    public static void encabezado(FileOutputStream ficheroSalida) throws Exception {
        String[] encabezado = { "--------------------------\n", "Cartelera CineFBMoll",
                "\n--------------------------\n" };
        for (int i = 0; i < encabezado.length; i++) {
            int contador = 0;
            char caracter;
            do {

                caracter = encabezado[i].charAt(contador);
                ficheroSalida.write(caracter);
                contador++;

            } while (contador != encabezado[i].length());
        }
    }






/**
 * 
 * Método que imprimira los margenes de cada titulode una nueva pelicula 
 * 
 */

    public static void nuevaPeli(FileOutputStream ficheroSalida) throws Exception {
        String encabezado = "----------";
        int contador = 0;
        char caracter;
        do {
                caracter = encabezado.charAt(contador);
                ficheroSalida.write(caracter);
                contador++;
        } while (contador != encabezado.length());
    }

/** 
 * Método que imprimira los subtitulos de cada apartado de la pelicula, dependiendo del astedisco en que se encuentre 
*/
 
    public static void titulos(int posicion, FileOutputStream ficheroSalida) throws Exception {
        String[] titulos={"\nAño: ", "\nDirector: ", "\nDuración: ", "\nSinopsis:\n", "\nReparto: ", "\nsesión: "};
        int contador = 0;
        char caracter;
        do {
            
            caracter = titulos[posicion].charAt(contador);
            ficheroSalida.write(caracter);
            contador++;

        } while (contador != titulos[posicion].length());
        
    }

    /**
     * Método principal donde encagaremos todo
     */
    public static void leerEscribir(String entrada, String salida) {

        try {
            // accedo al fichero de entrada
            FileInputStream ficheroEntrada = new FileInputStream(entrada);
            FileOutputStream ficheroSalida = new FileOutputStream(salida, true);

            //imprimo el encabezado de la cartelera
            encabezado(ficheroSalida);
            
            int num;

            //contador que irá contando los numerales (servirá para poner los subtitulos)
            int posicion=0;
            do {

                num = ficheroEntrada.read();
                if (num != -1) {
                    
                    if((char) num == '{'){
                        posicion=0;
                        ficheroSalida.write('\n');
                        nuevaPeli(ficheroSalida);
                        do {
                            //linea necesaria para que no se imprima el corchete '{'
                            num = (char) ficheroEntrada.read(); 
                        } while ((char) num == '#');
                    }else if((char) num == '#'){
                        num = (char) ficheroEntrada.read();
                        
                        if(posicion==0){
                            nuevaPeli(ficheroSalida);
                        }
                        titulos(posicion , ficheroSalida);
                        posicion++;
                    }
                    ficheroSalida.write((char) num);

                }

            } while (num != -1);
            ficheroSalida.close();
            ficheroEntrada.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        leerEscribir("peliculas.txt", "resultado.txt");
    }
}
