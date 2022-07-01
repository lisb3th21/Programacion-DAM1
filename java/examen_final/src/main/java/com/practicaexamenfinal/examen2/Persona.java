package com.practicaexamenfinal.examen2;

public class Persona {
    protected  int id =0;
    private String nombre;
    private String  primerApellido;
    private String segundoApellido;
    protected static int numPersonas=0;



    public  int getId() {
        return id;
    }
    public  void setId() {
        numPersonas++;
        this.id=numPersonas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public static int getNumPersonas() {
        return numPersonas;
    }
    public static void setNumPersonas(int numPersonas) {
        Persona.numPersonas++;
    }



    /**
     * Constructir
     */
    public Persona(String nombre, String primerApellido, String segundoApellido) {
        this.setId();
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
    }
    public Persona() {
    }

    
    

}
