package interfaces;

import java.util.Scanner;

public class Interfaces {

    // Función para mostrar el menú y obtener la opción seleccionada
    public static int menu(String mensaje, String[] opciones, Scanner scanner) {
        int opcionSeleccionada;

        do {
            System.out.println(mensaje);

            // Mostrar las opciones del menú
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            // Verificar si la entrada es un entero
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número.");
                scanner.next(); // Limpiar la entrada
            }

            // Obtener la opción seleccionada del usuario
            opcionSeleccionada = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            if (opcionSeleccionada < 1 || opcionSeleccionada > opciones.length) {
                System.out.println("Opción inválida. Introduce un número válido.");
            }
        } while (opcionSeleccionada < 1 || opcionSeleccionada > opciones.length);

        return opcionSeleccionada;
    }

    public static void cls() {// limpia la consola
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
