import java.util.Random;

public class Dados {
    // Iniciar el random
    private static final Random random = new Random();

    // Atributos
    private int dado1;
    private int dado2;

    // Constuctor
    public Dados(int d1, int d2) {
        this.dado1 = d1;
        this.dado2 = d2;
    }

    // Getters
    public int getDado1() {
        return dado1;
    }
    public int getDado2() {
        return dado2;
    }

    // Método para tirar el dado
    public static int tirarDados() {
        return random.nextInt(6) + 1;
    }
}