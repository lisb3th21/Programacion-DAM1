package com.practicaexamenfinal;

public class LineaPedido {
    protected int id;
    private Plato plato; 
    private Estado estado;
    private int cantidad;
    protected static int contador=0;


    
    public int getId() {
        return id;
    }
    public void setId() {
        this.id = generardorID();
    }
    public Plato getPlato() {
        return plato;
    }
    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        LineaPedido.contador = contador;
    }



        /**
     * Método para generar los id
     */

    public static int generardorID(){
        return contador++;
     }




    public LineaPedido(Plato plato, Estado estado, int cantidad) {
        this.setId();
        this.setEstado(estado);
        this.setCantidad(cantidad);
        this.setPlato(plato);
    }

    public LineaPedido() {
        this.setId();

    }



    /**
     * To string
     */
    @Override
    public String toString() {
        return "LineaPedido [cantidad=" + cantidad + ", estado=" + estado + ", id=" + id + ", plato=" + plato + "]";
    }


    




}
