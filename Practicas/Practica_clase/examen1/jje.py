#Creamos la funcion obtenerNumMult que nos devolvera un numero multiplicado por todos sus componentes
def obtenerNumMult(numeroMul):
    #definimos una variable con valor 1(que es el numero neutro de la multiplicación)
    resultadoMultiplicar=1
    #creamos un bucle que ira multiplicando los componentes del numero
    for i in (str(numeroMul)):
        resultadoMultiplicar*=int(i)
    return resultadoMultiplicar


print(obtenerNumMult(numeroMul=227))
