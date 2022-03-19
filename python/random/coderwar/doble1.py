lista =[1, 2, 3, 4 ]
borrar = int(len(lista))

for i in range (len(lista)):
    doble=2*lista[i]
    lista.append(doble)
del lista [0: borrar]
    
    

print (lista)
#print(type(lista))
    