package com.practicaexamenfinal.examen2;

public class Docentes extends Persona {
    
    private String titulacion;
    private float puntos;



    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }



    public Docentes() {
        super();
    }

    public Docentes(String nombre, String primerApellido, String segundoApellido, String titulacion, float puntos) {
        super(nombre, primerApellido, segundoApellido);
        
        this.setTitulacion(titulacion);
        this.setPuntos(puntos);
    }
}
