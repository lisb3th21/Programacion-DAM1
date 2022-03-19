#Escribe un programa que pida notas y los guarde en una lista. Para terminar de
# introducir notas, escribe una nota que no esté entre 0 y 10. El programa termina
# escribiendo la lista de notas.


palabra=" "
lista=[ ]
while palabra== "salir":
    palabra=input("Introduce una palabra: ")
    lista.append(palabra)
    lista.pop(-1)
print(lista)
