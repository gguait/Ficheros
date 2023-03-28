
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class ListaDirectoriosArchivos {
    public static void main(String[] args) {
        File dirActual = new File("/home/pabmar/");
        String[] lista = dirActual.list();
        for (int i = 0; i < lista.length; i++) {
            File f = new File(lista[i]);
            System.out.println("Nombre: "+ f.getName());
            System.out.println("Tamano: "+ f.length());
            if (f.isDirectory()) {
                System.out.println("Es un directorio");
            } else{
                System.out.println("Es un archivo");
            }
            System.out.println("----------------");
        }
        File prueba = new File("config.txt");
        if (prueba.exists()) {
            System.out.println("El archivo config.txt existe");
        } else {
            System.out.println("El archivo config.txt no existe");
        }
    }
}
