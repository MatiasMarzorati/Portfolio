import java.util.Random;

public class CuboConcreto extends Cubo {
    // ATRIBUTOS
    int[][][] conjunto;
    Random random = new Random();

    // CONSTRUCTOR
    public CuboConcreto(int alto, int ancho, int largo){
        try{
            if (alto != 0 && ancho != 0 && largo != 0){
                conjunto = new int[alto][ancho][largo];
                alea();
            } else {
                throw new Exception("HAY DIMENSIONES VACIAS, NO SE CREA EL CUBO.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // METODOS HEREDADOS
    @Override
    public void cargar(int ancho, int alto, int largo, int valor) {
        try{
            if (valor != 0){
                // SI LA POSICION PASADA POR PARAMETRO ES VALIDA AGREGAR EL VALOR
                if (validas(ancho, alto, largo)) {
                    if(conjunto[ancho][alto][largo] == 0){
                        conjunto[ancho][alto][largo] = valor;
                    }
                    else {
                        throw new Exception("NO SE PUEDE AGREGAR VALOR, YA HAY UN VALOR EXISTENTE. VALOR EXISTENTE: " + conjunto[ancho][alto][largo]);
                    }
                } else {
                    throw new Exception("NO SE PUEDE CARGAR A ESA POSICION YA QUE NO EXISTE.");
                }
            } else {
                throw new Exception("NO SE PUEDE CARGAR EL VALOR '0', UTILICE ANULAR.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void modificar(int ancho, int alto, int largo, int valor){
        try{
            // SI LA POSICION PASADA POR PARAMETRO ES VALIDA MODIFICAR EL VALOR POR EL VALOR DEL PARAMETRO
            if(validas(ancho, alto, largo)){
                if(conjunto[ancho][alto][largo] != 0){
                    conjunto[ancho][alto][largo] = valor;
                } else {
                    throw new Exception("NO SE PUEDE MODIFICAR UN VALOR QUE NO EXISTE (0)");
                }
            } else {
                throw new Exception("NO SE PUEDE CARGAR A ESA POSICION YA QUE NO EXISTE.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void anular(int ancho, int alto, int largo) {
        try {
            // SI LA POSICION PASADA POR PARAMETRO ES VALIDA ANULAR EL VALOR (PONER COMO '0')
            if (validas(ancho, alto, largo)) {
                conjunto[ancho][alto][largo] = 0;
            } else {
                throw new Exception("NO SE PUEDE ANULAR A ESA POSICION YA QUE NO EXISTE.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void nulos(){
        try {
            // RECORRER LAS 3 CAPAZ E IMPRIMIR LAS POSICIONES DONDE EL VALOR ES IGUAL A 0
            int nulas = 0;
            System.out.println("LISTA DE POSICIONES NULAS:");
            for (int ancho = 0; ancho < conjunto.length; ancho++) {
                for (int alto = 0; alto < conjunto[ancho].length; alto++) {
                    for (int largo = 0; largo < conjunto[ancho][alto].length; largo++) {
                        if (conjunto[ancho][alto][largo] == 0) {
                            System.out.println("ANCHO: " + ancho + ", ALTO: " + alto + ", LARGO: " + largo);
                            nulas = +1;
                        }
                    }
                }
            }
            if (nulas == 0) {
                throw new Exception("NO HAY POSICIONES NULAS");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void alea(){
        // MODIFICAR EL CUBO CON ELEMENTOS ALEATORIO
        for (int ancho = 0; ancho < conjunto.length; ancho++) {
            for (int alto = 0; alto < conjunto[ancho].length; alto++) {
                for (int largo = 0; largo < conjunto[ancho][alto].length; largo++) {
                    conjunto[ancho][alto][largo] = random.nextInt(10); // Valores aleatorios del 0 al 9
                }
            }
        }
    }

    @Override
    public int valor(int ancho, int alto, int largo){
        // OBTENER EL VALOR DE UN ELEMENTO SEGUN LA POSICION
        return conjunto[ancho][alto][largo];
    }

    @Override
    public boolean validas(int ancho, int alto, int largo){
        if (ancho < 0 || ancho >= conjunto.length || alto < 0 || alto >= conjunto[0].length ||
                largo < 0 || largo >= conjunto[0][0].length) {
            return false;
        }
        return true;
    }

    @Override
    public void sumatoria() {
        // SUMAR CADA ELEMENTO DE CADA CAPA
        for (int largo = 0; largo < conjunto[0][0].length; largo++) {
            int sumatoria = 0;
            for (int ancho = 0; ancho < conjunto.length; ancho++) {
                for (int alto = 0; alto < conjunto[ancho].length; alto++) {
                    sumatoria += conjunto[ancho][alto][largo];
                }
            }
            System.out.println("SUMATORIA " + (largo + 1) + ": " + sumatoria);
        }
    }

    // TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < conjunto.length; i++) {
            for (int j = 0; j < conjunto[i].length; j++) {
                for (int k = 0; k < conjunto[i][j].length; k++) {
                    sb.append("(").append(i).append(", ").append(j).append(", ").append(k).append("): ");
                    sb.append(conjunto[i][j][k]).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
