public class Main {
    public static void main(String[] args) {
        // Iniciar nuevos dados
        Dados d1 = new Dados(Dados.tirarDados(), Dados.tirarDados());

        // Atributos
        int suma = d1.getDado1() + d1.getDado2();
        int puntos = 0;
        boolean ganador = false;

        // Imprimir valor de los dados y de la suma
        System.out.println("Dado 1: " + d1.getDado1() + ", Dado 2: " + d1.getDado2() + ", Suma de dados: " + suma);

        // Verificar el resultado del juego
        if (suma == 7 || suma == 11) {
            System.out.println("¡Felicidades, ganaste!");
            ganador = true;
        } else if (suma == 2 || suma == 3 || suma == 12) {
            System.out.println("¡Perdiste!");
        } else {
            // El jugador establece un punto
            System.out.println("Estableciste un punto de " + suma + ".");
            // Establecer el valor de la suma a los puntos
            puntos = suma;
            // Mientras no se haya ganado tirar los dados de nuevo
            while (!ganador) {
                // Iniciar otros dados
                d1 = new Dados(Dados.tirarDados(), Dados.tirarDados());
                suma = d1.getDado1() + d1.getDado2();
                // Imprimir valor de los dados y de la suma
                System.out.println("Dado 1: " + d1.getDado1() + ", Dado 2: " + d1.getDado2() + ", Suma de dados: " + suma);
                // Chequear si la nueva suma es igual a los puntos
                if (suma == puntos) {
                    System.out.println("¡Felicidades, ganaste!¡Tus puntos son igual a la suma!");
                    ganador = true;
                    // Si la suma es 7 perdés
                } else if (suma == 7) {
                    System.out.println("¡Perdiste!¡Te tocó un 7!");
                    ganador = true;
                }
            }
        }
    }
}