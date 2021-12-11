package practica3;
//Pida al usuario 5 números y diga si estos estaban en orden decreciente, 	creciente o desordenados.
public class ej2 {
    public static void main(String[] args) {
                
        Scanner entrada1=new Scanner(System.in);
        
        Scanner entrada2=new Scanner(System.in);
        
        Scanner entrada3=new Scanner(System.in);
        
        Scanner entrada4=new Scanner(System.in);
        
        Scanner entrada5=new Scanner(System.in);

        System.out.println("ingrese un número: ");
        int num1= entrada1.nextInt();
        
        System.out.println("ingrese un número: ");
        int num2= entrada2.nextInt();

        System.out.println("ingrese un número: ");
        int num3= entrada3.nextInt();

        System.out.println("ingrese un número: ");
        int num4= entrada4.nextInt();

        System.out.println("ingrese un número: ");
        int num5= entrada5.nextInt();

        if (num1>num2>num3>num4>num5){
            System.out.println("Los numeros estan ordenados de forma descendente");
        }
        else if (num1<num2<num3<num4<num5){
            System.out.println("Los numeros estan ordenados de forma ascendente");
        }

    }
    
}
