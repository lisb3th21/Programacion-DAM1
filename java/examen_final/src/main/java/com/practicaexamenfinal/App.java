package com.practicaexamenfinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * El programa deberá tener un MyTask que muestre un menú que nos pregunte
 * nuestro id. Y mostrarnos un menú que nos permita realizar las acciones según
 * el empleado correspondiente. El programa principal dispondrá de un Array de
 * Pedidos y un Array de Empleados (Camareros + Cocineros). (0,9 Punts)
 */
public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Persona> empleados = new ArrayList<>();
        Camarero camarero1 = new Camarero("Luis");
        Camarero camarero2 = new Camarero("Ana");
        Camarero camarero3 = new Camarero("Lucia");

        Cocinero cocinero1 = new Cocinero("Pablo");
        Cocinero cocinero2 = new Cocinero("Juan");
        Cocinero cocinero3 = new Cocinero("Rebeca");

        empleados.add(camarero1);
        empleados.add(camarero2);
        empleados.add(camarero3);
        empleados.add(cocinero1);
        empleados.add(cocinero2);
        empleados.add(cocinero3);

        ArrayList<LineaPedido> lineaPedidos = new ArrayList<>();
        LineaPedido linea1 = new LineaPedido(null, Estado.PEDIDO, 3);
        LineaPedido linea2 = new LineaPedido(null, Estado.COCINA, 1);
        lineaPedidos.add(linea1);
        lineaPedidos.add(linea2);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = new Pedido(2, lineaPedidos);

        // Aqui muestro los empleados
        for (Persona p : empleados) {
            System.out.println(p);
        }

        // pido que me seleccione los empleados
        Persona empleado = seleccionar(empleados);

        if (empleado instanceof Camarero) {
            menuCamareros(pedidos, (Camarero) empleado);
        } else {
            menuCocineros(pedidos, (Cocinero) empleado);
        }

    }

    public static Persona seleccionar(ArrayList<Persona> empleados) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecciona tu id:");

        int id = input.nextInt();
        input.nextLine();
        int posicion = -1;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                posicion = i;

            }
        }

        if (posicion != -1) {
            return empleados.get(posicion);
        } else {
            System.out.println("Dicho empleado no existe");
            return null;
        }
    }

    public static void menuCocineros(ArrayList<Pedido> pedidos, Cocinero cocinero) {
        Scanner input = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("MENU COCINERO");
        System.out.println("##############\n\n");

        System.out.println("1. Ver Platos");
        System.out.println("2. Actualizar estado del plato");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");

        String respuesta = input.nextLine();

        switch (respuesta) {
            case "1":
                Cocinero.verPlatos(pedidos);
                break;
            case "2":
                cocinero.actuarPlato(pedidos);
                break;
            default:
                break;
        }

    }

    public static void menuCamareros(ArrayList<Pedido> pedidos, Camarero camarero) {
        Scanner input = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("MENU CAMARERO");
        System.out.println("##############\n\n");

        System.out.println("1. Crear pedido");
        System.out.println("2. Editar pedido");
        System.out.println("3. Actualizar plato");
        System.out.println("4. Sacar tiket");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opción:");

        String respuesta = input.nextLine();

        switch (respuesta) {
            case "1":
                camarero.crearPedido();
                break;
            case "2":
                Pedido pedido = Camarero.seleccionarPedido(pedidos);
                camarero.editarPedido(pedido);
                break;
            case "3":
                camarero.actuarPlato(pedidos);
                break;
            case "4":
                Pedido pedido1 = Camarero.seleccionarPedido(pedidos);
                System.out.println("El coste del pedido es de: ");
                Camarero.sacarTicket(pedidos, pedido1);
                break;
            default:
                break;
        }
    }
}
