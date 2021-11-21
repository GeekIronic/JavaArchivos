/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Control.Controlador;
import java.util.Scanner;
import Models.User;

/**
 *
 * @author JuanPablo
 */
public class Servicio {

    User usuario = new User();
    Controlador cont = new Controlador();
    Scanner sc = new Scanner(System.in);

    public void Add() {
        try {
            System.out.println("\nRegistro de nuevo Usuario");
            System.out.println("C.C.: ");
            usuario.setId(sc.nextLong());
            usuario.setNombre(sc.nextLine());
            System.out.println("Nombre: ");
            usuario.setNombre(sc.nextLine());
            System.out.println("Apellido: ");
            usuario.setApellido(sc.nextLine());
            System.out.println("Email: ");
            usuario.setEmail(sc.nextLine());
            System.out.println("Telefono: ");
            usuario.setTelefono(sc.nextLong());
            if (cont.Registrar(usuario) == "Registro Completo") {
                System.out.println("Los datos fueron registrados correctamente en el archivo ");
            } else {
                System.out.println(cont.error);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    public void Consulta() {
        System.out.println("\nConsulta de Usuarios");
        if (cont.Consulta() != null) {
            System.out.println("Consulta Terminada...");
        } else {
            System.out.println(cont.error);
        }
    }

}
