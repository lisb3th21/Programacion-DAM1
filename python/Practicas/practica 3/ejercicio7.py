#Pida al usuario tres número que serán el día, mes y año. Comprueba que la fecha introducida es válida.  
from datetime import datetime
print ("Bienvenido. Este programa validará la fecha que introduzca.")
while True:
    try:
        fecha_str = input('Ingrese fecha "dd/mm/aaaa": ')
        fecha = datetime.strptime(fecha_str, '%d/%m/%Y')
        print ("la fecha ", fecha, " es correcta.")
    except ValueError:
        print("La fecha es incorrecta")
    break