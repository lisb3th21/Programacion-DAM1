texto=input ("introduce el texto del que quieres contar las vocales: ")
vocales =["a","e","i","o","u"]
texto=texto.lower()
contador=0
#print(texto)

for i in range (len(texto)):
    for j in range (len(vocales)):
        if texto[i]==vocales[j]:
            contador=contador+1

print (contador )


