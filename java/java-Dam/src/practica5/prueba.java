package practica5;
public class prueba {
    public class GrassHopper {
        public static int summation(int n) {
            int resultado=0;
            for (int i=n; i>0;i--){

                resultado+=i;
            }
            return resultado;
        }
        public static void main(String[] args) {
            System.out.println(summation(3));
        }
    }
    
    }

