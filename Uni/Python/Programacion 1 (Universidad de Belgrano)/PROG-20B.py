# PROG-20B
# Version 1.0
# Programa de TEMPORIZADOR
# Autores: Matteozzi, Marzorati, Sosa, Peralta

# Importar modulo
import time
# Obtencion de datos
hora = int(input("Ingrese un valor de hora: "))
minutos = int(input("Ingrese la cantidad de minutos: "))
segundos = int(input("Ingrese la cantidad de segundos: "))
# Progama
while hora >= 0:
    while minutos >= 0:
        while segundos > 0:
            print(f"{hora:02}:{minutos:02}:{segundos:02}")
            segundos = segundos - 1
            time.sleep(1)
        # Si llega a 0 terminar
        if hora == 0 and minutos == 0 and segundos == 0:
            print(f"{hora:02}:{minutos:02}:{segundos:02}")
            print("¡Ya termino el tiempo!")
            exit()
        print(f"{hora:02}:{minutos:02}:{segundos:02}")
        time.sleep(1)
        minutos = minutos - 1
        segundos = 59
    hora = hora - 1
    minutos = 59
    print(f"{hora:02}:{minutos:02}:{segundos:02}")
    time.sleep(1)
