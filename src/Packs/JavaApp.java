/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packs;

import Service.Servicio;
import java.util.Scanner;

/**
 *
 * @author JuanPablo
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicio Serv = new Servicio();

        System.out.println("Bienvenido a la nueva App: \nPorfavor diguite sus datos");
        System.out.println("Porfavor selecicone la opcion que desea realizar\n1) Crear Registro\n2) Consultar Registros");
        int val = sc.nextInt();
        do {
            if (val == 1) {
                Serv.Add();
            } else {
                Serv.Consulta();
            }
        } while (val <= 0 && val >= 3);

    }
}
