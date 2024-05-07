package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TextoPlano {

    // Método para leer el contenido completo de un archivo
    public static String leer(String ruta) {

        // Declara el FileReader y BufferedReader
        FileReader fr = null;
        BufferedReader br = null;

        // Declara un string para guardar el contenido del fichero
        String contenidoFichero = "";

        // Lee el fichero y lo guarda en una string
        try {
            // Inicia el FileReader y BufferedReader con el fichero
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            String linea = br.readLine();

            // Lee y guarda en el string todas las líneas
            while (linea != null) {
                contenidoFichero = contenidoFichero + linea + "\n";
                linea = br.readLine();
            }
            fr.close();
            // Devuelve un string con el contenido del fichero
            return contenidoFichero;
        // Si da algún error, lo muestra en la terminal y devuelve null
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Método para leer una línea específica de un archivo
    public static String leerLinea(String ruta, int numeroLinea) {
        FileReader fr = null;
        BufferedReader br = null;
        String contenidoLinea = "";

        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            
            // Salta las líneas hasta llegar a la línea deseada
            for (int i = 0; i < numeroLinea -1 ; i++) {
                br.readLine();
            }

            // Lee la línea deseada y la guarda en una string
            contenidoLinea = br.readLine();

            fr.close();
            return contenidoLinea;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Método para escribir en un archivo
    public static void escribir(String ruta, String contenido) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(ruta));
            // Escribe cada carácter del contenido en el archivo
            for (int i = 0; i < contenido.length(); i++) {
                bw.write(contenido.charAt(i));
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
