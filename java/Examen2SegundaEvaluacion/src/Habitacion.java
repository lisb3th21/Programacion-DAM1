import java.util.ArrayList;
import java.util.Scanner;

public class Habitacion {
    private int numero;
    private int capacidad;
    private boolean disponibilidad;

    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //constructor vacio
    public Habitacion() {
        this(0, 1, false);
    }

    //Constructor completo
    public Habitacion(int numero, int capacidad, boolean disponibilidad) {
        this.setNumero(numero);
        this.setCapacidad(capacidad);
        this.setDisponibilidad(disponibilidad);
    }

    //constructor copia
    public Habitacion(Habitacion habitacion) {
        this(habitacion.getNumero(), habitacion.getCapacidad(), habitacion.getDisponibilidad());
    }

    //método toString
    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                ", disponibilidad=" + disponibilidad +
                '}';
    }


    //método solicitar datos
    public static Habitacion solicitarDatosHabitacion() {
        Scanner input = new Scanner(System.in);
        Habitacion habitacion = new Habitacion();
        System.out.println("Ingrese el número de habitación: ");
        habitacion.setNumero(input.nextInt());
        System.out.println("Ingrese la capacidad de la habitación: ");
        habitacion.setCapacidad(input.nextInt());
        //pedimos al usuario que nos ingrese s o n segun la habitacion este disponible
        System.out.println("Ingrese 'S' si la habitación esta disponible o 'N' en caso contrario:");
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            habitacion.setDisponibilidad(true);
        } else {
            habitacion.setDisponibilidad(false);
        }
        return habitacion;
    }

    //método añadir habitacion
    public static boolean anadirHabitacion(ArrayList<Habitacion> listaHabitaciones) {
        Habitacion habitacion = solicitarDatosHabitacion();
        boolean repetido = true;
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (habitacion.getNumero() == listaHabitaciones.get(i).getNumero()) {
                System.out.println("La habitacion ya existe");
            } else {
                listaHabitaciones.add(habitacion);
                repetido = false;
                System.out.println("Se ha agregado con exito la habitación");
            }
        }
        return repetido;
    }

    //eliminar habitacion
    public static boolean eliminarHabitacion(ArrayList<Habitacion> listaHabitaciones) {
        boolean eliminado = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de habitacion a eliminar: ");
        int numeroEliminar = input.nextInt();
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (numeroEliminar == listaHabitaciones.get(i).getNumero()) {
                listaHabitaciones.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }

    //buscar habitacion
    public static int buscarHabitacion(ArrayList<Habitacion> listaHabitaciones) {
        int posicion = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de habitacion a eliminar: ");
        int numBuscar = input.nextInt();
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (numBuscar == listaHabitaciones.get(i).getNumero()) {
                posicion = i;
            }
        }
        return posicion;
    }

    //método ver disponibilidad
    public static void verDisponibilidad(ArrayList<Habitacion> listaHabitaciones){
    Scanner input=new Scanner(System.in);

    System.out.println("Ingrese la capaidad que desee su habitación: ");
    int capacidad=input.nextInt();
    System.out.println("================================" +
            "\nLas habitaciones disponibles son: \n");
    for(int i = 0; i < listaHabitaciones.size(); i++){
        if(capacidad==listaHabitaciones.get(i).getCapacidad() && listaHabitaciones.get(i).getDisponibilidad()==true){
            System.out.println(listaHabitaciones.get(i).toString());
        }
    }
    System.out.println("==================================");
    }
}