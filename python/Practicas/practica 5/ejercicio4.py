#Escribe un programa que pida un número y calcule su factorial.
print("PROGRAMA PARA CALCULAR EL FACTORIAL")
#declaramos una variable para que ingrese el numero que desee calcular el factorial


num=int(input("Por favor, ingrese un numero entero:"))
#declaramos una lista vacia para luego almacenar los numeros desde el cero hasta
#el numerp que se ha introducirdo
lista=[ ]
for x in list(range(0,num+1)):
    lista.append(x)
#print (lista)
#si imprimimos la lista a este punto, tendremos como primer elemento el cero
#removemos el cero, ya q cualquier numero multiplicado por cero es cero
lista.remove(0)
#declaramos una variable con el numero 1(el numero neutro de la multiplicacion)
producto=1
for i in lista:
    producto *=i

print ("El factorial de "+str(num)+ " es "+str(producto))
