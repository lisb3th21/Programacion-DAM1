#Pida al usuario 5 números y diga cuál es el mayor y cuál el menor.
print("Bienvenido!! Ingrese 5 números y le \n regresaremos el número mayor y menor :)")
#creamos una lista vacia
lista = []
#pedimos que nos ingrese un numero 5 veces 
for x in range (5):
    num=  str(input("Ingrese un número: "))
    #ingresamos los valores en la lista 
    lista.append (num)
#ordenamos la lista 
lista.sort()
#seleccionamos el ultimo y primer caracter (ya que lo tomamos como string) para que nos diga#el numero mayor y menor respectivamente
print ("El numero mayor es "+ lista[-1] + " y el número menor es "+ lista[0])
