#Escribe un programa que pida la altura de un triángulo y lo dibuje:
bienvenida= 'Programa para dibujar un triangulo'.upper()
print (bienvenida.center(80, "*"))
while True:
    try:
        altura = int(input("Ingrese la altura de su triangulo: "))
        break
    except ValueError:
        print("ingrese un numero entero, por favor")
for x in range (altura+1):
   print(x*"-")
   
