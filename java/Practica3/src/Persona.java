import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String contrasena;

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

     //constructores
    public Persona(String nombre, String apellidos, String dni, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    public Persona(){
        this(null, null, null, "contrasena");
    }

    public Persona(Persona persona){
        this(persona.getNombre(), persona.getApellidos(), persona.getDni(), persona.getContrasena());
    }
    

    //toString
    @Override
    public String toString() {
        return "Persona [apellidos=" + apellidos + ", contrasena=" + contrasena + ", dni=" + dni + ", nombre=" + nombre
                + "]";
    }

    public static void anadirPersona(ArrayList<Persona> lista, Persona usuario){
        lista.add(usuario);
    }


   
    public static void anadirPersona(ArrayList<Persona> lista){
        Scanner input = new Scanner(System.in);
        Persona persona= new Persona();

        System.out.println("Introduce el nombre");
        persona.setNombre(input.nextLine());

        System.out.println("Ingrese el apelllidos: ");
        persona.setApellidos(input.nextLine());

        System.out.println("Ingrese el DNI:");
        persona.setDni(input.nextLine());

        System.out.println("Introduce la contraseña:");
        persona.setContrasena(input.nextLine());
        
        lista.add(persona);
    }

    public static int buscarPersonaDNI(ArrayList<Persona> lista){
        int posicion=-1;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el DNI de la persona que buscas:");
        String dni= input.nextLine();

        int i=0;
        boolean encontrado=false;

        while(!encontrado && i<lista.size()){
            if(lista.get(i).getDni().equalsIgnoreCase(dni)){
                encontrado=true;
                posicion=i;
            }i++;
        }
        if(!encontrado){
            System.out.println("No se ha encontrado ningúna coincidencia.");
        }

        return posicion;
    }

    public static int buscarPersonaDNIaReserva(ArrayList<Reserva> lista){
        Scanner input = new Scanner(System.in);
        int posicion=-1;

        System.out.println("Introduce el DNI a buscar:");
        String dni=input.nextLine();

        int i=0;
        boolean encontrado= false;

        while (!encontrado && i<lista.size()) {
            if (lista.get(i).getPersona().getDni().equalsIgnoreCase(dni)) {
                encontrado=true;
                posicion=i;
            }i++;
        }

        if(!encontrado){
            System.out.println("No se ha encontrado ningúna coincidencia.");
        }
        return posicion;
    }

    public static void eliminarPersona(ArrayList<Persona> lista){
        if(buscarPersonaDNI(lista)>-1){
            lista.remove(buscarPersonaDNI(lista));
        }else{
            System.out.println("No se ha podido eliminar a la persona :'(");
        }
    }
    
}
