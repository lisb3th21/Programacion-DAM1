#EricaLisbethPoaquiza - examen 1º evaluacion 

#Definimos una funcion que compruebe si un número es primo
def esPrimo():
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
    if int(numero)%int(numero)==0 and int(numero)%1==0:
        #por lo tanto el resultado será verdadero
        resultado=True
    else:
        #si no lo cumple será falso
        resultado=False
    return resultado

print(esPrimo())
#---------------------------------------------------------------
#Creamos una funcion que de la vuelta al numero. Ej 98 sera 89. 
def obtenerEspejo(x):
    lista=[]        #esta lista almacenara los componentes del numero en orde
    listaEspejo=[]  #esta lista almacenará los componentes de la lista invertidos
    string=""       #esta lista almacenara el numero invertido en forma de string 
    #este bucle dividirá el numero en sus componentes 
    for i in str(x):
        lista+=[i]
    #este bucle invertira la lista creada anteriormente
    for i in lista[::-1]:
        listaEspejo+=[i]
    #este bucle convertira la lista en string 
    for i in listaEspejo: 
        string+=i
    #convertimos el string a int
    stringInt=int(string)
        
    return stringInt


print(obtenerEspejo(x=73))
#---------------------------------------------------------------
#Creamos la funcion obtenerNumMult que nos devolvera un numero multiplicado por todos sus componentes
def obtenerNumMult(numeroMul):
    #definimos una variable con valor 1(que es el numero neutro de la multiplicación)
    resultadoMultiplicar=1
    #creamos un bucle que ira multiplicando los componentes del numero
    for i in (str(numeroMul)):
        resultadoMultiplicar*=int(i)
    return resultadoMultiplicar


print(obtenerNumMult(numeroMul=73))

#--------------------------------------------------------------
#Creamos una funcion para que dado un numero se genere la lista de los numeros anteriores que sean primos
def añadirPrimos(numMax):
    listaPru=[]     #creamos una lista donde almacenaremos todos los numeros desde el cero hasta el numero dado
    listaPrimos=[]      #Esta lista almacenara solo los numeros primos 
    #creamos un bucle que nos añada a la lista listaPru que nos almacena todos los numeros 
    for i in range (numMax):
        listaPru+=[i]
        
    #creamos un bucle que, a partir de la lista generada anteriormente, se nos filtre solo los numeros primos
    # comenzamos desde la posicion 2 de la lista 
    for i in listaPru[2:]:
        #si el resifuo del numero dividido para si, para 1 es 0 y, ademas, dividido para 2 es diferente a 0, será primo
        if int(i)%int(i)==0 and int(i)%1==0 and i%2!=0:
            listaPrimos+=[i]
        #como el 2 es primo pero queda excluido en la condicion anterior lo añadimos 
        elif i==2:
            listaPrimos+=[i]
            #si no cumple las condiciones anteriores no se añade nada a la lista
        else:
            listaPrimos=listaPrimos   
        
    return listaPrimos

print(añadirPrimos(numMax=73))
