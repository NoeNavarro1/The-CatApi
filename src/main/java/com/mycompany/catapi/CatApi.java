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
        GatosService catService = new GatosService();
        catService.getGatos();
        catService.getMeEncanta();
        StackApi obj = new StackApi();
        

        int opcionMenu = -1;
        String[] opciones = {
            "1. Ver gatos",
            "2. Ver me encanta",
            "3. ver eliminados",
            "2. Salir"
        };
        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatito java", "Menú Principal",
                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            for (int i = 0; i < opciones.length; i++) {
                if (opcion.equals(opciones[i])) {
                    opcionMenu = i;
                }
                GatosService service = new GatosService();
                switch (opcionMenu) {
                    case 0:
                        System.out.println("Vas a ver un gato :");
                        service.getGatos();
                        break;
                    case 1:
                        System.out.println("Vas a ver tus me encanta :");
                        obj.mostrarPilaApi();
                        break;
                    case 2:
                        System.out.println("Vas a ver tus eliminados :");

                        break;
                    case 3:
                        System.out.println("Vas a salir del sistema");
                }
            }
        } while (opcionMenu != 1);
    }
}
