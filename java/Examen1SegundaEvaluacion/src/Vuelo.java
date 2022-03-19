import java.util.ArrayList;
import java.util.Scanner;

public class Vuelo {
    //Atributos
    private int id=0;   //Asumo que el ID del primer pasajero será 0 
    private int pasajeros;
    private String origen;
    private String destino;
    private static int incrementoId;

    
    public static void incrementoID(){
        incrementoId++;
    }


    //Constructor vacio
    public Vuelo(){
        //Asigno el ID en los constructores y llamo al método que me incrementara el ID
        this(0, null, null);
    }
    //Constructor con parametros 
    public Vuelo (int pasajeros, String origen, String destino){
        this.setPasajeros(pasajeros);
        this.setOrigen(origen);
        this.setDestino(destino);;
        this.id=incrementoId;
        incrementoID();

    }

    //getters
    public int getId(){return id;}
    public int getPasajeros(){return pasajeros;}
    public String getOrigen(){return origen;}
    public String getDestino(){return destino;}
    public static int getIncrementoID(){return incrementoId;} //para saber en que numero de id estamos
    //setters
    public void setPasajeros(int pasajero){this.pasajeros=pasajero;}
    public void setOrigen(String origen){this.origen=origen;}
    public void setDestino(String destino){this.destino=destino;}

    //Solicitar datos
    public static Vuelo solicitarDatos(){
        Scanner input =new Scanner(System.in);
        Vuelo vuelo= new Vuelo();
        System.out.println("Ingresa el numero de pasajeros: ");
        vuelo.setPasajeros(input.nextInt()); input.nextLine();
        System.out.println("Ingresa el origen del vuelo: ");
        vuelo.setOrigen(input.nextLine());
        System.out.println("Ingresa el destino del vuelo:");
        vuelo.setDestino(input.nextLine());
        return vuelo;
    }
    //Método añadir vuelos. Como el metodo solicitar datos devuelve un vuelo lo 
    //utilizamos directamente con el método add de la clase ArrayList
    public static void anadirVuelo(ArrayList<Vuelo> listaVuelos){
        listaVuelos.add(solicitarDatos());
    }

    //Método BuscarVuelo por ID
    public static int buscarVueloID(ArrayList<Vuelo> listaVuelos){
        int posicion=-1;
        Scanner input= new Scanner(System.in);
        int  id;
        do{
            System.out.println("Ingese el ID del vuelo que quiera buscar:");
            id=input.nextInt();input.nextLine();
        }while(id<0);

        for (int i=0; i<listaVuelos.size();i++){
            if(listaVuelos.get(i).getId()==id){
                posicion=i;
            }
        }
        return posicion; 
    }
    //Método eliminar vuelo por ID
    public static boolean eliminarVuelo(ArrayList<Vuelo> listaVuelos){
        int posicion=-1;
        Scanner input= new Scanner(System.in);
        boolean eliminado=false;
        int  id;
        do{
            System.out.println("Ingese el ID del vuelo que quiera eliminar:");
            id=input.nextInt();input.nextLine();
        }while(id<0);

        for (int i=0; i<listaVuelos.size();i++){
            if(listaVuelos.get(i).getId()==id){
                posicion=i;
                eliminado= true;
            }else{
                eliminado= false;
            }
        }
        listaVuelos.remove(posicion);
        return eliminado;
    }
    //Método buscar vuelo
    public static void buscarVuelo(ArrayList<Vuelo> listaVuelos){
        Scanner input= new Scanner(System.in);
        String destinoBuscar;
        System.out.println("Ingrese el destino del vuelo:");
        destinoBuscar=input.nextLine();
        //utilizo el metodo toUpperCase() para que no tome en cuenta las mayusculas 
        for (int i=0; i<listaVuelos.size();i++){
            if(listaVuelos.get(i).getDestino().toUpperCase().equals(destinoBuscar.toUpperCase())){
                System.out.println(listaVuelos.get(i).toString());
            }
        }
    }


    //metodo toString 
    @Override
    public String toString(){
        return "Vuelo [ID:"+ id +", Numero de pasajeros: "+pasajeros+", Origen: "+origen+", Destino: "+destino+"]";
    }

}
