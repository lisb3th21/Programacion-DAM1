"""
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

def find_short(s):
    lista= s.split()
    l=min ((palabra for palabra in lista if palabra), key=len)
    # your code here
    l=len(l)
    return l # l: shortest word length


print(find_short("La a cabaña reoja"))
"""

def to_jaden_case(string):
    jaden=string.title()
    return jaden

print (to_jaden_case("Hola soy jaden jajajaja"))
