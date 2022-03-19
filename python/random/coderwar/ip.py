'''
def is_valid_IP(strng):
    lista=strng.split(".")
    listaint=[int (x) for x in lista]
    if len(lista) !=4:
        return False
    for str in lista:
        x=0
        if str.isdigit()==False:
            return False
        a=int(str)
        if str.find("0")==0 and a!=0:
            return False
        if a<0 or a>255:
            return False
    re
        
     
        
    

print(is_valid_IP(""))

def is_prime(num):
    for i in range (2, num):
        if num%i==0:
            return False
    if num<=0 or num==1:
        return False
    return True
    arrayDiff.py'
    

def narcissistic( value ):
    valorlen=len(str(value))
    #print(valorlen)
    lista=[int(i) for i in str (value)]
    valor1=0
    for x in lista:
        valor=x**(valorlen)
        valor1 = valor1+valor
    if valor1==value:
        return True
    else:
        return False
        # Code away

value=371
valorlen=len(str(value))
#print(valorlen)
lista=[int(i) for i in str (value)]
valor1=0
for x in lista:
    valor=x**(valorlen)
    valor1 = valor1+valor
print (valor1)


    


def move_zeros(array):
    longitud=len((array))
    ceros=array.count(0)
    for i in range(len(array)):
        if i==0:
            array.remove(0)
    
    lista=[ ]
    
    for x in range(ceros):
        lista.append(0)
        
        
    return array
print(move_zeros( [9, 0, 0, 9, 1, 2, 0, 1, 0, 1, 0, 3, 0, 1, 9, 0, 0, 0, 0, 9]))


def move_zeros(array):
    contador =0
    longitud=len(array)
    lista=[ ]
    for i in :
        
        if i==0:
            array.remove(0)
            contador=contador+1
    for x in range(contador):
        lista.append(0)
            
    
    return longitud
    
print(move_zeros( [9, 0, 0, 9, 1, 2, 0, 1, 0, 1, 0, 3, 0, 1, 9, 0, 0, 0, 0, 9]))


def count_bits(n):
    bits=0
    while n>0:
        if n&1:
            bits=bits+1
        else:
            bits=bits/2
    return bits
    
    


print(count_bits(1))




name="Mike"
age=21
print(f"Hello {name}! You are {age} yearso old ")


first="my name is"
second="Mike"
tres=" ".join([first, second])
print(tres)


frase="this is a string"
frase1=frase[5:9]
print(frase1)

print("me quede en la pag 84".upper())
'''

#Vamos a entender las funcion INT
#int ("string")=entero 
#int ("12")=12

