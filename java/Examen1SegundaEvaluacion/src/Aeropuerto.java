import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {
    //atributos
    private String nombre;
    private ArrayList<Vuelo> listaVuelos;
    private int capacidad;

    //costructor vacio
    public Aeropuerto(){
        this("Sin nombre", null, 0);
    }
    //constructor con todos los parametros
    public Aeropuerto(String nombre, ArrayList<Vuelo> listaVuelos, int capacidad){
        this.nombre=nombre;
        this.listaVuelos=new ArrayList<Vuelo>();
        this.capacidad=capacidad;
        //si nos pasan por parametro una lista que no sea nula, cambiamos el valor del atributo
        if (listaVuelos!=null){
            this.setListaVuelos(listaVuelos);
        }
    }

    //getters
    public String getNombre(){return nombre;}
    public ArrayList<Vuelo> getListaVuelos(){return listaVuelos;}
    public int getCapacidad(){return capacidad;}
    //setters
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setListaVuelos(ArrayList<Vuelo> listaVuelos){this.listaVuelos=listaVuelos;}
    public void setCapacidad(int capacidad){this.capacidad=capacidad;}
    //metodo comprobar capacidad
    public boolean comprobarCapacidad(ArrayList<Vuelo> listaVuelos){
        boolean loSupera=false;
        //con el bucle iremos sumando los pasajeros de cada vuelo para despues compararlos con la capacidad del aeropuerto
        int contador=0;
        for (int i=0; i<listaVuelos.size(); i++){
            contador+=listaVuelos.get(i).getPasajeros();
        }
        if(capacidad<contador){
            loSupera=true;
        }
        return loSupera;
    }

    //toString
    @Override
    public String toString(){
        return "Aeropuerto [Nombre:"+ nombre +", Lista de vuelos: "+listaVuelos+", Capacidad: "+capacidad+"]";
    }

    public static void main(String[] args) {
        //Creo unos vuelos con el fin de comprobaer el programa
        Scanner input= new Scanner(System.in);
        ArrayList <Vuelo> listaVuelos= new ArrayList<>();
        Vuelo vuelo1=new Vuelo(12, "Estados Unidos", "Argentina");
        Vuelo vuelo2= new Vuelo(20, "España", "Argentina");
        Vuelo vuelo3= new Vuelo(323, "España", "Andorra");
        Vuelo vuelo4= new Vuelo(44449, "Mexico", "Andorra");
        listaVuelos.add(vuelo1);
        listaVuelos.add(vuelo2);
        Aeropuerto aeropuerto=new Aeropuerto("Adolfo Suárez Madrid-Barajas", listaVuelos, 2000);

        //Menu
        int opcion;
        System.out.println("MENU DEL AEROPUERTO");
        System.out.println("1. Añadir vuelo.");
        System.out.println("2. Ver lista de Vuelos segun destino");
        System.out.println("3. Eliminar Vuelo");
        System.out.println("4. Comprobar Capacidad");
        System.out.println("5. Salir");
        do{
            System.out.println("SELECIONE LA OPCIÓN del 1 al 5:");
            opcion=input.nextInt();input.nextLine();
        }while(opcion>5 || opcion<1);

        switch(opcion){
            case 1:Vuelo.anadirVuelo(listaVuelos);break;
            case 2:Vuelo.buscarVuelo(listaVuelos);break;
            case 3:Vuelo.eliminarVuelo(listaVuelos);break;
            case 4:
            if(aeropuerto.comprobarCapacidad(listaVuelos)==true){
                System.out.println("Lo supera");
            }else{
                System.out.println("No lo supera");
            }
            break;
            case 5: System.out.println("HASTA PRONTO!!");break;
        }



    }

}
