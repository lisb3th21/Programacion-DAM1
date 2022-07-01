package com.practicaexamenfinal.examen1;



/**
 * Clase Lista
 * Solo usar métodos: length, charAt().
 * Atributos: (0,5 puntos)
 * 
 * Constructor:
 * Constructor vacío. Instanciar el atributo lista con longitud=0. (1 punto)
 * Constructor (int length). Instancia el atributo lista con longitud = length.
 * (1 punto)
 * 
 * Setters y Getters: (0,5 puntos)
 * No implementarlos
 * 
 * Métodos:
 * 
 * add (String texto) (String texto, int position). El método add tendrá dos
 * variantes, una con un parámetro y otra con dos parámetros. Añadirá texto a
 * lista en position, si solo disponemos de un parámetro añadiremos texto al
 * final de lista. Sí position es negativo o mayor que length devolverá false en
 * otro caso true. (1 punto)
 * 
 * delete (int position). Elimina el string de lista que se encuentra en
 * position. Si position es negativo o mayor o igual que length devolverá false
 * en otro caso true.
 * (1 punto)
 * 
 * 
 * 
 * remove (String texto). Elimina todos los elementos de lista que encajan con
 * texto. Devuelve el número de elementos eliminados. (1 punto)
 
 * subLista(int offset) (int index, int offset). El método subLista tendrá dos
 * variantes, una con un parámetro y otra con dos parámetros. Devolverá un
 * objeto de la clase Lista con los elementos de la lista que lo invoca que
 * vayan desde index (index=0 para el método con un parámetro), inclusive, hasta
 * index + offset, no inclusive. Devolverá una lista vacia (length=0) en los
 * siguientes casos: (1 punto)
 * index negativo
 * index+offset >= lista.length
 * 
 */

public class Lista {
    /**
     * Atributos
     */
    private String[] lista;

    /**
     * Constructor vacio
     */

    public Lista() {
        this.lista = new String[0];
    }

    /**
     * 
     * Constructor con la longitud que se le especifique
     */
    public Lista(int longitud) {
        this.lista = new String[longitud];
    }

    /**
     * To String
     */
    @Override
    public String toString() {
        String result = "";
        for (String s : lista) {
            result += s + "\n";
        }
        return result;
    }

    /**
     * Método count
     * Funciona
     */
    public int count(String palabra) {
        int contador = 0;
        for (int i = 0; i < this.lista.length; i++) {
            int conLetra = 0;
            for (int j = 0; j < lista[i].length(); j++) {
                if (this.lista[i].length() == palabra.length()) {
                    if (this.lista[i].charAt(j) == palabra.charAt(j)) {
                        conLetra++;
                    }
                }
            }
            if (conLetra == palabra.length()) {
                contador++;
            }
        }
        return contador;
    }



    /**
     * Método ADD con 1 parametro
     */

    public boolean add(String palabra) {
        boolean result = false;
        
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                this.lista[i] = palabra;
                result = true;
                break;
            }
        }

        if (!result) {

            String[] nueva = new String[this.lista.length + 1];
            for (int i = 0; i < this.lista.length; i++) {
                nueva[i] = this.lista[i];
            }
            this.lista = nueva;
            this.lista[this.lista.length - 1] = palabra;

        }
        return result;
    }



        /**
     * Método ADD con 2 parametro
     */

    public boolean add(String palabra, int posicion) {
        boolean result = false;
        
            for (int i = 0; i < this.lista.length; i++) {
                if (this.lista[posicion] == null) {
                    this.lista[i] = palabra;
                    result = true;
                    break;
                }
            }
    
            if (!result) {
    
                String[] nueva = new String[this.lista.length + 1];
                nueva[posicion]=palabra;
                for (int i = 0; i < nueva.length; i++) {
                    
                    if(posicion>i){
                        nueva[i] = this.lista[i];
                    }else if(posicion<i){
                        nueva[i] = this.lista[i-1];
                        
                    }
                }
                this.lista = nueva;
                
    
            }
            if (posicion < this.lista.length && posicion >= 0) {
                result = true;}
            return result;
            
    }


    public boolean delete(int posicion) {
        int lenLista=this.lista.length;
        boolean respuesta=false;
        if(posicion>=0 && posicion<lenLista){
            respuesta =true;
            String[] nueva = new String[this.lista.length - 1];
            this.lista[posicion]=null;
            for (int i = 0; i < nueva.length; i++) {
                    
                if(posicion>i){
                    nueva[i] = this.lista[i];
                }else if(posicion<i){
                    nueva[i] = this.lista[i+1];
                    
                }else if(posicion==i){
                    nueva[i]=this.lista[i+1];
                }
            }
            this.lista = nueva;
        }
        return respuesta;
    }



    public int remove(String texto) {
        int contador=0;
    int contadorPalabra=0;
    int lenTexto= texto.length();
        for(int i=0; i<this.lista.length; i++){
            contadorPalabra=0;
            for (int j=0; j<this.lista[i].length(); j++){
                if(this.lista[i].length()==lenTexto){
                    if(this.lista[i].charAt(j)==texto.charAt(j)){
                        contadorPalabra++;
                    }
                    
                }
            }
            if(contadorPalabra==texto.length()){
                this.lista[i]=null;
                contador++;
            }
        }
    return contador;
    }


    /**
     * invert
     * 
     */
    public boolean invert() {
        boolean respuesta=false;
        if(this.lista.length>0){respuesta=true;}            
            int longitudDeLista = this.lista.length;
            String[] temporal = new String[longitudDeLista]; 
            int contador=0;
            for (int i = longitudDeLista-1; i >= 0 ; i--) {
                temporal[i] = this.lista[contador];
                contador++;              
            }
            this.lista = temporal;
            return respuesta;
    }

/*
 *  sublista con 1 parametro
 */
    public Lista subLista(int offset){
        Lista nueva=new Lista();

        if(offset<lista.length){
            nueva=new Lista(offset-1);

            for (int i = 0; i < offset; i++) {
                nueva.add(this.lista[i]);
            }
        }
        
        return nueva;
    }

/*
 *  sublista con 2 parametro
 */
    public Lista subLista(int index, int offset){
        Lista nueva=new Lista();

        if(offset<lista.length && index>=0){
            nueva=new Lista(offset-1);

            for (int i = index; i < offset; i++) {
                nueva.add(this.lista[i]);
            }
        }
        
        return nueva;
    }

    public static void main(String[] args) {
        Lista prue = new Lista(3);

        prue.add("hola");
        prue.add("olaa");
        prue.add("adios");
        

        System.out.println(prue.subLista(1, 2));
       

    }

}
