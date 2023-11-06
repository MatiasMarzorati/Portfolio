 # JUEGO-02A
# Version 1.0
# Programa de validacion de contraseñas
# Autor: Matteozzi y Marzorati

# Funcion para validar contraseña
def validacion(contraseña):
    # Si la contraseña es menor a 8 no es valida
    if len(contraseña) < 8:
        print("¡La contraseña debe tener más de 8 caracteres!")
        return False
    # Si la contraseña no contiene 2 caracteres no es valida
    numeros = 0
    for i in range(0, len(contraseña), 1):
        if (contraseña[i].isnumeric()):
            numeros = numeros + 1
    if numeros < 2:
        print("¡La contraseña debe tener al menos 2 números!")
        return False
    # Si la contraseña no contiene al menos 1 mayuscula no es valida
    mayusculas = 0
    for i in range(0, len(contraseña), 1):
        if (contraseña[i].isupper()):
            mayusculas = mayusculas + 1
    if mayusculas < 1:
        print("¡La contraseña debe tener al menos 1 mayúscula!")
        return False
    # Si la contraseña no contiene al menos 1 minuscula no es valida
    minuscula = 0
    for i in range(0, len(contraseña), 1):
        if (contraseña[i].isupper()):
            minuscula = minuscula + 1
    if minuscula < 1:
        print("¡La contraseña debe tener al menos 1 minúscula!")
        return False
    # Si pasa todas las condiciones es verdadero
    return True

""" INICIO DEL PROGRAMA """
# Iniciar el programa en False
contraseñaValida = False
# Mientras la contraseña no sea valida volver a pedir que la ingresen
while contraseñaValida == False:
    contraseña = str(input("Ingrese su contraseña: "))
    # Llamado a la funcion
    contraseñaValida = validacion(contraseña)
# Imprimir si es valida
print("¡La contraseña es valida!")
