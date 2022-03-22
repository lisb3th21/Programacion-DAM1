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

    
    
    
    
    
}
