# Importamos el modulo random para usarlo posteriormente
import random
"""
    Definiremos una función que la nombraremos opcion. 
    Dicha función dara la bienvenida al usuario asi como como pedira que seleccione la opcion de jugo que quiere.
    La función devolvera la palabra o frase con la que se jugara
"""


def opcion():
    global palabraNum
    # definimos las listas que contengan las frases o palabras que se podrán jugar
    peliculas = ["battle royale", "parasite", "primicia mortal", "como entrenar a tu dragon",
                 "orgullo y perjuicio", "duna", "the cube", "los locos addams", "caroline", "el laberinto del fauno"]

    paises = ["españa", "colombia", "ecuador", "japon", "esuatini", "etiopia", "mongolia", "palaos",
              "kirguistan", "alemania", "estados federados de micronesia", "el salvador", "finlandia"]

    animales = ["perro", "gato", "delfin",  "mono", "leon", "tiburon", "hamster", "vaca", "pato",
                "sanguijuela", "caballo", "iguana", "serpiente", "elefante", "cerdo", "raton", "camaleon"]

    marcasCoches = ["ford", "renault", "seat", "honda", "hyundai", "suzuki",  "citroen",
                    "audi", "fiat", "lexus", "mercedes", "mazda", "opel", "peugeot", "tesla", "volkswagen"]

    # imprimimos la bienvenida al programa
    print('''
           \U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331
           \U0001F331                      \U0001F331
           \U0001F331  Juego del Ahorcado  \U0001F331
           \U0001F331                      \U0001F331           
           \U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331
           
           ''')
    # damos a escoger al usuario el tema sobre el que quiere jugar
    print("Seleccione un tema para empezar a jugar.\n1. Películas\n2. Países\n3. Animales\n4. Marcas de coches")
#pedimos al usuario que seleccione un tema para jugar 
    x = input("Seleccione una opción: ")
    
    #si el usuario no ingresara una opción correcta, el programa se lo volvera a pedir hasta que ingrese una opcion correcta
    if x == "1":
            palabraNum = random.choice(peliculas)
    elif x == "2":
        palabraNum = random.choice(paises)
    elif x == "3":
        palabraNum = random.choice(animales)

    elif x == "4":
        palabraNum = random.choice(marcasCoches)
    else:
        while x not in ["1", "2", "3", "4"]:
            x = input("Esta opción no esta disponible.\nSeleccione una opción: ")
            if x == "1":
                palabraNum = random.choice(peliculas)
            elif x == "2":
                palabraNum = random.choice(paises)
            elif x == "3":
                palabraNum = random.choice(animales)

            elif x == "4":
                palabraNum = random.choice(marcasCoches)
    '''
    while x not in ["1", "2", "3", "4"]:
        x = input("Esta opción no esta disponible.\nSeleccione una opción: ")
        if x == "1":
            palabraNum = random.choice(peliculas)
        elif x == "2":
            palabraNum = random.choice(paises)
        elif x == "3":
            palabraNum = random.choice(animales)

        elif x == "4":
            palabraNum = random.choice(marcasCoches)
    #la funcion devuelve la palabra con la que se va ha jugar
    '''
    return palabraNum
# ------------------------------------------------------------------------------------------------------------------------------------------

#almacenamos la palabra que devuelve la funcion en la variable palabra

palabra = opcion()
print(palabra)

'''
la función juego sera la parte principal del programa. 
Esta función hara:
    ->convertir la palabra o frase con la que se jugara en rayas-->hecho
    ->pedira al usuario que ingrese letras 
    ->conforme avance el juego se mostraran el estado de los guines así como el numero de intentos
    ->se mostrara las letras que ya se hayan empleado
    -> se mostrara el estado de ahorcada en cada momento
'''
def juego(opcion):
    #letras=['a', 'b', 'c','ç', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    caracteres=[' ', ',', '.', ':', '\'', ';', '+','{','}']
    #crea la lista con letras 
    lista=[x for x in opcion]
    #crea la lista pero con rayas 
    lista_rayas=[ ]
    raya=['_']
    
    for i in  (lista):
        if i in caracteres:
            i=[i]
            lista_rayas=lista_rayas+i
        else:
            lista_rayas+=raya
    #convertimos la lista que contiene las rayas en un string
    string=''
    for x in lista_rayas:
        string+=x
        
    #ahora que tenemos definidas varias variables que necesitaremos para definir el juego empezaremos a interactuar con el usuario
    emoticones="\U0001F331"*46
    intentos=6
    print(f'''
          {emoticones}
          \U0001F331 Vamos ha empezar el juego!                                                             \U0001F331
          \U0001F331 Tiene un total de 6 intentos.                                                          \U0001F331
          \U0001F331 Debe ingresar una letra y se irá mostrando por pantalla si dicha letra esta en la frase\U0001F331     
          \U0001F331 Si la letra no esta perdera un intento                                                 \U0001F331
          \U0001F331                                    ¡¡Suerte!!                                          \U0001F331
          {emoticones}
          ''')
    if intentos==6:
        print(f"""
_______
|      |
|      
|    
|    
|____________
|Intentos:6 | 
|___________|

{string}
""")
        letra=input(str("Ingrese una letra: "))
        
       

    return string



dd=juego(palabra)
print(dd)
    
