import tkinter as tk
from tkinter import ttk, messagebox
from PIL import Image, ImageTk


class PrestamoCalculadora(tk.Tk):
    def __init__(self):
        super().__init__()

        self.title("Calculadora de Préstamos")
        self.geometry("800x600")

        self.create_background()
        self.create_widgets()

    def create_background(self):
        self.canvas = tk.Canvas(self, width=800, height=600)
        self.canvas.pack(fill="both", expand=True)

        # Cargar la imagen de fondo
        self.bg_image = Image.open("ben.jpeg")
        self.bg_image = self.bg_image.resize((800, 600), Image.LANCZOS)
        self.bg_photo = ImageTk.PhotoImage(self.bg_image)

        # Colocar la imagen en el canvas
        self.canvas.create_image(0, 0, image=self.bg_photo, anchor=tk.NW)

    def create_widgets(self):
        # Crear un frame sobre el canvas para los widgets
        self.widget_frame = tk.Frame(self.canvas, bg="", highlightthickness=0)
        self.widget_frame.place(relx=0.5, rely=0.5, anchor=tk.CENTER)

        # Contenedor de entrada
        input_frame = tk.Frame(self.widget_frame, bg="", highlightthickness=0)
        input_frame.pack(pady=10)

        tk.Label(input_frame, text="Monto del Préstamo:", font=("Arial", 16), bg="", highlightthickness=0).grid(row=0,
                                                                                                                column=0,
                                                                                                                padx=5,
                                                                                                                pady=5)
        self.montoPrestamoField = tk.Entry(input_frame, bg="")
        self.montoPrestamoField.grid(row=0, column=1, padx=5, pady=5)

        tk.Label(input_frame, text="Tasa de Interés Anual (%):", font=("Arial", 16), bg="", highlightthickness=0).grid(
            row=1, column=0, padx=5, pady=5)
        self.tasaInteresField = tk.Entry(input_frame, bg="")
        self.tasaInteresField.grid(row=1, column=1, padx=5, pady=5)

        tk.Label(input_frame, text="Cantidad de Meses:", font=("Arial", 16), bg="", highlightthickness=0).grid(row=2,
                                                                                                               column=0,
                                                                                                               padx=5,
                                                                                                               pady=5)
        self.mesesField = tk.Entry(input_frame, bg="")
        self.mesesField.grid(row=2, column=1, padx=5, pady=5)

        calcular_button = tk.Button(input_frame, text="Calcular", font=("Arial", 16, "bold"), bg="#4682B4", fg="white",
                                    command=self.calcular_prestamo)
        calcular_button.grid(row=3, column=0, columnspan=2, pady=10)

        self.totalInteresesLabel = tk.Label(self.widget_frame, text="Total intereses pagados: 0.00",
                                            font=("Arial", 16, "bold"), bg="", highlightthickness=0)
        self.totalInteresesLabel.pack(pady=10)

        # Tabla de resultados
        table_frame = tk.Frame(self.widget_frame, bg="", highlightthickness=0)
        table_frame.pack(expand=True, fill=tk.BOTH)

        columns = ["Mes", "Amortización", "Intereses", "Cuota", "Monto Restante"]
        self.table = ttk.Treeview(table_frame, columns=columns, show="headings", height=15)
        self.table.pack(expand=True, fill=tk.BOTH)

        for col in columns:
            self.table.heading(col, text=col, anchor=tk.CENTER)
            self.table.column(col, anchor=tk.CENTER)

        # Historial de operaciones
        historial_frame = tk.LabelFrame(self.widget_frame, text="Historial de Operaciones", bg="", font=("Arial", 14),
                                        highlightthickness=0)
        historial_frame.pack(fill="both", expand="yes", padx=10, pady=10)

        historial_columns = ["Monto", "Tasa (%)", "Meses", "Total Intereses"]
        self.historialTable = ttk.Treeview(historial_frame, columns=historial_columns, show="headings", height=5)
        self.historialTable.pack(expand=True, fill=tk.BOTH)

        for col in historial_columns:
            self.historialTable.heading(col, text=col, anchor=tk.CENTER)
            self.historialTable.column(col, anchor=tk.CENTER)

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
