package ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Binarios {


    public static <T> T leer(String fichero) {
        T contenido = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {

            contenido = (T)ois.readObject();

        } catch (EOFException e) {
        }catch (IOException |ClassNotFoundException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
        return contenido;
    }

    public static <T> void  escribir(T contenido, String fichero) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(contenido);
        }catch (IOException e){
            System.out.println("Error al escribir el fichero ");
        }
    }
}

