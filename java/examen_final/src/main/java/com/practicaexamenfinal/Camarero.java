package com.practicaexamenfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Camarero extends Persona {

    public Camarero(String nombre) {
        super(nombre);

    }

    /**
     * Método para crear el pedido
     */
    public Pedido crearPedido() {
        Scanner input = new Scanner(System.in);
        Pedido pedido = new Pedido();
        System.out.println("---------------------------");
        System.out.println("Se procede a crear un pedido");
        System.out.println("---------------------------");

        System.out.print("MESA: ");
        pedido.setMesa(input.nextInt());
        input.nextLine();

        // Para crear el array list
        boolean salir = false;
        do {
            pedido = editarPedido(pedido);

            System.out.println("Añadir otra linea? S");
            String seguir = input.nextLine();

            if (!seguir.equalsIgnoreCase("S")) {
                salir = true;
            } else {
                System.out.println("Ingrese otro pedido: ");
            }

        } while (!salir);

        return pedido;

    }

    /**
     * Editar un pedido
     */

    public Pedido editarPedido(Pedido pedido) {
        Scanner input = new Scanner(System.in);
        LineaPedido linea = new LineaPedido();
        Plato.platosDisponibles();
        System.out.println("Selecciona un plato por su id: ");
        linea.setPlato(Plato.seleccionarPlato(input.nextInt()));
        input.nextLine();

        linea.setEstado(Estado.PEDIDO);
        System.out.print("Diga la cantidad: ");
        linea.setCantidad(input.nextInt());
        input.nextLine();

        pedido.getLineaPedido().add(linea);

        pedido.setLineaPedido(pedido.getLineaPedido());;

        

        return pedido;
    }

    /**
     * SacarTicket
     */

    public static float sacarTicket(ArrayList<Pedido> pedidos, Pedido pedido) {
        float result = 0;
        Pedido pedido2 = new Pedido();
        for (Pedido p : pedidos) {
            contador++;
            if (pedido.getId() == pedido.getId()) {
                pedido2 = p;
            }

        }

        for (LineaPedido l : pedido2.getLineaPedido()) {
            result += ((l.getPlato().getPrecio()) * l.getCantidad());
        }
        return result;
    }

    /**
     * Método para seleccionar pedido
     */
    public static Pedido seleccionarPedido(ArrayList<Pedido> pedidos) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el id del pedido: ");
        int id = input.nextInt();
        input.nextLine();
        Pedido pedido = new Pedido();
        for (Pedido p : pedidos) {
            if (id == p.getId()) {
                pedido = p;

            }
        }
        return pedido;
    }

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
                if (l.getEstado() == Estado.LISTO && l.getId() == id) {
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

                        l.setEstado(Estado.SERVIDO);
                        System.out.println("El pedido se ha cambiado a Servido");

                    }

                }
            }
        }

    }

}
