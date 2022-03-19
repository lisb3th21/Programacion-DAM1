
def scramble(s1, s2):
    listaS1=[ ]
    listaS1[:0]=s1
    listaS2=[ ]
    listaS2[:0]=s2
    numS2=len(s2)
    contador=0
    for x in (listaS2):
        for j in (listaS1):
            if x==j:
                contador=contador +1
    if contador==(numS2-1):
        return True
    else:
        return False       
            
        
     
    
    
    
print(len("scriptjava"))    
    
    

print(scramble("scriptjava", "javascript"))
