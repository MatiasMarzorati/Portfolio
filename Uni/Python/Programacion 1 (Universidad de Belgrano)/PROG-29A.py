# PROG-29A
# Version 1.0
# Programa para ordenar las temperaturas de menor a mayor, obtener la temperatura mínima y la máxima del mes, obtener la temperatura promedio del mes, calcular la cantidad de días con temperatura bajo cero.
# Autores: Matteozzi y Marzorati

# Lista de temperatura
temperaturas = [15 , 13.5 , 5.1 , 3 , 2.2 , -2 , -5 , 8 , 10 , 7.3 , 6 , 3.3 , 0 , -1 , 10 , 8.5 , 0 , 2 , -4 , -3.7 , 0 , 4.6 , 5 , 3 , -0.5 , 1 , 0 , -1 , 4 , 2.9 , -3.1 ]

# Ordenar temperaturas de menor a mayor
temperaturas.sort()
print("TEMPERATURAS DE JULIO (de menor a mayor)\n"
      "_______________________________________")
for i in range(1, len(temperaturas), 1):
    print(f"{temperaturas[i]} °C")

# Temp mínima y máxima
print("\nTEMPERATURAS\n"
      "_______________________________________")
print(f"MÁX: {temperaturas[len(temperaturas) - 1]} °C")
print(f"MÍN: {temperaturas[0]} °C")

# Promedio
acumuladorPromedio = 0
for i in range(0, len(temperaturas), 1):
    acumuladorPromedio = acumuladorPromedio + temperaturas[i]
promedio = round(acumuladorPromedio / len(temperaturas))
# Imprimir promedio
print(f"\nPROMEDIO: {promedio} °C")

# Cantidad de días bajo cero
diasBajoCero = 0
for i in range(1, len(temperaturas),1):
    if temperaturas[i] < 0:
        diasBajoCero = diasBajoCero + 1
print(f"\nCANTIDAD DE DÍAS BAJO CERO: {diasBajoCero} días.")