#Escribe un programa que pida dos números y escriba la suma de enteros desde
# el primero hasta el último.
print ("Programa que suma enteros desde el primerpo hasta el último")
#declaraamos dos variables del primer y segundo numero que 
#se introduciran por teclado
num1=int(input("Ingrese un número entero: "))
num2=int(input("Ingrese un número mayor que "+str(num1)+" : "))
#creamos un bucle si el primer numero es mayor al segundo numero
#volviendo a pedir al usuario que ingrese los numeros 
while num1>num2:
    print ("el número "+str(num1)+" es mayor que el número "+str(num2)+".\nVuelva a introducir los numeros")
    num1=int(input("Ingrese un número entero: "))
    num2=int(input("Ingrese un número mayor que "+str(num1)+" : "))
#declaramos una lista vacia para que posteriormente se almacenen los datos
lista=[ ]
#ingresamos los datos a la lista
for x in list(range(num1,num2+1)):
    lista.append(x)   
#print(lista)
#sumamos los valores de la lista 
suma=sum(lista)
print ("La suma entre el número "+str(num1)+" el numero "+str(num2)+" es "+str(suma))
