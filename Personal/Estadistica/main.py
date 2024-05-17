import matplotlib.pyplot as plt



def imprimirGraficoASCII(x, funcionDemanda, funcionOferta, equilibrio):
    # Establecer el máximo valor de la escala
    escalaMaxima = max(max(funcionDemanda(x)), max(funcionOferta(x)))

    # Crear la representación
    for valor in range(escalaMaxima + 1):
        linea = ""
        for punto in x:
            demanda = funcionDemanda(punto)
            oferta = funcionOferta(punto)

            if valor == demanda:
                linea += "*"  # Representar demanda con "*"
            elif valor == oferta:
                linea += "O"  # Representar oferta con "O"
            elif valor < demanda and valor < oferta:
                linea += " "  # Espacio vacío
            else:
                linea += "|"  # Separador

        # Imprimir la línea
        print(linea)

    # Marcar el punto de equilibrio
    print("-" * (len(x) + 2))  # Línea divisoria
    print(f"  |  Equilibrio: {equilibrio}")
    print("-" * (len(x) + 2))  # Línea divisoria

def calcularEquilibrio(a, b, c, d):
    try:
        equilibrio = (a - c) / (b + d)
        print("El equilibrio es:", equilibrio)
        precio = a - ( b * equilibrio)
        print("El precio es:" + str(precio))

        print("¿Desea imprimir un gráfico?"
              "\n1 - Sí"
              "\n0 - No")
        deseo2 = int(input())
        if deseo2 == 1:
            # Generar gráfico
            x = list(range(int(equilibrio) - 10, int(equilibrio) + 10))

        if deseo2 == 1:
            # Generar gráfico ASCII
            funcionDemanda = lambda x: a - b * x  # Función de demanda
            funcionOferta = lambda x: c + d * x  # Función de oferta
            imprimirGraficoASCII(x, funcionDemanda, funcionOferta, equilibrio)

        elif deseo2 == 0:
            print("No se generará el gráfico.")
        else:
            print("Opción no válida.")

    except ZeroDivisionError:
        print("Error: División por cero.")
    except ValueError:
        print("Error: Entrada inválida.")


def main():
    deseo = 0

    while True:
        print("Ingrese lo que desea hacer:"
              "\n1 - Calcular el equilibrio de funciones de demanda y oferta"
              "\n2 - Salir")

        try:
            deseo = int(input())
        except ValueError:
            print("Error: Entrada inválida.")
            continue

        if deseo == 1:
            try:
                a = float(input("Ingrese en a el número de demanda sin x: "))
                b = float(input("Ingrese en b el número de demanda con x: "))
                c = float(input("Ingrese en c el número de oferta sin x: "))
                d = float(input("Ingrese en d el número de oferta con x: "))

                calcularEquilibrio(a, b, c, d)
            except ValueError:
                print("Error: Entrada inválida.")

        elif deseo == 2:
            print("Saliendo del programa.")
            break
        else:
            print("Opción no válida. Intente de nuevo.")


if __name__ == "__main__":
    main()
