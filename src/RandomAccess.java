
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pabmar
 */
public class RandomAccess {

    public static void main(String[] args) {
        int pos = 11;

        String nombreFichero = "prueba.txt";
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(nombreFichero, "rw");
            long tamano = raf.length();

            raf.seek(pos);
            if (raf.getFilePointer() < tamano) {
                int caract = raf.read();
                raf.seek(raf.getFilePointer() - 1);
                raf.write(Character.toUpperCase(caract));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura/escritura en el fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
                System.out.println(e.getMessage());
            }
        }
    }
}
