# PROG-35A
# Version 1.0
# Programa para ver como les fue a los corredores
# Autor: Matteozzi y Marzorati

# Funciones
def leerArchivoTXT(rutaArchivo):
    archivo = open(rutaArchivo, encoding='utf8', mode='r')
    listaDeLineas = []
    linea = archivo.readline().replace('\n','')
    while linea != "":
        listaDeLineas.append(linea)
        linea = archivo.readline().replace('\n','')
    archivo.close()
    return listaDeLineas

# Programa
listaPartieron = leerArchivoTXT("C:/ub/partieron.txt")
listaLlegaron = leerArchivoTXT("C:/ub/llegaron.txt")

# Recorrer la lista de los que partieron
for corredor in range(0, len(listaPartieron), 1):
    # Si los que partieron no llegaron, agregar un abandono al lado
    if listaPartieron[corredor] not in listaLlegaron:
        listaPartieron[corredor] = listaPartieron[corredor] + " ¡Abandonó!"
    else:
        # Si llegaron agregar la frase "Tiempo empleado a determinar"
        listaPartieron[corredor] = listaPartieron[corredor] + " ¡Tiempo empleado a determinar!"

# Ordenar lista
listaPartieron.sort()

# Imprimir resultados
print(listaPartieron)

