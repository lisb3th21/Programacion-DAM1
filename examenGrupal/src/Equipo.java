import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	//Atributos
	private String nom;
	private ArrayList<String> listaJugadores;
	
	//Getters i setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<String> getListaJugadores() {
		return listaJugadores;
	}
	public void setListaJugadores(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	//Constructors
	
	public Equipo () {
		this.listaJugadores=new ArrayList<String>();
	}
	public Equipo(String nom,ArrayList<String> listaJugadores) {
		this.listaJugadores = new ArrayList<String>();
		this.nom= new String();
		this.setNom(nom);
		this.listaJugadores = listaJugadores;
	}
	//toString
	@Override
	public String toString() {
		return "Equipo [nom=" + nom + ", listaJugadores=" + listaJugadores + "]";
	}
	//Metodes
	public static int buscarEquipo(ArrayList <Equipo> listaEquipos) {
		Scanner teclat = new Scanner(System.in);
		String nombre = new String();
		boolean trobat = false;
		int i = 0;
		int posicio = -1;
		System.out.println("Introdueix el nom del equip a cercar: ");
		nombre = teclat.nextLine();
		while (!trobat && i<listaEquipos.size()) {
			if (listaEquipos.get(i).getNom().equals(nombre)) {
				posicio = i;
				trobat = true;
				System.out.println("S' ha trobat l'equip.");
			}
			i++;
		}
		if (!trobat) {
			System.out.println("No s' ha trobat l'equip.");
		}
		return posicio;
		
	}
	public static void añadirJugador(ArrayList<Equipo> listaEquipos) {
		Scanner teclat = new Scanner(System.in);
		String texte = new String();
		int posicio;
		posicio = Equipo.buscarEquipo(listaEquipos);
		if (posicio>-1) {
			System.out.println("Introdueix el nom del jugador");
			texte = teclat.nextLine();
			listaEquipos.get(posicio).listaJugadores.add(texte);
			System.out.println("S' ha afegit el jugador");
		}
		
	}
	public static void eliminarJugador(ArrayList <Equipo> listaEquipos) {
		Scanner teclat = new Scanner(System.in);
		String texte = new String();
		int posicio;
		int i = 0;
		boolean trobat = false;
		posicio = Equipo.buscarEquipo(listaEquipos);
			if (posicio>-1 && listaEquipos.get(posicio).listaJugadores.size()>1) {
				System.out.println("Introdueix el nom del jugador a eliminar");
				while (!trobat && i<listaEquipos.get(posicio).listaJugadores.size()) {
					if (listaEquipos.get(posicio).listaJugadores.get(i).equals(texte)) {
						listaEquipos.get(posicio).listaJugadores.remove(i);
						trobat = true;
						System.out.println("S' ha eliminat el jugador");
					}
					i++;
				}
			}
			else if (posicio>-1 && listaEquipos.get(posicio).listaJugadores.size()>0) {
				System.out.println("No se pot eliminar el jugador ja que l'equip es quedaria sense jugadors");
			}
	}
	public static void añadirEquipo(ArrayList<Equipo> listaEquipos) {
		//Equipo nuevo = new Equipo();
		Scanner teclat = new Scanner(System.in);
		ArrayList <String> jugadores = new ArrayList<>();
		String salir="";
		String jugador = new String();
		System.out.println("Introdueix el nom del equip: ");
		//nuevo.setNom(teclat.nextLine());
		String nom=teclat.nextLine();
		do {
			System.out.println("Introduce un jugador: ");
			jugador = teclat.nextLine();
			jugadores.add(jugador);
			System.out.println("Si no vols introduir mes jugadors escriu 'sortir'");
			salir=teclat.nextLine().toLowerCase();
		}
		while (!salir.equals("sortir"));
		
		Equipo nuevo=new Equipo(nom, jugadores);
		listaEquipos.add(nuevo);
		System.out.println("S ha creat l'equip");
	}
	public static void eliminarEquipo (ArrayList <Equipo> listaEquipos,ArrayList <Integer> listaPuntuacions) {
		int posicio = Equipo.buscarEquipo(listaEquipos);
		if (posicio>-1 && listaPuntuacions.get(posicio)==0) {
			listaEquipos.remove(posicio);
			listaPuntuacions.remove(posicio);
			System.out.println("S' ha borrat l equip");
		}
		else if (posicio>-1 && listaPuntuacions.get(posicio)>0) {
			System.out.println("No se pot borrar l' equip ja que te "+listaPuntuacions.get(posicio)+" punts");
		}
	}
	
}
