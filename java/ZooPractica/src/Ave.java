import java.util.ArrayList;
import java.util.Scanner;

public class Ave extends Animal {
    private static int numeroAves = 0;
    private int numeroAlas;
    private int longitudVuelvo;

    public static int getNumeroAves() {
        return numeroAves;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public int getLongitudVuelo() {
        return longitudVuelvo;
    }

    protected static void setNumeroAves(int numeroAves) {
        Ave.numeroAves = numeroAves;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public void setLongitudVuelo(int longitudVuelvo) {
        this.longitudVuelvo = longitudVuelvo;
    }

    public static void incrementoAves() {
        Ave.numeroAves++;
    }

    public Ave() {
        super();
        incrementarAnimales();
    }

    public Ave(String nombre, float peso, int longitudVuelvo, int numeroAlas) {
        super(nombre, peso);
        this.longitudVuelvo = longitudVuelvo;
        this.numeroAlas = numeroAlas;
        incrementoAves();
    }

    public Ave(Ave ave) {
        super(ave.getNombre(), ave.getPeso());
        this.setLongitudVuelo(ave.getLongitudVuelo());
        this.setNumeroAlas(ave.getNumeroAlas());
        incrementoAves();
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Longitud de vuelo: " + this.getLongitudVuelo() +
                "\nNúmero de alas: " + this.numeroAlas);
    }

    public static void mostrarOrdenado(ArrayList<Animal> listaAnimales) {
        ArrayList<Animal> listaOrdenada = new ArrayList<>();
        ArrayList<Animal> listaSoloAves = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        // hacemos una lista de solo aves
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (listaAnimales.get(i).getClass() == Ave.class) {
                listaSoloAves.add(listaAnimales.get(i));
            }
        }
        do {
            System.out.println("¿Cómo desea visualizar a las aves?");
            System.out.println("1. Longitud de vuelo");
            System.out.println("2. Numero de alas");
            opcion = input.nextInt();
        } while (opcion != 1 || opcion != 02);
        for (int i = 0; i < listaAnimales.size(); i++) {
            if (opcion == 1) {
                if (listaOrdenada.isEmpty()) {
                    listaOrdenada.add(listaAnimales.get(i));
                } else {
                    ordenarPorVuelo(listaAnimales, i, listaOrdenada);
                }
            } else if (opcion == 2) {
                ordenarPorAlas(listaAnimales, i, listaOrdenada);
            }
        }

    }

    public static void ordenarPorVuelo(ArrayList<Animal> listaAnimales, int i, ArrayList<Animal> listaOrdenada) {
        int j = 0;
        while (j < listaOrdenada.size()
                && ((Ave) listaAnimales.get(i)).getLongitudVuelo() > ((Ave) listaOrdenada.get(j)).getLongitudVuelo()) {
            j++;
        }
        listaOrdenada.add(j, listaAnimales.get(i));
    }

    public static void ordenarPorAlas(ArrayList<Animal> listaAnimales, int i, ArrayList<Animal> listaOrdenada) {
        int j = 0;
        while (j < listaOrdenada.size()
                && ((Ave) listaAnimales.get(i)).getNumeroAlas() > ((Ave) listaOrdenada.get(j)).getNumeroAlas()) {
            j++;
        }
        listaOrdenada.add(j, listaAnimales.get(i));
    }

    public static void mostrarListaOrdenada(ArrayList <Animal> listaOrdesada){
        for(int i=0; i<listaOrdesada.size();i++){
            System.out.println("");
            listaOrdesada.get(i).mostrarAnimal();
        }
    }

    public static void anadirAve(ArrayList<Animal> listaAnimales){
        Scanner input= new Scanner(System.in);
        Ave ave= new Ave();
        System.out.println("Ingrese el nombre de la ave");
        ave.setNombre(input.nextLine());
        System.out.println("Ingrese el peso de la ave:");
        ave.setPeso(input.nextFloat());
        System.out.println("Ingrese el numero de alas:");
        ave.setNumeroAlas(input.nextInt());
        System.out.println("Ingrese la longitud de vuelo:");
        ave.setLongitudVuelo(input.nextInt());
        listaAnimales.add(ave);
    }

    @Override
    public void mostrarContador() {
        Animal.getnumeroAnimales();
        Ave.getNumeroAves();
    }

}
