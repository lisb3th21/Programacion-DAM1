def sustituir (frase, long, alpha):
    resultado=" "
    for i in range (long):
        resultado=resultado+frase[i]
    resultado=resultado+alpha
    return resultado

respuesta=sustituir("programacion", 5, "j")
print((respuesta))
