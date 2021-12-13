package practica4;
/*
Escribe un programa que escriba a los siguientes números (la separación entre número es para
facilitar cuántos números se deben escribir en cada bucle) y en el que la función range que
utilices tenga un ÚNICO argumento y que el valor de este se corresponda con el número de
elementos que aparecen en la lista ( por Ejemplo, para la primera lista range (10)).
*/
public class ej1 {
    //En este metodo añadiremos la logica para que cree los bucles 
    static void bucles(int inicio, int salto, int limite){

       String resultado= "";
        for (int i=inicio; i<=limite; i=i+salto ){
            String num= (i +" - ");
            resultado=resultado+(num); 
            
        }
        System.out.println(resultado);
            
    }
    //Creamos un metodo para numeros que se resten 
    static void retroceder(int inicio, int limite, int salto){
        String resultado="";
        for (int i=inicio; i>=limite; i=i+salto){
            String num= (i +" - ");
            resultado=resultado+(num);
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {

        
        bucles(1, 1, 10);
        bucles(2, 2, 20);
        bucles(20, 2, 38);
        bucles(10, 4, 30);
        retroceder(40, 0, -5);
        
              
    }
}
