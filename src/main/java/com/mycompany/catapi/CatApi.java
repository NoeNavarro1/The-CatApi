/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.catapi;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Noena
 */
public class CatApi {

    public static void main(String[] args) throws IOException {
        StackApi stackGatos = new StackApi();

        int opcionMenu = -1;
        String[] opciones = {
            "1. Ver Gatos",
            "2. Mostrar Me encanta <3",
            "3. Revisar si el Stack está lleno",
            "4.  Eliminar",
            "5. Salir"
        };

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menú Principal",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            for (int i = 0; i < opciones.length; i++) {
                if (opcion.equals(opciones[i])) {
                    opcionMenu = i;
                }
            }

            GatosService service = new GatosService();

            switch (opcionMenu) {
                case 0 -> {
                    System.out.println("Vas a ver a un gato.");
                    Gato g = service.getGatos();
                    stackGatos.push(g);
                }
                case 1 ->
                    stackGatos.mostrarGato();
                case 2 -> {
                    if (stackGatos.estaLlena()) {
                        System.out.println("Esta lleno.");
                    } else {
                        System.out.println("Todavia no está lleno");
                    }
                }
                case 3 ->
                    stackGatos.pop();
                case 4 ->
                    System.out.println("Saliendo del sistema.");
            }
        } while (opcionMenu != 4);
    }
}
