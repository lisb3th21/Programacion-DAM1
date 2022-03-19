#Escribe un programa que te pida palabras y las guarde en una lista. Para terminar de introducir
# palabras, simplemente pulsa Enter. El programa termina escribiendo la lista de palabras.

palabra=" "
lista=[ ]
while palabra!= "":
    palabra=input("Introduce una palabra: ")
    lista.append(palabra)
lista.pop(-1)
print(lista)

