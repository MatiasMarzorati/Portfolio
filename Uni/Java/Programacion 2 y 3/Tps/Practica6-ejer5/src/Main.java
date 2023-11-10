import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contrasena, confirmacion;

        boolean valida = false;
        do{
            try {
                System.out.println("Ingrese una contraseña (mínimo 8 caracteres, sin espacios en blanco, con al menos una mayúscula, un número y un carácter especial): ");
                contrasena = sc.nextLine();

                if (contrasena.length() < 8) {
                    throw new Exception("La contraseña debe tener al menos 8 caracteres");
                }

                if (contrasena.contains(" ")) {
                    throw new Exception("La contraseña no puede tener espacios en blanco");
                }

                boolean contieneMayuscula = false;
                boolean contieneNumero = false;
                boolean contieneCaracterEspecial = false;

                for (int i = 0; i < contrasena.length(); i++) {
                    char caracter = contrasena.charAt(i);

                    if (Character.isUpperCase(caracter)) {
                        contieneMayuscula = true;
                    } else if (Character.isDigit(caracter)) {
                        contieneNumero = true;
                    } else if (!Character.isLetterOrDigit(caracter)) {
                        contieneCaracterEspecial = true;
                    }
                }

                if (!contieneMayuscula || !contieneNumero || !contieneCaracterEspecial) {
                    throw new Exception("La contraseña debe tener al menos una mayúscula, un número y un carácter especial.");
                }

                System.out.print("Ingrese la contraseña nuevamente para confirmar: ");
                confirmacion = sc.nextLine();

                if (!contrasena.equals(confirmacion)) {
                    throw new Exception("Las contraseñas no coinciden.");
                }

                valida = true;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (!valida);
        System.out.println("Contraseña válida.");
    }
}