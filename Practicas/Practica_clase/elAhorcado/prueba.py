'''
def juego(opcion):


    return string
'''
opcion='los locos'


alfabeto=['a', 'b', 'c','ç', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
caracteres=[' ', ',', '.', ':', '\'', ';', '+','{','}']
lista=[x for x in opcion]
lista_rayas=[ ]
raya=['_']

for i in  (lista):
    if i in caracteres:
        i=[i]
        lista_rayas=lista_rayas+i
    else:
        lista_rayas+=raya
string=''
for x in lista_rayas:
    string+=x
    
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
    
intentos6="""
_______
|      |
|      
|    
|    
|____________
|Intentos:6 | 
|___________|
"""
intentos5="""
_______
|      |
|     \U0001F972 
|    
|    
|____________
|Intentos:5 | 
|___________|
"""
intentos4="""
_______
|      |
|     \U0001F972
|     \U0001F455  
|    
|____________
|Intentos:4 | 
|___________|
"""
intentos3="""
_______
|      |
|     \U0001F972
|   \U0001f4aa\U0001F455  
|    
|____________
|Intentos:3 | 
|___________|
"""
intentos2="""
_______
|      |
|     \U0001F972
|   \U0001f4aa\U0001F455\U0001f919
|    
|____________
|Intentos:2 | 
|___________|
"""
intentos1="""
_______
|      |
|     \U0001F972
|   \U0001f4aa\U0001F455\U0001f919
|     \U0001F456
|
|____________
|Intentos:1 | 
|___________|
"""
gameOver="""
_______
|      |
|     \U0001F480 
|   \U0001f4aa\U0001F455\U0001f919    
|     \U0001F456
|    \U0001F45F\U0001f45f
|____________
| GAME OVER | 
|___________|
"""

while intentos !=0:
    print(intentos6, '\n', string, '\n')
    letra=input("Ingrese una letra: ")
    lista_booleana=[]
    lista_rayasFin=[]
    if letra in alfabeto and letra in lista:
        for x in lista:
            posicion=[letra==x]
            lista_booleana+=posicion
        for j in lista_rayas:
            for i in lista_booleana:
                if j == True:
                    lista_rayasFin+=letra
                

        print(lista_booleana)
        print(lista_rayasFin)
                
        
        '''
        
        while letra not in alfabeto:
            letra=input(" Ingrese una letra: ")
    if letra in lista:
        print (intentos6)
        for i in lista:
            if letra == i
        
'''
