def numcompare(x, y):
    m = dict(zip("MDCLXVI", "GFEDCBA"))
    return x.translate(m) < y.translate(m)


x=input("ingrese un numero: ")
y=input("Ingrese un num: ")
print(numcompare(x, y))
