#importamos el modulo random
import random
print("Adivina el número :)")
try:
    a=int(input("Ingresa un número: "))
except ValueError:
    a=int(input("Ingrese solo numeros. Vuelva a intentarlo: "))
try:
    b=int(input("Ingresa un número: "))
except ValueError:
    a=int(input("Ingrese solo numeros. Vuelva a intentarlo: "))
#generamos un número al zar entre los lumeros a y b
N =random.randint(a,b)



#print (N)
try:
    num=int(input("Ingresa el número que crees que es: "))
except ValueError:
    num=int(input("Ingrese solo numeros. Ingresa el número que crees que es: "))

#añadimos un contador que ira aumentando conforme los intentos 
intentos=1
print("Ha hecho ",intentos)
#si el numero es diferente entonces entrara en el bucle hasta 
#que el num sea correcto
while num!=N:
    if num>N:
        try:
            num=int(input("El numero ingresado es mayor.\nVuelva a intentarlo:"))
            intentos=intentos+1
        except ValueError:
            num=int(input("Solo ingresa números. Vuelve a intentarlo: "))
        print("Ha hecho ",intentos)
    elif num<N:
        try:
            num=int(input("El numero ingresado es menor.\nVuelva a intentarlo:"))
            intentos=intentos+1
        except ValueError:
            num=int(input("Solo ingresa números. Vuelve a intentarlo: "))

        print("Ha hecho ",intentos)
print("Felicidades, ha acertado!!")
print("Lo ha logrado con ", intentos, "intentos.")
    

    



