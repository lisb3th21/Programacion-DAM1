print ("Programa para dibujar un rectangulo")
alto=int(input("Ingrese el alto de su rectangulo: "))
ancho=int (input("Ingrese el ancho de su rectangulo: "))


for i in range(alto):
    i=""
    for j in range(ancho):
        j="_"
        print(j,end="")
    print(i)
