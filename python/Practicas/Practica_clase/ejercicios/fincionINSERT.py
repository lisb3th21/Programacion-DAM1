def insertar(posicion, valor, lista):
    resultado=[ ]
    for i in range(0, len(lista)):
        if posicion == i:
            resultado=resultado+[valor]
        resultado=resultado+[lista[i]]
    return resultado

listaFin=insertar(3, "nct", ["exo", "red velvet", "girlfriend", "bts", "blackpink"])
print(listaFin)
