package com.practicaexamenfinal.examen2;

import java.util.ArrayList;

public class Plaza {
    private int id;
    private Tipo tipo;
    private boolean adjudicada;
    private Persona persona;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public boolean isAdjudicada() {
        return adjudicada;
    }
    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public Plaza(int id, Tipo tipo, boolean adjudicada, Persona persona) {
        this.setId(id);
        this.setTipo(tipo);
        this.setAdjudicada(adjudicada);
        this.setPersona(persona);
    }

    public Plaza(int id, Tipo tipo) {
        this.setId(id);
        this.setTipo(tipo);
       
    }


    public static void adjudicarPlazas(ArrayList<Plaza> plazas, ArrayList<Persona> personas){
        for (int i=0; i<plazas.size();i++) {
			int index = -1;
			if (plazas.get(i).getTipo()==Tipo.D) {
				Docentes docentess = new Docentes();
				docentess.setPuntos(-1);
				for (int j=0;j<personas.size();j++) {
					if (personas.get(j) instanceof Docentes) {
						if (((Docentes)(personas.get(j))).getPuntos()>docentess.getPuntos()) {
							docentess=(Docentes) personas.get(j);
							index=j;
						}
					}
				}
				if (docentess.getPuntos()!=-1) {
					plazas.get(i).setPersona(docentess);
					plazas.get(i).setAdjudicada(true);
					personas.remove(index);
				}
				
			}else {
				Sanitarios sanitariossSanitarioss = new Sanitarios();
				sanitariossSanitarioss.setNumDias(-1);
				for (int j=0;j<personas.size();j++) {
					if(personas.get(j) instanceof Sanitarios) {
						if (((Sanitarios)personas.get(j)).getNumDias()>sanitariossSanitarioss.getNumDias()) {
							sanitariossSanitarioss=(Sanitarios) personas.get(j);
							index = j;
						}
					}
				}
				if (sanitariossSanitarioss.getNumDias()!=-1) {
					plazas.get(i).setPersona(sanitariossSanitarioss);
					plazas.get(i).setAdjudicada(true);
					personas.remove(index);
				}
			}
		}
    }


    public static void mostrarAdjudicaciones(ArrayList<Plaza> plazas) {
		System.out.println("============================================\n"
				+ "La última adjudicación de plazas ha producido\n"
				+ "los siguientes resultados para DOCENTEsS\r\n"
				+ "============================================\r\n"
				+ "");
		for (int i=0;i<plazas.size();i++) {
			if (plazas.get(i).getTipo()==Tipo.D) {
				System.out.println(plazas.get(i).toString());
			}
		}
		
		
		System.out.println("=============================================\r\n"
				+ "La última adjudicación de plazas ha producido\r\n"
				+ "los siguientes resultados para SANITARIOS\r\n"
				+ "=============================================\r\n"
				+ "");
		for (int i=0;i<plazas.size();i++) {
			if (plazas.get(i).getTipo()==Tipo.S) {
				System.out.println(plazas.get(i).toString());
			}
		}
	}public static void simularAdjuducacion(ArrayList<Plaza> listaPlaza, ArrayList<Persona> listaPersona) {
		Plaza plaza0 = new Plaza(0,Tipo.D);
		Plaza plaza1 = new Plaza(1,Tipo.S);
		Plaza plaza2 = new Plaza(2,Tipo.D);
		Plaza plaza3 = new Plaza(3,Tipo.S);
		Plaza plaza4 = new Plaza(4,Tipo.D);
		Plaza plaza5 = new Plaza(5,Tipo.S);
		Plaza plaza6 = new Plaza(6,Tipo.D);
		Plaza plaza7 = new Plaza(7,Tipo.S);
		Plaza plaza8 = new Plaza(8,Tipo.D);
		Plaza plaza9 = new Plaza(9,Tipo.S);
		
		listaPlaza.add(plaza0);
		listaPlaza.add(plaza1);
		listaPlaza.add(plaza2);
		listaPlaza.add(plaza3);
		listaPlaza.add(plaza4);
		listaPlaza.add(plaza5);
		listaPlaza.add(plaza6);
		listaPlaza.add(plaza7);
		listaPlaza.add(plaza8);
		listaPlaza.add(plaza9);
		
		Docentes p0 = new Docentes("nombre0","apellido0","apellido0","titulacion0", (float) 2.4);
		Docentes p1 = new Docentes("nombre1","apellido1","apellido1","titulacion1", (float) 3.2);
		Docentes p2 = new Docentes("nombre2","apellido2","apellido2","titulacion2", (float) 2.7);
		Sanitarios p3 = new Sanitarios("nombre3","apellido3","apellido3","titulacion3", 13);
		Sanitarios p4 = new Sanitarios("nombre4","apellido4","apellido4","titulacion4", 7);
		Sanitarios p5 = new Sanitarios("nombre5","apellido5","apellido5","titulacion5", 31);
		
		listaPersona.add(p0);
		listaPersona.add(p1);
		listaPersona.add(p2);
		listaPersona.add(p3);
		listaPersona.add(p4);
		listaPersona.add(p5);
		
	}


    @Override
	public String toString() {
		String texto =
				"------------------------------------\n"
				+ "ID Plaza "+this.getId()+"\n"
				+ "Tipo: "+this.getTipo()+"\n";
		if (this.isAdjudicada()) {
			texto=texto+
					"Adjudicada: ADJUDICADA\n"
					+ "ID: "+this.getPersona().getId()+"\n"
					+ "Nombre: "+this.getPersona().getNombre()+"\n"
					+ "Apellido1: "+this.getPersona().getPrimerApellido()+"\n"
					+ "Apellido2: "+this.getPersona().getSegundoApellido()+"\n"
					;
			if (this.getTipo()==Tipo.D) {
				texto=texto
						+"Titulacion: "+((Docentes)this.getPersona()).getTitulacion()+"\n"
						+ "Puntos: "+((Docentes)this.getPersona()).getPuntos()+"\n"
						;
			}else {
				texto=texto
						+"Especialidad: "+((Sanitarios)this.getPersona()).getEspecialidad()+"\n"
						+ "Dias: "+((Sanitarios)this.getPersona()).getNumDias()+"\n"
						;
			}
		}else {
			texto=texto+
					"Adjudicada: NO ADJUDICADA\n";
		}
		
		return texto;
	}

    public static void main(String[] args) {
        ArrayList<Plaza> listaPlaza = new ArrayList<Plaza>();
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		simularAdjuducacion(listaPlaza,listaPersona);
		adjudicarPlazas(listaPlaza,listaPersona);
		mostrarAdjudicaciones(listaPlaza);
    }
    
}
