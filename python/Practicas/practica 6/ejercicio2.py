#Escribe un programa que te pida números y los guarde en una lista. Para terminar de 
# introducir número, simplemente escribe “Salir”. El programa termina escribiendo 
# la lista de números.




numero =" "
listanum=[ ]
while numero!="salir":
    numero=(input("Introduce un número: "))
    listanum.append(numero)
listanum.pop(-1)
print(listanum)
