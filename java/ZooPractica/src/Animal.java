import java.util.Scanner;

abstract class Animal {
    //Contador de animales
    private static int numeroAnimales=0;
    //Atributos
    private String nombre;
    private float peso;

    public String getNombre(){return nombre;}
    public float getPeso(){return peso;}
    public static int getnumeroAnimales(){return numeroAnimales;}
    //setters
    public void setNombre(String nombre){this.nombre=nombre.toLowerCase();}
    public void setPeso(float peso){
        Scanner input=new Scanner(System.in);
        while(peso<=0){
            System.out.println("El peso debe ser mayor a 0. Ingrese un peso nuevo: ");
            peso=input.nextFloat();
        };
        this.peso=peso;}
    protected static void setNumeroAnimales(int numeroAnimales){Animal.numeroAnimales=numeroAnimales;}

/*

*/


/*

*/

    //Realizamos un método para que cada vez q creamos 1 animal, el cuntador sume 1
    public void incrementarAnimales(){
        numeroAnimales++;
    }
    //Constructor vacio
    public Animal(){
        incrementarAnimales();
    }
    //Constructor con parametros
    public Animal(String nombre, float peso){
        this.setNombre(nombre);
        this.setPeso(peso);
        incrementarAnimales();
    }
    //constructor copia
    public Animal(Animal animal){
        this.setNombre(animal.getNombre());
        this.setPeso(animal.getPeso());
        incrementarAnimales();
    }
    
    public void mostrarAnimal(){
        System.out.println("Nombre: "+this.getNombre()+"\nPeso: "+
        this.getPeso());
    }

    public abstract void mostrarContador();


}
