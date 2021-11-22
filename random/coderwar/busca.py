'''
def cerca (text, cadena):
    contador=0
    for i in range (len(text)):
        if text [i:i+len(cadena)]==cadena:
            contador=contador +1
    return contador     

texto= input("Introduce el texto:")
p= input("Qué deseas buscar: ")

print(cerca(texto,p))
'''
def cerca (text, cadena):
    contador=0
    for i in range (len(text)):
        j=0
        while j<len (cadena):
            if text [i+j]==cadena[j]:
                j=j+1
                if j==len(cadena):
                    contador=contador+1
            else:
                j=len(cadena)
    return contador

t= input("Introduce el texto:")
p= input("Qué deseas buscar: ")

print(cerca(t,p))
                    