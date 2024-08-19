# parte_c.py

# Usar la fórmula inversa para calcular los términos de I_25 a I_0
def calcular_hacia_atras(I_25):
    I = [0] * 26
    I[25] = I_25

    for n in range(25, 0, -1):
        I[n-1] = round((1/n) - 10 * I[n], 10)
        print(f"I_{n-1} (calculado hacia atrás) = {I[n-1]}")

    return I

# Ejecutar el cálculo hacia atrás usando la fórmula inversa
if __name__ == "__main__":
    # Aquí puedes insertar el valor de I_25 calculado desde parte_b.py
    I_25 = 0.0  # Reemplaza este valor con el valor correcto de I_25
    calcular_hacia_atras(I_25)
