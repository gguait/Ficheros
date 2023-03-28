
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
 * @author guait
 */
public class Secuenciales4 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        //  Leer todo el archivo
        BufferedReader br = null;
        BufferedWriter bw = null;

        String dni = "dni.txt";
        String nif = "nif.txt";

        try {
            br = new BufferedReader(new FileReader(dni));
            bw = new BufferedWriter(new FileWriter(nif, false));

            String texto = br.readLine();

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            while (texto != null) {
                while (texto.length() < 8) {
                    texto = "0" + texto;
                }
                int letra_nif = Integer.parseInt(texto) % 23;
                bw.write(texto + letras.charAt(letra_nif));
                bw.newLine();
                texto = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
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
