/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapi;
import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;


/**
 *
 * @author Noena
 */
public class StackApi {
    int StackApi[] = new int[5];
    int tope = -1;

    //Metod para ingresar Metodos a la pila
    public void pushApi(){
        if (tope >= StackApi.length - 1) {
            System.out.println("La pila esta llena. ");
        } else {
            tope += 1;
            System.out.println("La pila aun no esta llena");

        }
    }

    public int popApi() {
        if (tope == -1) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Se ha Eliminado un objeto de la pila");
            StackApi[tope] = 0;
        }
        return tope--;
    }

    public void mostrarPilaApi() throws IOException{
        GatosService catService = new GatosService();
        catService.getMeEncanta();
        for (tope = 4; tope >= 0; tope--) {
            OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("text/plain");
        Request request;
            request = new Request.Builder()
                    .url("https://api.thecatapi.com/v1/images/search")
                    .method("GET", null)
                    .build();
        Response response = client.newCall(request).execute();

        // Crear un objeto con formato JSON
        String gatoJson = response.body().string();
        // Quitar llave inicial y final
        gatoJson = gatoJson.substring(1, gatoJson.length());
        gatoJson = gatoJson.substring(0, gatoJson.length() - 1);

        System.out.println("gatoJson: " + gatoJson);
        }
    }
}
