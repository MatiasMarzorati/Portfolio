public class Robot {
    // Atributos
    int x, y, direccion;

    // Constructores
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direccion = 0;
    }
    public Robot(int x, int y, int direccion) {
        this.x = x;
        this.y = y;
        this.direccion = direccion;
    }

    // toString
    @Override
    public String toString() {
        return "Robot {" +
                "X = " + x +
                ", Y = " + y +
                ", dirección = " + direccion +
                '}';
    }

    // Método para girar
    public void girar() {
        direccion -= 90;
        if (direccion < 0) {
            direccion += 360;
        }
    }
    // Método para avanzar
    public void avanzar() {
        if (direccion == 0) {
            y++;
        } else if (direccion == 90) {
            x++;
        } else if (direccion == 180) {
            y--;
        } else if (direccion == 270) {
            x--;
        }
    }
}
