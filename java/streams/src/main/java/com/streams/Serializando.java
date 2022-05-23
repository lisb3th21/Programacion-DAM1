package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [apellido=" + apellido + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

}

class Empleado extends Persona implements Serializable {
    private String empresa;
    private float sueldo;

    public Empleado(String nombre, String apellido, int edad, String empresa, float sueldo) {
        super(nombre, apellido, edad);
        this.empresa = empresa;
        this.sueldo = sueldo;

    }

    @Override
    public String toString() {
        return "Empleado [empresa=" + empresa + ", sueldo=" + sueldo + "]";
    }
}

public class Serializando {
    public static void main(String[] args) {

        Empleado[] personal = new Empleado[3];

        personal[0] = new Empleado("Juan", "Llado", 23, "Brico", 2000);
        personal[1] = new Empleado("Luis", "Sanchex", 54, "Brico", 2000);
        personal[1] = new Empleado("Rebeca", "Toala", 32, "Brico", 1500);

        try {
            ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("empleados.txt"));
            write.writeObject(personal);
            System.out.println();
            write.close();
            ObjectInputStream read = new ObjectInputStream(new FileInputStream("empleados.txt"));

            Empleado[] recuperar = (Empleado[]) read.readObject();
            read.close();

            for (Empleado empleado : recuperar) {
                System.out.println(empleado);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}