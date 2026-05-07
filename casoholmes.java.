import java.util.Scanner;

class Policia {

    protected int id;
    protected String nombre;
    protected String agencia;
    protected String rango;

    public Policia(int id, String nombre, String agencia, String rango) {

        this.id = id;
        this.nombre = nombre;
        this.agencia = agencia;
        this.rango = rango;
    }

    public void reportar() {

        System.out.println(nombre + " reporta a " + agencia);
    }

    public String obtenerInfo() {

        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Agencia: " + agencia +
               " | Rango: " + rango;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int id;
        String nombre;
        String agencia;
        String rango;
        int edad;
        int pistas = 0;
        int opcion;
        boolean casoResuelto = false;

        // ===== BIENVENIDA =====
        System.out.println("==========================");
        System.out.println(" DEPARTAMENTO DE POLICÍA ");
        System.out.println(" Caso #1: HIDDEN");
        System.out.println("==========================");

        // DATOS DEL POLICÍA
        System.out.print("Ingrese el ID del oficial: ");
        id = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingrese el nombre del oficial: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese la agencia policial: ");
        agencia = teclado.nextLine();

        System.out.print("Ingrese el rango del oficial: ");
        rango = teclado.nextLine();

        System.out.print("Ingrese la edad del oficial: ");
        edad = teclado.nextInt();
        teclado.nextLine();

        // VALIDACIÓN DE EDAD
        if (edad < 18) {

            System.out.println("Lo siento, no cumples la edad requerida.");
            teclado.close();
            return;
        }

        // CREAR OBJETO POLICIA
        Policia policia = new Policia(
                id,
                nombre,
                agencia,
                rango
        );

        System.out.println("\nBienvenido, oficial " + nombre + ".");
        System.out.println("Tu misión es resolver el caso HIDDEN.");
        System.out.println("Necesitas al menos 3 pistas.");

        // MOSTRAR INFORMACIÓN DEL AGENTE
        System.out.println("\n=== INFORMACIÓN DEL POLICÍA ===");
        System.out.println(policia.obtenerInfo());
        policia.reportar();

        // ===== MENÚ =====
        System.out.println("\n--- MENÚ POLICIAL ---");
        System.out.println("1. Buscar pistas");
        System.out.println("2. Interrogar sospechosos");
        System.out.println("3. Resolver el caso");

        System.out.print("Elige una opción (1-3): ");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {

            case 1:

                System.out.println("\nBUSCANDO PISTAS...");

                String[] evidencias = {
                        "Huella digital en la ventana",
                        "Copa de vino con residuos",
                        "Nota rasgada en el escritorio",
                        "Cuchillo en la cocina"
                };

                for (int i = 0; i < evidencias.length; i++) {

                    pistas++;

                    System.out.println(
                            "Pista #" + pistas + ": " + evidencias[i]
                    );
                }

                System.out.println("Total de pistas: " + pistas);
                break;

            case 2:

                System.out.println("\nINTERROGATORIOS");

                String[] sospechosos = {
                        "James Barnes",
                        "Aurelio Vásquez",
                        "Victoria Reyes",
                        "Bruno Quiroga"
                };

                int s = 0;
                String seguir = "si";

                while (seguir.equalsIgnoreCase("si")) {

                    System.out.println(
                            "Interrogando a: " + sospechosos[s]
                    );

                    System.out.println(
                            "-> Dice que es inocente..."
                    );

                    s++;

                    if (s < sospechosos.length) {

                        System.out.print(
                                "¿Interrogar al siguiente? (si/no): "
                        );

                        seguir = teclado.nextLine();

                    } else {

                        System.out.println(
                                "No hay más sospechosos."
                        );

                        seguir = "no";
                    }
                }

                break;

            case 3:

                System.out.println("\nRESOLUCIÓN DEL CASO");

                if (pistas >= 3) {

                    System.out.println("¡Tienes suficientes pistas!");
                    System.out.println("El culpable es: Aurelio Vásquez");
                    System.out.println(
                            "¡CASO RESUELTO, oficial " + nombre + "!"
                    );

                    casoResuelto = true;

                } else if (pistas >= 1) {

                    System.out.println(
                            "Tienes " + pistas + " pista(s). Necesitas 3."
                    );

                    System.out.println("¡Sigue investigando!");

                } else {

                    System.out.println("No tienes ninguna pista.");
                    System.out.println("Ve a buscar pistas primero.");
                }

                break;

            default:

                System.out.println("Opción inválida.");
        }

        // ESTADO FINAL
        if (casoResuelto) {

            System.out.println("\nEl caso fue cerrado exitosamente.");

        } else {

            System.out.println("\nEl caso sigue abierto.");
        }

        teclado.close();
    }
}
