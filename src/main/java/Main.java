import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarea> listaDeTareas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== GESTOR DE TAREAS ===");
            System.out.println("1. Agregar una tarea nueva");
            System.out.println("2. Ver todas mis tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir");
            System.out.print("Elige un número: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            if (opcion == 1) {
                System.out.print("Escribe de qué trata la tarea: ");
                String textoTarea = teclado.nextLine();
                Tarea nuevaTarea = new Tarea(textoTarea); // Usamos el molde
                listaDeTareas.add(nuevaTarea); // La metemos a la caja
                System.out.println("¡Tarea agregada con éxito!");

            } else if (opcion == 2) {
                System.out.println("\n--- TUS TAREAS ---");
                if (listaDeTareas.isEmpty()) {
                    System.out.println("No tienes tareas guardadas todavía.");
                } else {
                    for (int i = 0; i < listaDeTareas.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeTareas.get(i).toString());
                    }
                }

            } else if (opcion == 3) {
                System.out.print("¿Qué número de tarea ya terminaste?: ");
                int numeroTarea = teclado.nextInt();

                if (numeroTarea > 0 && numeroTarea <= listaDeTareas.size()) {
                    listaDeTareas.get(numeroTarea - 1).marcarComoCompletada();
                    System.out.println("¡Excelente! Tarea completada.");
                } else {
                    System.out.println("Ese número de tarea no existe.");
                }
            }
        }
        System.out.println("¡Nos vemos!");
    }
}