package practica6;

import java.util.HashMap;

public class ej14 {
    public static String fechaString(String fecha) {
        String fechaString="";
        String listaFecha[]=fecha.split("/");
        HashMap<Integer, String> meses= new HashMap<Integer, String>();
        meses.put(01, "Enero");
        meses.put(02, "Febrero");
        meses.put(03, "Marzo");
        meses.put(04, "Abril");
        meses.put(05, "Mayo");
        meses.put(6, "Junio");
        meses.put(7, "Julio");
        meses.put(8, "Agosto");
        meses.put(9, "Septiembre");
        meses.put(10, "Octubre");
        meses.put(11, "Noviembre");
        meses.put(12, "Diciembre");

        if(Integer.valueOf(listaFecha[1])>12 || Integer.valueOf(listaFecha[1])<1){
            fechaString="La fecha ingresada no existe";

        }else{
            fechaString=listaFecha[0]+" de "+meses.get(Integer.valueOf(listaFecha[1]))+" del "+listaFecha[2];

        }
        return fechaString;
        
    }
    public static void main(String[] args) {
        System.out.println(fechaString("22/111/2020"));
    }
}
