#Escribe un programa que pida la anchura y la altura de un rectángulo y lo dibuje
bienvenida= 'Programa para dibujar un triangulo... muy útil :)'.upper()
print (bienvenida.center(80, "*"))
while True:
    try:
        ancho = int(input("Ingrese el ancho de su triangulo: "))
        break
    except ValueError:
        print("Ingrese un numero entero, por favor\nVuelva a intentarlo :)")

for x in range (ancho+1):
   print(x*"-")
for x in range (ancho+1, 0, -1):
    print(x*"-")