public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int anio;

    // Método constructor
    public Fecha(int m, int d, int a) {
        // verifica que el mes esté entre 1 y 12
        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("El mes debe estar entre 1 y 12");
        }
        // verifica que el día esté entre 1 y 31
        if (d < 1 || d > 31) {
            throw new IllegalArgumentException("El día debe estar entre 1 y 31");
        }
        // verifica que el año sea positivo
        if (a < 0) {
            throw new IllegalArgumentException("El año no puede ser negativo");
        }
        this.mes = m;
        this.dia = d;
        this.anio = a;
    }

    // Getters and Setters
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAno(int anio) {
        this.anio = anio;
    }

    // Método para pasar de mes en número a nombre
    public static String obtenerNombreMes(int m) {
        String nombreMes = "";
        switch(m) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Mes no válido";
        }
        return nombreMes;
    }

    // Método para mostrar fecha
    public void mostrarFecha() {
        // variables
        int aux = anio % 100;
        // Formato 01/01/12
        System.out.println(dia + "/" + mes + "/" + anio);
        // Formato Enero 01, 2012
        System.out.println(obtenerNombreMes(mes) + " " + dia + "," + anio);
        // Formato 01 Enero 12
        System.out.println(dia + " " + obtenerNombreMes(mes) + " " + aux);
    }
}
