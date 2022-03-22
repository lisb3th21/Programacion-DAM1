import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Persona> listaAdmins;
    private ArrayList<Persona> listaUsuarios;
    private ArrayList <Reserva> listaReservas;

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    public ArrayList<Persona> getListaAdmins() {
        return listaAdmins;
    }
    public void setListaAdmins(ArrayList<Persona> listaAdmins) {
        this.listaAdmins = listaAdmins;
    }
    public ArrayList<Persona> getListaUsuarios() {
        return listaUsuarios;
    }
    public void setListaUsuarios(ArrayList<Persona> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }
    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    //constructores
    public Biblioteca(String nombre, ArrayList<Libro> listaLibros, ArrayList<Persona> listaAdmins,
            ArrayList<Persona> listaUsuarios, ArrayList<Reserva> listaReservas) {
        
        this.listaLibros=new ArrayList<Libro>();
        this.listaAdmins= new ArrayList<Persona>();
        this.listaUsuarios= new ArrayList<Persona>();
        this.listaReservas= new ArrayList<Reserva>();
        this.nombre = nombre;
        if(listaLibros!=null){
            this.setListaLibros(listaLibros);
        }
        if(listaAdmins!=null){
            this.setListaAdmins(listaAdmins);
        }
        if(listaUsuarios!=null){
            this.setListaUsuarios(listaUsuarios);
        }
        if(listaReservas!=null){
            this.setListaReservas(listaReservas);
        }
    }

    public Biblioteca(){
        this("Sin nombre", null, null, null, null);
    }

    public Biblioteca(Biblioteca biblioteca){
        this(biblioteca.getNombre(), biblioteca.getListaLibros(), biblioteca.getListaAdmins(), biblioteca.getListaUsuarios(), biblioteca.getListaReservas());
    }
    

    //toString
    @Override
    public String toString() {
        return "Biblioteca [listaAdmins=" + listaAdmins + ", listaLibros=" + listaLibros + ", listaReservas="
                + listaReservas + ", listaUsuarios=" + listaUsuarios + ", nombre=" + nombre + "]";
    }

    public void mostrarLibros(){
        for(int i=0; i<listaLibros.size(); i++){
            System.out.println(listaLibros.get(i).toString());
        }
    }

    public void mostrarLibrosDisponibles(){
        for(int i=0; i<listaReservas.size(); i++){
            if(listaLibros.get(i).getNumCopiasDisponibles()>0){
                System.out.println(listaLibros.get(i).toString());
            }
        }
    }
    public void mostrarResrvas(){
        for(int i=0; i<listaReservas.size(); i++){
            System.out.println(listaReservas.get(i).toString());
            
        }
    } 
    
}
