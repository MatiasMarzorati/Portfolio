# parte_b.py
import scipy.integrate as integrate

# Definir la función a integrar para calcular I_n
def integrando(x, n):
    return (x**n) / (x + 10)

# Calcular I_n mediante la integral definida
def calcular_I_n(n):
    resultado, error = integrate.quad(integrando, 0, 1, args=(n))
    return resultado

# Calcular los primeros 26 términos usando la relación de recurrencia
def calcular_sucesion():
    I = [0] * 26

    # Calcular I_0 usando la integral y redondear a 3 decimales
    I[0] = round(calcular_I_n(0), 3)
    print(f"I_0 = {I[0]}")

    # Calcular I_n para n = 1 hasta n = 25 usando la relación de recurrencia
    for n in range(1, 26):
        I[n] = round((1/n) - 10 * I[n-1], 10)  # Redondear para evitar errores numéricos
        print(f"I_{n} = {I[n]}")

    return I

# Ejecutar el cálculo directo de I_n usando la relación de recurrencia
if __name__ == "__main__":
    calcular_sucesion()
