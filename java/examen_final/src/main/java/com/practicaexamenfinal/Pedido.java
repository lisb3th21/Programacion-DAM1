package com.practicaexamenfinal;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private int mesa;
    private ArrayList<LineaPedido> LineaPedido= new ArrayList<>();
    protected static int contador=0;


        /**
     * Método para generar los id
     */
    public static int generardorID(){
        return contador++;
     }
    


        public int getId() {
            return id;
        }


        public void setId() {
            this.id = generardorID();
        }


        public int getMesa() {
            return mesa;
        }


        public void setMesa(int mesa) {
            this.mesa = mesa;
        }


        public ArrayList<LineaPedido> getLineaPedido() {
            return LineaPedido;
        }


        public void setLineaPedido(ArrayList<LineaPedido> lineaPedido) {
            this.LineaPedido = lineaPedido;
        }


        public static int getContador() {
            return contador;
        }


        public static void setContador(int contador) {
            Pedido.contador = contador;
        }



        public Pedido(int mesa, ArrayList<LineaPedido> lineaPedido) {
            this.setId();;
            this.setMesa(mesa);
            this.setLineaPedido(lineaPedido);
        }

        public Pedido() {
            this.setId();
        }



        



     

}
