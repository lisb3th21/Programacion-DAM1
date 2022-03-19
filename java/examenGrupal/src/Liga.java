import java.util.ArrayList;
import java.util.Scanner;

public class Liga {
	//Atributs
	private ArrayList <Equipo> listaEquipos;
	private ArrayList <Integer> listaPuntuacions;
	//Getters i setters
	
	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}
	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}
	public ArrayList<Integer> getListaPuntuacions() {
		return listaPuntuacions;
	}
	public void setListaPuntuacions(ArrayList<Integer> listaPuntuacions) {
		this.listaPuntuacions = listaPuntuacions;
	}
	//Constructors
	public Liga() {
		this(null,null);
	}
	
	public Liga(ArrayList<Equipo> listaEquipos, ArrayList<Integer> listaPuntuacions) {
		this.listaEquipos = new ArrayList<>();
		this.listaPuntuacions = new ArrayList<>();
		
		this.listaEquipos = listaEquipos;
		this.listaPuntuacions = listaPuntuacions;
	}
	//toString
	@Override
	public String toString() {
		return "Liga [listaEquipos=" + listaEquipos + ", listaPuntuacions=" + listaPuntuacions + "]";
	}
	
	//Métodes
	public static void verClasificacion(ArrayList <Equipo> listaEquipos, ArrayList <Integer> listaPuntuacions) {
		ArrayList<Equipo> listaEquiposOrdenada;
		ArrayList<Integer> listaPuntuacionesOrdenada;
		ArrayList<Equipo> listaEquiposCopia=listaEquipos;
		ArrayList <Integer> listaPuntuacionsCopia=listaPuntuacions;
		while (listaEquiposCopia.size()>0){
			for(int i=0; i<listaEquiposCopia.size()-1;i++){
				for(int j=0;)
				//if(listaPuntuacionsCopia.get(i))
			}
		}


		
		
	}
	public static void cambiarPuntuacion(ArrayList <Equipo> listaEquipos, ArrayList <Integer> listaPuntuacions) {
		Scanner teclat = new Scanner(System.in);
		int posicio = Equipo.buscarEquipo(listaEquipos);
		int puntuacio;
		if (posicio >-1) {
			System.out.println("Introdueix la nova puntuacio");
			puntuacio = teclat.nextInt();
			while (puntuacio<0) {
				System.out.println("Introdueix la nova puntuacio, ha de ser 0 o superior.");
				puntuacio = teclat.nextInt();
			}
			listaPuntuacions.set(posicio, puntuacio);
			System.out.println("S' ha modificat la puntuacio.");
		}
	}
	
	
	//Programa principal
	public static void main (String []args) {
		Scanner teclat = new Scanner(System.in);
		String texte = new String();
		Liga bbva = new Liga();
		int opcio;
		boolean salir = false;
		while (!salir) {
			System.out.println("---------MENU LIGA----------");
			System.out.println("1. Ver Clasificación ");
			System.out.println("2. Cambiar Puntuacion de un equipo ");
			System.out.println("3. Añadir Equipo ");
			System.out.println("4. Eliminar equipo ");
			System.out.println("5. Añadir Jugador a un equipo ");
			System.out.println("6. Eliminar Jugador en un equipo ");
			System.out.println("7. Salir");
			opcio = teclat.nextInt();
			switch(opcio){
			case 1: Liga.verClasificacion(bbva.getListaEquipos(),bbva.getListaPuntuacions()); break;
			case 2: Liga.cambiarPuntuacion(bbva.getListaEquipos(),bbva.getListaPuntuacions()); break;
			case 3: Equipo.añadirEquipo(bbva.getListaEquipos()); break;
			case 4: Equipo.eliminarEquipo(bbva.getListaEquipos(),bbva.getListaPuntuacions()); break;
			case 5: Equipo.añadirJugador(bbva.getListaEquipos()); break;
			case 6: Equipo.eliminarJugador(bbva.getListaEquipos()); break;
			case 7: salir = true; break;
			default: System.out.println("No has seleccionado ninguna opcion correcta.");
			}
		}
		
		
	}

}
