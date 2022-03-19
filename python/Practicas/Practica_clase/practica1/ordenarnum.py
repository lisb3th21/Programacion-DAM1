#Pida al usuario 5 números y diga cuál es el mayor y cuál el menor.
print("Bienvenido!! Ingrese 5 números y le \n regresaremos el número mayor y menor :)")
#creamos una lista vacia
lista = []
#pedimos que nos ingrese un numero 5 veces 
for x in range (5):
    num=  float(input("Ingrese un número: "))
    max =num
    min=num
    #ingresamos los valores en la lista 
    lista.append (num)
    if num>max:
        max=max1
        max1 =num
    elif num<min:
        min=min1
        min1=num
#ordenamos la lista 
#seleccionamos el ultimo y primer caracter (ya que lo tomamos como string) para que nos diga#el numero mayor y menor respectivamente
print ("El numero mayor es "+ str(max1) + " y el número menor es "+ str(min1))
