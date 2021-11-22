import random

def opcion():
    peliculas = ["battle royale", "parasite", "primicia mortal", "como entrenar a tu dragon", "orgullo y perjuicio", "duna", "the cube", "los locos addams", "caroline", "el laberinto del fauno"]

    paises=["españa", "colombia", "ecuador", "japon", "esuatini", "etiopia", "mongolia", "palaos", "kirguistan", "alemania", "estados federados de micronesia", "el salvador", "finlandia"]

    animales=["perro","gato", "delfin",  "mono", "leon", "tiburon", "hamster", "vaca", "pato", "sanguijuela", "caballo", "iguana", "serpiente", "elefante", "cerdo", "raton", "camaleon"]

    marcasCoches=["ford", "renault", "seat", "honda", "hyundai", "suzuki",  "citroen", "audi", "fiat", "lexus", "mercedes", "mazda", "opel", "peugeot", "tesla", "volkswagen"]
    
    
    print ('''
           \U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331
           \U0001F331                      \U0001F331
           \U0001F331  Juego del Ahorcado  \U0001F331
           \U0001F331                      \U0001F331           
           \U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331\U0001F331
           
           ''')
    
    print("Seleccione un tema para empezar a jugar.\n1. Películas\n2. Países\n3. Animales\n4. Marcas de coches")
    
    x=input ("Seleccione una opción: ")
    
    
    if x=="1":
        palabraNum=random.choice(peliculas)
    
    elif x=="2":
        palabraNum=random.choice(paises)
    elif x=="3":
        palabraNum=random.choice(animales)
    
    elif x=="4":
        palabraNum=random.choice(marcasCoches)
    else:
        while x not in ["1", "2", "3", "4"]:
            x=input ("Esta opción no esta disponible.\nSeleccione una opción: ")
            if x=="1":
                palabraNum=random.choice(peliculas)

            elif x=="2":
                palabraNum=random.choice(paises)
            elif x=="3":
                palabraNum=random.choice(animales)
            
            elif x=="4":
                palabraNum=random.choice(marcasCoches)
        
    return palabraNum
#----------------------------------------------------------------

palabra = opcion()
print(palabra)

def juego (palabra):
    return opcion

print(juego)


