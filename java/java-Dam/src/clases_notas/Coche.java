package clases_notas;

import java.util.Scanner;

public class Coche {
    private String matricula=null;
    private int puertas=0;
    private boolean disponible=false;
    private float precio=0.0f;
    //GET
    public  String getMatricula(){
        return matricula;
    }

    public  int getPuertas(){
        return puertas;
    }

    public boolean getDisponible(){
        return disponible;
    } 
    public float getPrecio(){
        return precio;
    }

    //SET
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public void setPuertas(int puertas){
        this.puertas=puertas;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    //COSTRUCTORES

    public Coche(String matricula, int puertas, boolean disponible, float precio){
        this.matricula=matricula;
        this.puertas=puertas;
        this.disponible=disponible;
        this.precio=precio;
    }

    public Coche(String matricula, int puertas, float precio){
        this.matricula=matricula;
        this.puertas=puertas;
        this.disponible=true;
        this.precio=precio;
    }

    public Coche(){

    }


    //SOLICITAR DATOS
    public void solicitarDatos(){
        Scanner input=new Scanner(System.in);
         System.out.println("Ingrese la matricula:");
         String matricula=input.nextLine();
        this.setMatricula(matricula);
        System.out.println("Ingrese el numero de puertas:");
        int puertas=input.nextInt();
        this.setPuertas(puertas);
        System.out.println("Ingrese la disponibilidad:");
        boolean disponible=input.nextBoolean();
        this.setDisponible(disponible);
        System.out.println("Ingrese el precio:");
        float precio=input.nextFloat();
        input.nextLine();
        this.setPrecio(precio);
        input.close();
    }

    //MOSTRAR DATOS
    public void mostrarDatos(){
        System.out.println("Matricula: "+matricula);
        System.err.println("Número de puertas: "+puertas);
        if (disponible==true){
            System.out.println("Disponible");
        }else{
            System.out.println("No disponible");
        }
        System.out.println("Precio: "+ precio);
    }
    //CAMBIAR DISPONIBILIDAD
    public void cambiarDisponibilidad(){
        if (this.disponible==true){
            this.disponible=false;
        }else{
            this.disponible=true;
        }
    }
public static void main(String[] args) {
    Coche ford=new Coche();
    ford.solicitarDatos();
    ford.mostrarDatos();
    ford.cambiarDisponibilidad();
    ford.mostrarDatos();
    
}

    
}
