#Pida al usuario tres números y un cuarto número, y compruebe si este último es divisor de los tres números primeros.
 	
print ("Bienvenido!! Este programa analizara si un número puede ser divisible para otros :)")

num1=int (input("Por favor ingrese un número entero: "))
num2=int (input("Por favor ingrese un número entero: "))
num3=int (input("Por favor ingrese un número entero: "))
div= int (input("Por favor ingrese el número que desea comprobar\nque sea un divisor de los anteriores: "))

if (num1 % div) == 0 and  (num2 % div) == 0 and (num3 % div) == 0:
    print ("El número "+str(div)+" es divisible para los numeros "+str(num1)+ ", "+str(num2)+ " y "+str(num3))
else:
    print("El numero "+str(div)+ " no es divisible para los números "+str(num1)+ ", "+str(num2)+ " y "+str(num3))
