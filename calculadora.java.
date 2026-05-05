import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Potencia");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4 || opcion >= 6 && opcion <= 6) {
                System.out.print("Ingresa el primer número: ");
                double a = sc.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (a + b));
                    case 2 -> System.out.println("Resultado: " + (a - b));
                    case 3 -> System.out.println("Resultado: " + (a * b));
                    case 4 -> {
                        if (b == 0) System.out.println("Error: no se puede dividir por cero.");
                        else System.out.println("Resultado: " + (a / b));
                    }
                    case 6 -> System.out.println("Resultado: " + Math.pow(a, b));
                }
            } else if (opcion >= 5 && opcion <= 8) {
                System.out.print("Ingresa el número: ");
                double a = sc.nextDouble();

                switch (opcion) {
                    case 5 -> System.out.println("Resultado: " + Math.sqrt(a));
                    case 7 -> System.out.println("Resultado: " + Math.sin(Math.toRadians(a)));
                    case 8 -> System.out.println("Resultado: " + Math.cos(Math.toRadians(a)));
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        System.out.println("¡Hasta luego!");
        sc.close();
    }
}
