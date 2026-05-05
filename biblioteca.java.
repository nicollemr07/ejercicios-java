import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> t = new ArrayList<>();
        ArrayList<Boolean> l = new ArrayList<>();
        while (true)
        {
            System.out.println("\n1.Agregar 2.Buscar 3.Cambiar 4.Salir");
            String op = sc.nextLine();
            switch (op)
            {
                case "1":
                    System.out.print("Título: ");
                    t.add(sc.nextLine());
                    l.add(false);
                    break;

                case "2":
                    System.out.print("Buscar: ");
                    String b = sc.nextLine();

                    for (int i = 0; i < t.size(); i++)
                    {
                        if (t.get(i).equalsIgnoreCase(b))
                        {
                            System.out.println(l.get(i) ? "Leído" : "No leído");
                        }
                    }
                    break;
                case "3":
                    System.out.print("Título: ");
                    String c = sc.nextLine();
                    for (int i = 0; i < t.size(); i++)
                    {
                        if (t.get(i).equalsIgnoreCase(c))
                        {
                            l.set(i, !l.get(i));
                            System.out.println("Estado cambiado");
                        }
                    }
                    break;

                case "4":
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
