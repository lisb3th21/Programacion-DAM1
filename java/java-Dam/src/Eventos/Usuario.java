package Eventos;

public class Usuario {
    private String usuarioID;
    private String nombre;
    private String gmail;
    private String telefono;
    private String contraseña;

    
    public Usuario(String usuarioID, String nombre, String gmail, String telefono, String contraseña) {
        this.usuarioID = usuarioID;
        this.nombre = nombre;
        this.gmail = gmail;
        this.telefono = telefono;
        this.contraseña = contraseña;
    }


    public String getUsuarioID() {
        return usuarioID;
    }


    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getGmail() {
        return gmail;
    }


    public void setGmail(String gmail) {
        this.gmail = gmail;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Usuario [contraseña=" + contraseña + ", gmail=" + gmail + ", nombre=" + nombre + ", telefono="
                + telefono + ", usuarioID=" + usuarioID + "]";
    }

    
    
}
