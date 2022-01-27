package clases_notas;
import java.util.Scanner;
/*
public class Persona {
	//Atributs
	private String nom = new String ();
	private String cognoms = new String ();
	private Integer edat;
	private String nif = new String ();
	private Coche coche= new Coche();
	
	
	//Constructors
	public Persona(String nom, String cognoms, Integer edat, String nif, Coche coche) {
		this.nom = nom.toUpperCase();
		this.cognoms = cognoms;
		this.edat = edat;
		this.nif = nif;
		this.coche= coche;
	}
	
	public Persona() {
		this.nom = null;
		this.cognoms = null;
		this.edat = null;
		this.nif = null;
		this.coche=new Coche();
	}
	
	public Persona(Persona persona) {
		this.nom = persona.getNom();
		this.cognoms = persona.getCognoms();
		this.edat = persona.getEdat();
		this.nif = persona.getNif();
		this.coche=persona.getCoche();
	}
	
	//Setters i getters
	public void setNom(String nom) {this.nom = nom.toUpperCase();}
	public void setCognoms(String cognoms) {this.cognoms = cognoms;}
	public void setEdat(Integer edat) {this.edat=edat;}
	public void setNif(String nif) {this.nif = nif;}
	public void setCoche(Coche coche){ this.coche=coche;}
	public String getNom() {return this.nom;}
	public String getCognoms() {return this.cognoms;}
	public Integer getEdat() {return this.edat;}
	public String getNif() {return this.nif;}
	public Coche getCoche(){return this.coche;}

	//Altres m�todes
	public void solicitarDades() {
		Scanner teclat = new Scanner(System.in); 
		String text = new String();
		Integer dada;
		
		System.out.print("Introdueix el nom: ");
		text =  teclat.nextLine();
		this.setNom(text);
		
		System.out.print("Introdueix els cognoms: ");
		text =  teclat.nextLine();
		this.setCognoms(text);
		
		System.out.print("Introdueix l'edat: ");
		dada = teclat.nextInt();
		this.setEdat(dada);
		//Feim un nexLine() per buidar el buffer
		teclat.nextLine();
		
		System.out.print("Introdueix el nif: ");
		text = teclat.nextLine();
		this.setNif(text);

		System.out.println("Introduce los datos de tu coche: ");
		coche.solicitarDatos();

		
		teclat.close();
	}
	
	public void mostrarDades () {
		System.out.println("Nom: "+this.nom);
		System.out.println("Cognoms: "+this.cognoms);
		System.out.println("Edat: "+this.edat);
		System.out.println("NIF: "+this.nif);
		System.out.println("Coche: ");
		coche.mostrarDatos();
		
	}
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.solicitarDades();
		System.out.println();
		System.out.println();
		persona.mostrarDades();

	}

}
*/