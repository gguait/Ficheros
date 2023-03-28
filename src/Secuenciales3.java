
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
public class Secuenciales3 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        //  Leer todo el archivo
        BufferedReader br1 = null;
        BufferedWriter bw = null;

        String leer1 = "ficheroejercicio3_1.txt";

        System.out.println("Dime el nombre del fichero de salida");
        String escribir1 = teclado.nextLine() + ".txt";

        System.out.println("Dime el tamaño minimo que tiene que tener la linea");
        int cantidad = teclado.nextInt();

        try {
            br1 = new BufferedReader(new FileReader(leer1));
            bw = new BufferedWriter(new FileWriter(escribir1, false));

            String texto1 = br1.readLine();

            while (texto1 != null) {
                if (texto1.length() >= cantidad) {
                    bw.write(texto1);
                    bw.newLine();
                }
                texto1 = br1.readLine();
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
