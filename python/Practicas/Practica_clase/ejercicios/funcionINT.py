
# Vamos a entender las funcion INT
# int ("string")=entero
# int ("12")=12
def entero(num):
    simbolos = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    resultado = 0
    for i in range(len(num)):
        j = 0
        while j < len(simbolos):
            if num[i] == simbolos[j]:
                resultado = resultado+j*10**(len(num)-1-i)
                j=len(simbolos)
            else:
                j=j+1
                
        
    return resultado
valor =entero("12")

print(valor)


# Función para transformar strings a números enteros positivos [NO NEGATIVOS]
