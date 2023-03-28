
import java.io.*;

public class Ej1 {

    public static void main(String[] args) throws IOException {

//  Leer todo el archivo
//        String nombreFichero = "config.txt";
//        FileReader fr = null;
//        try {
//            fr = new FileReader(nombreFichero);
//            int caract = fr.read();
//            while (caract != -1) {
//                System.out.print((char) caract);
//                caract = fr.read();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: fichero no encontrado");
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (fr != null) {
//                    fr.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error al cerrar el fichero");
//                System.out.println(e.getMessage());
//            }
//        }


//  Leer linea por linea
        String nombreFichero = "si.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombreFichero));
            String texto = br.readLine();
            while (texto != null) {
                System.out.println(texto);
                texto = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
