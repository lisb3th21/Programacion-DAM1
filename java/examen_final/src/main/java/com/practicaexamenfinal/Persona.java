package com.practicaexamenfinal;

import java.util.ArrayList;

public abstract class Persona {
    private int id;
    private String nombre;
    
    
    protected static int contador = 0;

    /**
     * Método para generar los id
     */

    public static int generardorID() {
        return contador++;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = generardorID();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    /**
     * 
     * Constructor
     */
    public Persona(String nombre) {
        this.setId();
        this.setNombre(nombre);
    }

    public Persona() {
        this.setId();
        this.setNombre(null);
    }

    /**
     * Método para mostrar todos los pedidos del restaurante
     */
    public static void verPlatos(ArrayList<Pedido> pedidos) {
        for (Pedido pedido : pedidos) {
            for (LineaPedido l : pedido.getLineaPedido()) {
                System.out.println(l.getPlato());
            }
        }
    }

    /**
     * Método actuarPlato
     */

    abstract public void actuarPlato(ArrayList<Pedido> pedidos);

    /**
     * Metodo calcular caja
     * 
     * 
     * 
     * mal
     */

    public static float calcularCaja(ArrayList<LineaPedido> lineaPedido) {
        float resultado = 0;

        for (LineaPedido l : lineaPedido) {
            resultado += l.getCantidad();
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }

}
