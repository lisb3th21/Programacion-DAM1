package practica4;
//haz un trinagulo centrado :)
public class ej10 {
    static void triangulo( int altura){
        String resultado=""; 
        String linea="";
        for (int i=altura; i>=1; i--){
            linea=new String(new char[i]).replace("\0", "  ") + new String(new char[i]).replace("\0", "# ")+"\n";
            resultado+=linea;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        triangulo(6);
    }
    
}
