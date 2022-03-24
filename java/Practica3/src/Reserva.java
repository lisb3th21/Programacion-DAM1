import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    private Persona persona;
    private Libro libro;
    private Estado estado;
    
    //getters y setters 
    
    public Libro getLibro() {
        return null;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //constructores 
    public Reserva(Persona persona, Libro libro, Estado estado) {
        this.persona = persona;
        this.libro = libro;
        this.estado = estado;
    }

    public Reserva(){
        this(null, null, null);
    }
    

    //toString
    @Override
    public String toString() {
        return "Reserva [estado=" + estado + ", libro=" + libro + ", persona=" + persona + "]";
    }

    public static void anadirReserva(ArrayList<Reserva> listaReservas, ArrayList<Libro> listaLibros, ArrayList<Persona> listaUsuarios){
        Reserva reserva= new Reserva();
        int posPersona= Persona.buscarPersonaDNI(listaUsuarios);

        if(posPersona>-1){
            int cantidadReservas=0;
            for (int i=0; i<listaReservas.size(); i++){
                if(listaReservas.get(i).getPersona().getDni().equalsIgnoreCase(listaUsuarios.get(posPersona).getDni())){
                    cantidadReservas++;
                }
            }
            if(cantidadReservas<=5){
                reserva.setPersona(listaUsuarios.get(posPersona));
                int posLibro=Libro.bucarLibroISBN(listaLibros);
                if(posLibro>-1){
                    if(listaLibros.get(posLibro).getNumCopiasDisponibles()>0){
                        reserva.setLibro(listaLibros.get(posLibro));
                        reserva.setEstado(Estado.Vigente);
                        listaReservas.add(reserva);
                        listaLibros.get(posLibro).setNumCopiasDisponibles(listaLibros.get(posLibro).getNumCopiasDisponibles()-1);
                        System.out.println("Reserva realizada correctamente");
                    }
                }
            }else{
                System.out.println("Reserva no realizada, el usuario ha sobrepasado el límite de 5 reservas.");
            }
        }
    }
    
    public static boolean libroTieneReserva(ArrayList<Reserva> listaReservas, Libro libro){
        boolean reserva=false;
        int i=0;
        while (!reserva && i<listaReservas.size()) {
            if(listaReservas.get(i).getLibro().getISBN().equalsIgnoreCase(libro.getISBN())){
                reserva=true;
            }i++;
        }
        return reserva;
    }

    public static void eliminarReserva(ArrayList<Reserva> listaReservas){
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce el DNI del usuario: ");
        String dni=input.nextLine();
        System.out.println("Introduce el ISBN del libro:");
        String isbn=input.nextLine();

        int i=0;

        boolean encontrado= false;

        while (!encontrado && i<listaReservas.size()) {
            if(listaReservas.get(i).getPersona().getDni().equalsIgnoreCase(dni) && listaReservas.get(i).getLibro().getISBN().equalsIgnoreCase(isbn)){
                encontrado=true;

                System.out.println("Reserva eliminada");

                listaReservas.get(i).getLibro().setNumCopiasDisponibles(listaReservas.get(i).getLibro().getNumCopiasDisponibles()+1);
                listaReservas.remove(i);
            }
            
        }
        if(!encontrado){
            System.out.println("No se ha encontrado ningúna coincidencia");
        }
    }


    
}
