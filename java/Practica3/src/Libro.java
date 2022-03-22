import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String editorial;
    private int numCopias;
    private int numCopiasDisponibles;
    private static int numTitulos=0;
    
    //getters y setters
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getNumCopias() {
        return numCopias;
    }
    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    public int getNumCopiasDisponibles() {
        return numCopiasDisponibles;
    }
    public void setNumCopiasDisponibles(int numCopiasDisponibles) {
        this.numCopiasDisponibles = numCopiasDisponibles;
    }
    public static int getNumTitulos() {
        return numTitulos;
    }
    protected static void setNumTitulos(int numTitulos) {
        Libro.numTitulos = numTitulos;
    }
    

    //constructores
    public Libro(String iSBN, String titulo, String autor, String editorial, int numCopias, int numCopiasDisponibles) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numCopias = numCopias;
        this.numCopiasDisponibles = numCopiasDisponibles;
        numTitulos++;
    }

    public Libro(){
        this(null, null, null, null, 1, 1);
    }

    //constructor copia
    public Libro(Libro libro){
        this(libro.getISBN(), libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getNumCopias(), libro.getNumCopiasDisponibles());
    }
    
    
    //override de toString
    @Override
    public String toString() {
        return "Libro [ISBN=" + ISBN + ", autor=" + autor + ", editorial=" + editorial + ", numCopias=" + numCopias
                + ", numCopiasDisponibles=" + numCopiasDisponibles + ", titulo=" + titulo + "]";
    }

    //método añadir libro 
    public static void anadirLibro(ArrayList <Libro> listaLibros, Libro libro){
        listaLibros.add(libro);
    }

    //método solicitar datos del libro
    public static void anadirLibro(ArrayList <Libro> listaLibros){
        Scanner input= new Scanner(System.in);
        Libro libro=new Libro();

        System.out.println("Introduce el ISBN del libro: ");
        libro.setISBN(input.nextLine());

        System.out.println("Ingrese el título del libro: ");
        libro.setTitulo(input.nextLine());

        System.out.println("Ingrese el autor del libro:");
        libro.setAutor(input.nextLine());

        System.out.println("Ingrese la editorial:");
        libro.setEditorial(input.nextLine());

        System.out.println("Ingrese el número de copias totales:");
        libro.setNumCopias(input.nextInt());input.nextLine();

        System.out.println("Ingrese el número de copias disponibles: ");
        libro.setNumCopiasDisponibles(input.nextInt());input.nextLine();


        listaLibros.add(libro);
    }

    public static int buscarLibroReservas(ArrayList<Reserva> listaReservas){
        Scanner input= new Scanner(System.in);
        String ISBN;
        boolean encontrado=false;
        int posicion=-1;

        System.out.println("Introduce el ISBN a buscar: ");
        ISBN=input.nextLine();

        int i=0;

        while (!encontrado && i<listaReservas.size()){
            if(listaReservas.get(i).getLibro().getISBN().equals(ISBN)){
                encontrado=true;
                posicion=i;
            } i++;
        }
        if (encontrado){
            System.out.println("Se ha encontrado el libro en la posicion "+posicion);

        }else{
            System.out.println("No se ha encontrado ninguna coincidencia.");
        }
        return posicion;
    }


    //buscal libro isbn 
    public static int bucarLibroISBN(ArrayList<Libro> listaLibros){
        int posicion=-1;
        Scanner input= new Scanner(System.in);
        String ISBN;
        boolean encontrado=false;
        System.out.println("Introduce el ISBN a buscar: ");
        ISBN=input.nextLine();

        int i=0;

        while(!encontrado && i<listaLibros.size()){
            if(listaLibros.get(i).getISBN().equalsIgnoreCase(ISBN)){
                encontrado=true;
                posicion=i;
            }i++;
        }

        if(encontrado){
            //---
        }else{
            System.out.println("No se ha encontrado ninguna coincidencia.");
        }

        return posicion;
    }

    public static void buscarLibroPorTitulo(ArrayList<Libro> listaLibros){
        Scanner input= new Scanner(System.in);
        String titulo;

        System.out.println("Ingrese el titulo: ");
        titulo=input.nextLine().toUpperCase();

        boolean encontrado=false;

        for(int i=0; i<listaLibros.size(); i++){
            if(listaLibros.get(i).getTitulo().toUpperCase().contains(titulo)){
                encontrado=true;
                System.out.println(listaLibros.get(i).toString());
            }
        }
        if(!encontrado){
            System.out.println("No se ha encontrado ningúna coincidencia");
        }

    }

    public static void eliminarLibro(ArrayList <Libro> listaLibros){
        int posicion= bucarLibroISBN(listaLibros);
        Scanner input= new Scanner(System.in);

        if(posicion>=0){
            boolean reserva= Reserva.libroTieneReserva(listaReservas, listaLibros.get(posicion));
            if(!reserva){
                System.out.println("Seguro que quieres eliminar el libro?(s/n)");
                String respuesta=input.nextLine();
                if(respuesta.equalsIgnoreCase("s")){
                    listaLibros.remove(posicion);
                    System.out.println("El libro se ha eliminado");
                }
            }else{
                System.out.println("El libro esta en reserva, no se puede eliminar");
            }
        }
    }
    
}
