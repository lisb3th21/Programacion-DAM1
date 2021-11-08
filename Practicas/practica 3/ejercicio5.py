#Pida un número que como máximo tenga tres cifras
numero =str(input("Introduzca un número de hasta 3 cifras, por favor: "))
if 3 >= len(numero):
    print ("El número ", numero, " es correcto.")
else: 
    print ("El número ", numero, " tiene más de tres cifras. Es incorrecto.")