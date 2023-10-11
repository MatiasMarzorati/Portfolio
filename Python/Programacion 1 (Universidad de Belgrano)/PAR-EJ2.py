# PAR-EJ2
# Version 1.0
# Programa para
# Autor: Matteozzi y Marzorati

# Bienvenida
print("¡Bienvenido!")
# Inicialización de variables
deseo = 0
temperaturaSemanal = 0
# Realizar programa mientras que el usuario quiera
while deseo == 0:
    # Pedir temperatura para cada día
    for día in range(1, 7+1, 1):
        temperaturaDiaria = float(input("Ingrese la temperatura de hoy: "))
        if temperaturaDiaria < -20 and temperaturaDiaria > 45:
            print("Ingresar una temperatura valida")
            continue
        temperaturaSemanal = temperaturaSemanal + temperaturaDiaria
    # Temperatura promedio
    temperaturaPromedio = temperaturaSemanal / 7
    temperaturaPromedio = round(temperaturaPromedio, 1)
    # Impresion de resultados
    print(f"La temperatura promedio es {temperaturaPromedio} grados.")
