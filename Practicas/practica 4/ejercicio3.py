#Pida al usuario si quiere calcular el área de un triángulo o un cuadrado, y pida los datos según que caso y muestre el resultado.
	
print ("Bienvenido!! Este programa lo ayudara a calcular el área de un triangulo o cuadrado según el caso.")
#pedimos que almacene una variable para que posteriormente seleccione que operacion arimetrica deberemos hacer 
figura= float(input("Por favor, teclee 1 si desea calcular el área de un triangulo o 2 si es la de un cuadrado.  "))
#segun la opcion  que haya escogido se ejecutara la operacion arimetrica correspondiente 
if figura==float(1):
    base= float(input("¿Cuál es la base del triangulo? "))
    altura= float(input("¿Cuál es la altura de su triangulo? "))
    areaTriangulo= float ((base*altura)/2)
    print ("El triangulo con base "+str(base)+" y altura "+ str(altura)+" tiene como área "+str(areaTriangulo))

elif figura ==float(2):
    lado=float(input("Cuál es el lado de su cuadrado? "))
    areaCuadrado= float (lado*lado)
    print ("El área del cuadrado de lado "+str(lado)+ " es "+str(areaCuadrado))

else:
    print ("Esta opcion no esta disponible")
                
