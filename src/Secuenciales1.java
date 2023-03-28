
import java.io.*;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pabmar
 */
public class Secuenciales1 {

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
            bw = new BufferedWriter(new FileWriter(escribir1, true));

            String texto1 = br1.readLine();
            String texto2 = br2.readLine();

            while (texto1 != null || texto2 != null) {

                bw.write(texto1 + separador + texto2);
                bw.newLine();

                texto1 = br1.readLine();
                texto2 = br2.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
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
