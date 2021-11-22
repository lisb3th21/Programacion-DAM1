'''
def array_diff(a, b):
    lista = a+b
    for i in  (a):
        for x in  (b):
            if  i == x:
                lista.remove(i)
                lista.remove(i)      
    return lista
print(array_diff([1, 2, 4], [1, 2, 3]))

'''
def array_diff(a, b):
    listaFin=[ ]
    for i in a:
        if i not in b:
            listaFin.append(i) 
    listaFin=listaFin+b
    print(listaFin)
    
print(array_diff([1, 2, 4], [1, 2, 3]))


                
                
                
