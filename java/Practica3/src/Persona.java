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


   
    vpublic static void anadirPersona(ArrayList<Persona> lista){
        Scanner input = new Scanner(System.in);
        Persona persona= new Persona();

        System.out.println("Introduce el nombre");
        persona.setNombre(input.nextLine());
        



        lista.add(persona);
    }

    
}
