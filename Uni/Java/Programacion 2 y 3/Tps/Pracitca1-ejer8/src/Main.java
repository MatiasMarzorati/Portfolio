public class Main {
    public static void main(String[] args) {
        // Crear 2 robots
        Robot r1 = new Robot();
        Robot r2 = new Robot(5, 3, 90);

        // Movimiento 1
        System.out.println("Movimiento 1");
        r1.avanzar();
        r2.avanzar();
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("\n");

        // Movimiento 2
        System.out.println("Movimiento 2");
        r1.avanzar();
        r2.girar();
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("\n");

        // Movimiento 3
        System.out.println("Movimiento 3");
        r1.girar();
        r2.avanzar();
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("\n");

        // Movimiento 4
        System.out.println("Movimiento 4");
        r1.girar();
        r2.girar();
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("\n");

        // Movimiento 5
        System.out.println("Movimiento 5");
        r1.avanzar();
        r2.avanzar();
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("\n");
    }
}