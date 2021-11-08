texto=input ("Introduce el texto que desear ver las vocales: ")
vocales=["a","e","i","o","u"]
vocalesM=["A","E","I","O","U"]
textoM=""
for i in range(len(texto)): 
    j=0
    while j<len (vocales):
        if texto[i]==vocales[j]:
            letra=vocalesM[j]
            j=len(vocales)

        else: 
            letra=texto[i]
            j=j+1
    textoM=textoM+letra

print(textoM)
