#Pida al usuario un importe en euros y diga si el cajero automático le
# 	puede dar dicho importe utilizando el mismo billete y el más grande
# 	(recuerda que el billete puede ser de 500, 200, 100, 50, 20, 10 y 5 €)
print("¡Bienvenido a su banco de confianza!")
importe = int (input("Por favor, teclee el importe que desee sacar\n (No se admiten cantidades con centimos y solo se podran devolver billetes): "))

#declaramos valriables para luego 
quinientos= importe%500
docientos= importe%200
cien=importe%100
cincuenta=importe %50
veinte=importe%20
diez=importe%10
cinco=importe%5

if  quinientos==0: 
    divQuinientos= int (importe/500)
    print("Se entragara "+ str(divQuinientos)+ " billetes de quinientos")
elif docientos==0: 
    divDocientos= int (importe/200)
    print("Se entragara "+ str(divDocientos)+ " billetes de docientos")
elif cien==0: 
    divCien= int (importe/100)
    print("Se entragara "+ str(divCien)+ " billetes de cien")
elif cincuenta==0: 
    divCincuenta= int (importe/50)
    print("Se entragara "+ str(divCincuenta)+ " billetes de cincuenta")
elif veinte==0: 
    divVeinte= int (importe/20)
    print("Se entragara "+ str(divVeinte)+ " billetes de veinte")
elif diez==0: 
    divDiez= int (importe/10)
    print("Se entragara "+ str(divDiez)+ " billetes de diez")
elif cinco==0: 
    divCinco= int (importe/5)
    print("Se entragara "+ str(divCinco)+ " billetes de cinco")
else:
    print ("No podemos darle su  dinero ")

