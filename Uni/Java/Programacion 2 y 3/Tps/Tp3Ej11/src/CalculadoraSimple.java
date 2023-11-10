import java.util.Scanner;
import java.util.Stack;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión matemática en notación infija:");
        String expresion = scanner.nextLine();

        double resultado = evaluarExpresion(expresion);
        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }

    public static double evaluarExpresion(String expresion) {
        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                numeros.push(Double.parseDouble(token));
            } else if (esOperador(token.charAt(0))) {
                while (!operadores.isEmpty() && tienePrecedencia(token.charAt(0), operadores.peek())) {
                    double segundoNumero = numeros.pop();
                    double primerNumero = numeros.pop();
                    char operador = operadores.pop();
                    double resultadoOperacion = realizarOperacion(primerNumero, segundoNumero, operador);
                    numeros.push(resultadoOperacion);
                }
                operadores.push(token.charAt(0));
            }
        }

        while (!operadores.isEmpty()) {
            double segundoNumero = numeros.pop();
            double primerNumero = numeros.pop();
            char operador = operadores.pop();
            double resultadoOperacion = realizarOperacion(primerNumero, segundoNumero, operador);
            numeros.push(resultadoOperacion);
        }

        return numeros.pop();
    }

    public static boolean esNumero(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static int obtenerPrioridad(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    public static boolean tienePrecedencia(char operador1, char operador2) {
        int prioridad1 = obtenerPrioridad(operador1);
        int prioridad2 = obtenerPrioridad(operador2);

        return prioridad1 >= prioridad2;
    }

    public static double realizarOperacion(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            case '^':
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
