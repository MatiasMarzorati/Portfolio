import tkinter as tk
from tkinter import ttk, messagebox
import pandas as pd


class PrestamoCalculadora(tk.Tk):
    def __init__(self):
        super().__init__()

        self.title("Calculadora de Préstamos")
        self.geometry("800x600")
        self.configure(bg="white")

        self.montoPrestamoField = tk.Entry(self)
        self.tasaInteresField = tk.Entry(self)
        self.mesesField = tk.Entry(self)

        self.create_widgets()
        self.create_table()

    def create_widgets(self):
        input_frame = tk.Frame(self, bg="white")
        input_frame.pack(pady=10)

        tk.Label(input_frame, text="Monto del Préstamo:", font=("Arial", 16), bg="white").grid(row=0, column=0, padx=5,
                                                                                               pady=5)
        self.montoPrestamoField.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(input_frame, text="Tasa de Interés Anual (%):", font=("Arial", 16), bg="white").grid(row=1, column=0,
                                                                                                      padx=5, pady=5)
        self.tasaInteresField.grid(row=1, column=1, padx=5, pady=5)

        tk.Label(input_frame, text="Cantidad de Meses:", font=("Arial", 16), bg="white").grid(row=2, column=0, padx=5,
                                                                                              pady=5)
        self.mesesField.grid(row=2, column=1, padx=5, pady=5)

        calcular_button = tk.Button(input_frame, text="Calcular", font=("Arial", 16, "bold"), bg="#4682B4", fg="white",
                                    command=self.calcular_prestamo)
        calcular_button.grid(row=3, column=0, columnspan=2, pady=10)

        self.totalInteresesLabel = tk.Label(self, text="Total intereses pagados: 0.00", font=("Arial", 16, "bold"),
                                            bg="white")
        self.totalInteresesLabel.pack(pady=10)

    def create_table(self):
        columns = ["Mes", "Amortización", "Intereses", "Cuota", "Monto Restante"]

        self.table = ttk.Treeview(self, columns=columns, show="headings", height=15)
        self.table.pack(expand=True, fill=tk.BOTH, padx=10, pady=10)

        for col in columns:
            self.table.heading(col, text=col, anchor=tk.CENTER)
            self.table.column(col, anchor=tk.CENTER)

        self.historialTable = ttk.Treeview(self, columns=["Monto", "Tasa (%)", "Meses", "Total Intereses"],
                                           show="headings", height=5)
        self.historialTable.pack(expand=True, fill=tk.BOTH, padx=10, pady=10)

        for col in ["Monto", "Tasa (%)", "Meses", "Total Intereses"]:
            self.historialTable.heading(col, text=col, anchor=tk.CENTER)
            self.historialTable.column(col, anchor=tk.CENTER)

        historial_frame = tk.LabelFrame(self, text="Historial de Operaciones", bg="white", font=("Arial", 14))
        historial_frame.pack(fill="both", expand="yes", padx=10, pady=10)
        self.historialTable.pack(in_=historial_frame, expand=True, fill=tk.BOTH)

    def calcular_prestamo(self):
        try:
            monto_prestamo = float(self.montoPrestamoField.get())
            tasa_interes_anual = float(self.tasaInteresField.get())
            cantidad_meses = int(self.mesesField.get())

            tasa_interes_mensual = ((tasa_interes_anual / 100) * 30) / 365
            amortizacion = monto_prestamo / cantidad_meses

            total_intereses = 0
            monto_restante = monto_prestamo

            for item in self.table.get_children():
                self.table.delete(item)

            for mes in range(1, cantidad_meses + 1):
                interes = monto_restante * tasa_interes_mensual
                monto_restante -= amortizacion
                total_intereses += interes
                cuota_mensual = interes + amortizacion

                self.table.insert("", "end", values=(
                mes, f"{amortizacion:.2f}", f"{interes:.2f}", f"{cuota_mensual:.2f}", f"{monto_restante:.2f}"))

            self.totalInteresesLabel.config(text=f"Total intereses pagados: {total_intereses:.2f}")

            self.historialTable.insert("", "end", values=(
            monto_prestamo, tasa_interes_anual, cantidad_meses, f"{total_intereses:.2f}"))
        except ValueError:
            messagebox.showerror("Error de entrada", "Por favor ingrese valores numéricos válidos.")


if __name__ == "__main__":
    app = PrestamoCalculadora()
    app.mainloop()
