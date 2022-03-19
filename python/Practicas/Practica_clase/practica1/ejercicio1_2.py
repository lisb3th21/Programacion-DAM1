print("Bienvenido")

usuario = (input("Ingrese su nombre de usuario: "))

if len(usuario) >= 4:
    print("Hola ", usuario, ". Bienvenido!!")
else:
    while len(usuario)<=4:

        usuario=input(
        "Ingrese un nombre de usuario con un mínimo de 4 caracteres.\nVuelva a intentarlo: ")
        if len(usuario) >= 4:
            print("Hola",usuario,". Bienvenido!!")
