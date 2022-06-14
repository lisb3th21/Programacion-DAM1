package com.practicaexamenfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocinero extends Persona {

    public Cocinero(String nombre) {
        super(nombre);

    }

    /**
     * Método estatico para ver los pedidos que le interesan al cocinero
     * 
     */
    public static void verPlatos(ArrayList<Pedido> pedidos) {
        for (Pedido p : pedidos) {
            for (LineaPedido l : p.getLineaPedido()) {
                if (l.getEstado() == Estado.PEDIDO || l.getEstado() == Estado.COCINA) {
                    System.out.println(l);
                }
            }
        }
    }

    /**
     * Método donde el cocinero podrá cambiar el estado del pedido
     */

    @Override
    public void actuarPlato(ArrayList<Pedido> pedidos) {
        Scanner input = new Scanner(System.in);
        verPlatos(pedidos);
        int posicion = -1;
        System.out.println("-------------------------\n\n");
        System.out.print("Seleccione el id del pedido: ");
        int id = input.nextInt();
        input.nextLine();

        for (Pedido p : pedidos) {
            for (LineaPedido l : p.getLineaPedido()) {
                if (l.getEstado() == Estado.PEDIDO || l.getEstado() == Estado.COCINA && l.getId() == id) {
                    posicion = id;
                    break;
                }
            }
        }
        if (posicion == -1) {
            System.out.println("El pedido seleccionado no es correcto");
        } else {
            System.out.println("Se pocede a cambiar el estado");
            for (Pedido p : pedidos) {
                for (LineaPedido l : p.getLineaPedido()) {
                    if (l.getId() == contador) {
                        if (l.getEstado() == Estado.PEDIDO) {
                            l.setEstado(Estado.COCINA);
                            System.out.println("El pedido se ha cambiado a COCINA");
                        } else {
                            l.setEstado(Estado.LISTO);
                            System.out.println("El pedido se ha cambiado a LISTO");
                        }
                    }
                }
            }
        }

    }

}
