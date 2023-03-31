
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
        BufferedWriter bw1 = null;
        BufferedWriter bw2 = null;

        String dni = "dni.txt";
        String nif = "nif.txt";

        try {
            bw1 = new BufferedWriter(new FileWriter(dni, false));
            bw2 = new BufferedWriter(new FileWriter(nif, false));

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            System.out.println("Dime un numero inicial");
            int numInicial = teclado.nextInt();

            System.out.println("Dime un numero Final");
            int numFinal = teclado.nextInt();

            String num_texto = null;

            int letra_nif;
            for (int i = numInicial; i <= numFinal; i++) {
                num_texto = String.valueOf(i);
                while (num_texto.length() < 8) {
                    num_texto = "0" + num_texto;
                }
                bw1.write(num_texto);
                bw1.newLine();
                letra_nif = Integer.parseInt(num_texto) % 23;
                bw2.write(num_texto + letras.charAt(letra_nif));
                bw2.newLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw1 != null) {
                    bw1.close();
                }
                if (bw2 != null) {
                    bw2.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }

    }
}
