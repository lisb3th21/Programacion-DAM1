package com.practicaexamenfinal.examen2;

public class Sanitarios extends Persona{
    private String especialidad;
    private int numDias;



    
    public String getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Sanitarios(String nombre, String primerApellido, String segundoApellido, String especialidad, int numDias) {
        super(nombre, primerApellido, segundoApellido);
        this.setEspecialidad(especialidad);
        this.setNumDias(numDias);
    }


    public Sanitarios() {
        super();
    }

    
}
