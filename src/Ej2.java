
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pabmar
 */
public class Ej2 {
    public static void main(String[] args) {
        
//  Escribir en fichero
        
//        String nombreFichero = "config.txt";
//        FileWriter fw = null;
//        
//        try{
//            fw = new FileWriter(nombreFichero, true); //True para agregar al fichero, false para sobreescribir
//            for (char c = 'A'; c <= 'Z'; c++) {
//                fw.write(c);
//            }
//            fw.write("\n");
//        } catch (IOException e) {
//            System.out.println("Error de escritura");
//            System.out.println(e.getMessage());
//        } finally{
//            try{
//                if (fw != null) {
//                    fw.close();
//                }
//            } catch (IOException e){
//                System.out.println("Error al cerrar el fichero");
//                System.out.println(e.toString());
//            }
//        }

//  Escribir en un fichero de texto cadenas de caracteres 

    String nombreFichero = "config.txt";
    String texto = "Texto de prueba";
    BufferedWriter bw = null;
    
    try{
        bw = new BufferedWriter(new FileWriter(nombreFichero,true));
        bw.write(texto);
        bw.newLine();
    } catch (IOException e){
        System.out.println("Error de lectora del fichero");
        System.out.println(e.getMessage());
    } finally {
        try{
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
