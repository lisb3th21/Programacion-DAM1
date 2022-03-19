import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> listaHabitaciones= new ArrayList<>();

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    //cosntructor con todos los parametros
    public Hotel(String nombre , ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
        this.nombre=nombre;
    }
    //constructor vacio
    public  Hotel(){
        this(null, null);
    }
    //metodo toString
    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                '}';
    }

    //método verDisponibilidad
    public int verOcupacion(ArrayList<Habitacion> listaHabitaciones){
        int ocupados=0;
        for(int i=0; i<listaHabitaciones.size(); i++){
            if(listaHabitaciones.get(i).getDisponibilidad()==false){
                //primero comprueba si la habitacion esta ocupada,
                //de ser asi suma la capacidad de dicha habitacion
                ocupados+=listaHabitaciones.get(i).getCapacidad();
            }
        }
        return ocupados;
    }

    public static void main(String[] args) {
        //creamos el hotel
        Hotel hotel= new Hotel("Hotel prueba", null);
        //creamos habitaciones
        Habitacion habitacion1=new Habitacion(1, 5, true);
        Habitacion habitacion2=new Habitacion(2, 7, false);
        Habitacion habitacion3=new Habitacion(3, 1, true);
        Habitacion habitacion4=new Habitacion(4, 2, false);
        Habitacion habitacion5=new Habitacion(5, 1, true);
        //añadimos las habitaciones a un arraylist
        ArrayList<Habitacion> listaHabitaciones= new ArrayList<>();
        listaHabitaciones.add(habitacion1);
        listaHabitaciones.add(habitacion2);
        listaHabitaciones.add(habitacion3);
        listaHabitaciones.add(habitacion4);
        listaHabitaciones.add(habitacion5);
        //añadimos el arrayList de habitaciones
        hotel.setListaHabitaciones(listaHabitaciones);

        //creamos el menu que no saldra hasta que se lo pidamos
        boolean salir=false;
        String opcion="";
        Scanner input=new Scanner(System.in);
        while (!salir){
            //menu
            System.out.println("============================================");
            System.out.println("SELECCIONE LAS OPERACIONES DEL MENÚ:");
            System.out.println("============================================");
            System.out.println("1. Reservar habitación");
            System.out.println("2. Ver habitaciones disponibles");
            System.out.println("3. Ver opcupacion del hotel");
            System.out.println("4. Salir");

            opcion=input.nextLine();
            switch (opcion){
                case "1":
                    //le imprimimos las habitaciones disponibles y le pedimos al usuario que nos ingrese una de ellas
                    Habitacion.verDisponibilidad(listaHabitaciones);
                    System.out.println("\n\n\n");
                    System.out.println("Ingrese una de las habitaciones que se le muestra: ");
                    int posicion=Habitacion.buscarHabitacion(listaHabitaciones);
                    listaHabitaciones.get(posicion).setDisponibilidad(false);
                    System.out.println("Se ha reservado la habitacion exitosamente");
                    break;
                case "2":
                    Habitacion.verDisponibilidad(listaHabitaciones);
                    System.out.println("\n\n\n");break;
                case "3":
                    int opcupacion=hotel.verOcupacion(listaHabitaciones);
                    System.out.println("El hotel esta ocupado con: "+opcupacion+"\n\n\n");break;
                case  "4":
                    System.out.println("Hasta pronto!!");
                    salir=true;break;
                default:
                    System.out.println("La opción no esta disponible. Vuelva a introducrir la operacion que quiera realizar: ");
            }

        }

        input.close();

    }




}