def esPrimo(i):
    print ('''
           =============================================
            Programa calculo de la conjetura de Sheldon
           =============================================
           ''')
    #pedimos que nos ingresen un numero 
    numero=input("Dame el número para el que quiere comprobar si cumple con el teorema de Sheldon: ")
    #creamos una variable que contenga el valor booleano false
    resultado=False
    #si cumple las siguientes condiciones el numero será primo
    if int(i)%int(i)==0 and int(i)%1==0 and i%2!=0:
        resultado=True
    elif i==2:
        resultado=True
        #si no cumple las condiciones anteriores no se añade nada a la lista
    else:
        resultado=False 
    return resultado

print(esPrimo(i=3))
