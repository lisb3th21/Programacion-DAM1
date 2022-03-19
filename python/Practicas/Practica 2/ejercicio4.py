#Calcular el mayor de dos números
print ("¡Bienvenido! Ese programa lo ayudara a saber que número es mayor.")
A=int(input("Ingrese el primer número: "))
B=int(input("Ingrese el segundo número: "))
if A<B:
    print (B, " es mayor que ", A)
elif A>B:
    print (A, " es mayor que ", B)
else:
    print (A, " es igual que ", B)