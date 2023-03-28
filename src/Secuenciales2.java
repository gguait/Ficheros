
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pabmar
 */
public class Secuenciales2 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        //  Leer todo el archivo
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;

        String leer1 = "secuencialesfichero1.txt";
        String leer2 = "secuencialesfichero2.txt";

        System.out.println("Dime el nombre del fichero de salida");
        String escribir1 = teclado.nextLine() + ".txt";

        System.out.println("Dime un caracter para utilizar como separador");
        char separador = teclado.next().charAt(0);

        try {
            br1 = new BufferedReader(new FileReader(leer1));
            br2 = new BufferedReader(new FileReader(leer2));
            bw = new BufferedWriter(new FileWriter(escribir1, false));

            String texto1 = br1.readLine();
            String texto2 = br2.readLine();

            int lineas1 = 1;
            int lineas2 = 1;

            while (br1.readLine() != null) {
                lineas1++;
            }

            while (br2.readLine() != null) {
                lineas2++;
            }

            br1 = new BufferedReader(new FileReader(leer1));
            br2 = new BufferedReader(new FileReader(leer2));
            for (int i = 0; i < lineas1; i++) {
                texto1 = br1.readLine();
                br2 = new BufferedReader(new FileReader(leer2));
                for (int j = 0; j < lineas2; j++) {
                    texto2 = br2.readLine();
                    bw.write(texto1 + separador + texto2);
                    bw.newLine();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }

    }
}
