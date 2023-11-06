# PROG-20A
# Version 1.0
# Programa de reloj
# Autores: Matteozzi, Marzorati, Sosa, Peralta

# Importar modulo
import time
# Obtencion de datos
hora = int(input("Ingrese un valor de hora: "))
minutos = int(input("Ingrese la cantidad de minutos: "))
segundos = int(input("Ingrese la cantidad de segundos: "))
# Programa
while hora < 24:
    while minutos <= 59:
        while segundos < 59:
            segundos = segundos + 1
            print(f"{hora:02}:{minutos:02}:{segundos:02}")
            time.sleep(0.25)
        segundos = 0
        print(f"{hora:02}:{minutos:02}:{segundos:02}")
        time.sleep(1)
        minutos = minutos + 1
    minutos = 0
    hora = hora + 1
    print(f"{hora:02}:{minutos:02}:{segundos:02}")
    time.sleep(1)
# + 23 horas
print("¡Ya pasaron 24 hs!")
