#Pida al usuario 5 números y diga si estos estaban en orden decreciente, creciente o desordenados.
print ("Bienvenido!! En este programa podra ingresar una lista de 5  números\n y le diremos si estan ordenados o desordenados. ")

#creamos una lista vacia
lista =[]
#Pedimos que nos ingresen 5 números 
for x in range (5):
    num= float (input("Ingrese un número: "))
    lista.append (num)

#Creamos listas que esten ordenadas de forma ascendente y descendente
asendente=sorted(lista)
descendente=sorted(lista, reverse=True)

#Creamos las condiciones para que compare las listas 
if lista == asendente:
    print ("Ha ingresado los números de forma asendente.")
elif lista == descendente:
    print ("Ha ingresado los numeros de manera descendente.")
else:
    print("Ha ingresado los números de manera desordenada.")





