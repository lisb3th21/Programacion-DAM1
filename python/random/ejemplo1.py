palabra=input("Introduce un texto: ")

contador=0
i=0
while (i<len(palabra)):
    if (palabra[i]=="a"):
        contador=contador+1
    i=i+1
print("hay ", contador, " letras a ")
#print (i)
