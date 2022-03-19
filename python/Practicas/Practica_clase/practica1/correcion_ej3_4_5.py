print("Bienvenido")

valores=["0","1","2","3","4","5","6","7","8","9"]
correcto=False
while not correcto:
    min=""
    numeral=False
    while not numeral:
        if min!="":
            print("Error, no es un número entero")
        min=input("ingresa un numero minimo que tendra el numero:")
        
        
        i=0
        while i<len(min):
            if min[i]  not in valores:
                numeral=False
                i=len(min)
            else:
                numeral=True
                i=i+1
    min=int(min)
    
    
    
    max=""
    numeral=False
    while not numeral:
        if max!="":
        print("Error, no es un número entero")
    min=input("ingresa un numero maximo que tendra el numero:")
    
    
    i=0
    while i<len(max):
        if min[i]  not in valores:
            numeral=False
            i=len(max)
        else:
            numeral=True
            i=i+1
if max>min:
    correcto=True 
else:
    print("Error: el primer valor debe ser menor que el segundo")
    
N=random.randit(min, max)
suposit=""
encertat=False
intents=0
    
while not encertat:
    numeral=False
    while not numeral
