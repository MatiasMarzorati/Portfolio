# PROG-14A
# Version 1.0
# Programa para calcular la superficie de un circulo con su radio.
# Autor: Tomás Agustín Matteozzi y Matias Marzorati

# Importar libreria
import math
# Obtener datos
radio = float(input("Ingresar un valor de Radio en cm: "))
# Calcular superficie
superficie = (math.pi * radio * radio)
# Imprimir resultados
print(f"La superficie del circulo con {radio} cm de radio, es de {superficie}")