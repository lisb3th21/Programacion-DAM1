package com.practicaexamenfinal;
/**
Clase Lista
Solo usar métodos: length, charAt().
Atributos:  (0,5 puntos)

Constructor:
Constructor vacío. Instanciar el atributo lista con longitud=0. (1 punto)
Constructor (int length). Instancia el atributo lista con longitud = length. (1 punto)

    Setters y Getters: (0,5 puntos)
No implementarlos

Métodos:
toString(). Debe imprimir por consola todos los elementos del Array lista. (1 punto)
count (String texto). Devuelve un entero que indica el número de veces que un elemento de lista encaja con el texto pasado por parámetro. (1 punto)
add (String texto) (String texto, int position). El método add tendrá dos variantes, una con un parámetro y otra con dos parámetros. Añadirá texto a lista en position, si solo disponemos de un parámetro añadiremos texto al final de lista. Sí position es negativo o mayor que length devolverá false en otro caso true. (1 punto)
delete (int position). Elimina el string de lista que se encuentra en position. Si position es negativo o mayor o igual que length devolverá false en otro caso true. 
(1 punto)
remove (String texto). Elimina todos los elementos de lista que encajan con texto. Devuelve el número de elementos eliminados. (1 punto)
invert(). Invierte los elementos de lista. Devuelve false si lista tiene un length=0, en otro caso devuelve true. (1 punto)
subLista(int offset) (int index, int offset). El método subLista  tendrá dos variantes, una con un parámetro y otra con dos parámetros. Devolverá un objeto de la clase Lista con los elementos de la lista que lo invoca que vayan desde index (index=0 para el método con un parámetro), inclusive, hasta index + offset, no inclusive. Devolverá una lista vacia (length=0) en los siguientes casos: (1 punto)
index negativo
index+offset >= lista.length

 */

public class Lista {
    
}
