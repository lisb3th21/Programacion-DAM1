#Escribe un programa que pida dos números y escriba qué números entre ese par de números son pares y cuáles impares
print("¿Dificultades para analizar cuales son numeros pares o impares?\nSi su respuesta es si, este es su programa!!")
lista=()
num1= int(input("Por favor ingrese un número: "))
num2=int (input("Por favor, ingrese un número mayor al "+ str(num1)+": "))
num2=num2+1
for x in list(range(num1, num2)):
    if (x%2==0):
        print ("El número "+ str(x) +" es par")
    else:
        print("el número "+str(x)+" es impar\nGracias por utilizar nuestro servicio")
