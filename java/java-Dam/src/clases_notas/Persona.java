package clases_notas;
import java.util.Scanner;
public class Persona{
    private String nom;
    private String llinatge;
    private String DNI;
    private int edad;

    public String getNom() {
        return nom;
    }
    public String getLlinatge() {
        return llinatge;    
    }
    public String getDNI(){
        return DNI;
    }
    public int getEdad() {
        return edad;
    }

    //LOS SET
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setLlinatge(String llinatge){
        this.llinatge=llinatge;
    }
    public void setDNI(String DNI) {
        this.DNI=DNI;    
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    //contrsuctor
    public Persona(String nom, String llinatge, String DNI, int edad){
        this.nom=nom.toUpperCase();
        this.llinatge=llinatge;
        this.edad=edad;
        this.DNI=DNI;
    }
    public Persona(){
        this.nom=null;
        this.llinatge=null;
        this.DNI=null;
        this.edad=0;
    }
    public void solicitarDatos(){
        Scanner input=new Scanner(System.in);
        String texto= new String();
        System.out.println("Introduce tu nombre");
        texto=input.nextLine();
        this.setNom(texto);
    }


    

    public boolean equals(Persona persona){
        boolean resultat=false;
        if (this.nom.equals(persona.getNom()) && this.DNI.equals(persona.getDNI()) && this.edad==persona.getEdad){
            return true;    
            }else{
                return false;
            }
    }

}
