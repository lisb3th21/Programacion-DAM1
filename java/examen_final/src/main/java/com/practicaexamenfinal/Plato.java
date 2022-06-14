package com.practicaexamenfinal;

import java.util.ArrayList;

public class Plato {
    private int id;
    private String nombre;
    private float precio;
    protected static int contador = 0;

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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Método para generar los id
     */

    public static int generardorID() {

        return contador++;
    }

    /**
     * 
     * Constructores
     */

    public Plato(String nombre, float precio) {
        this.setId();
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public Plato() {
        this.setId();
        this.setNombre(null);
        this.setPrecio(0);
    }

    /**
     * To string
     */
    @Override
    public String toString() {
        return "Plato [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

    public static ArrayList<Plato> platosDisponibles() {
        ArrayList<Plato> platos = new ArrayList<>();
        Plato plato1 = new Plato("efddfº", 2.2f);
        Plato plato2 = new Plato("11111", 2.2f);
        Plato plato3 = new Plato("11111", 2.2f);

        platos.add(plato1);
        platos.add(plato2);
        platos.add(plato3);

        for (Plato l : platos) {
            System.out.println(l);
        }
        return platos;
    }

    public static Plato seleccionarPlato(int id) {

        Plato result = null;

        ArrayList<Plato> platos = platosDisponibles();

        for (Plato l : platos) {
            if (l.getId() == id) {
                result = l;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Plato prueba = new Plato("efddfº", 2.2f);
        Plato prueba1 = new Plato("11111", 2.2f);
        Plato prueba3 = new Plato("11111", 2.2f);

    }
}
