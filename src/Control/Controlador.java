/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import Models.User;

/**
 *
 * @author JuanPablo
 */
public class Controlador {

    File Archivo;
    FileWriter escritor;
    PrintWriter linea;
    FileReader lector;
    BufferedReader almacenamiento;
    private String cadena;

    private String var;
    public String error;

    public String Registrar(User User) {
        var = "En proceso...";
        Archivo = new File("Document.txt");
        try {
            if (!Archivo.exists()) {
                Archivo.createNewFile();
                escritor = new FileWriter(Archivo, true);
                linea = new PrintWriter(escritor);
                linea.println(User.getId()+";"+User.getNombre()+";"+User.getApellido()+";"+User.getEmail()+";"+User.getTelefono());
                linea.close();
                escritor.close();
                var = "Registro Completo";
            } else {
                escritor = new FileWriter(Archivo, true);
                linea = new PrintWriter(escritor);
                linea.println(User.getId()+";"+User.getNombre()+";"+User.getApellido()+";"+User.getEmail()+";"+User.getTelefono());
                linea.close();
                escritor.close();
                var = "Registro Completo";
            }

        } catch (Exception ex) {
            error = "";
            var = "SE PRESENTA EL SIGUEINTE ERROR: " + ex.toString();
            error = var;
        }
        return var;
    }

    public String Consulta() {
        var = "En proceso...";
        try {
            Archivo = new File("Document.txt");
            lector = new FileReader(Archivo);
            almacenamiento = new BufferedReader(lector);
            cadena = "";
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
            }
            almacenamiento.close();
            lector.close();
        } catch (Exception ex) {
            error = "";
            var = "SE PRESENTA EL SIGUEINTE ERROR: " + ex.toString();
            error = var;
        }
        return var;
    }

}
