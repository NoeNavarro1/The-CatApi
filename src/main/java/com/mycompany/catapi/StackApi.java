/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catapi;

/**
 *
 * @author Noena
 */
public class StackApi {

    private final Gato stack[];
    private int top = 0;
    public Gato g;

    public StackApi() {
        this.stack = new Gato[5];
    }

    public boolean estaLlena() {
        return top == 5;
    }

    // Almacenar un gato en el stack
    public void push(Gato g) {
        if (!estaLlena()) {
            stack[top] = g;
            top++;
        } else {
            System.out.println("La pila está llena.");
        }
    }

    // Mostrar Gatos del stack
    public void mostrarGato() {
        System.out.println("Mostrando Me encanta <3: ");

        for (Gato g : stack) {
            System.out.println("GSON : " + g.getId() + g.getUrl());
        }
    }

    // Quitar gato del stack
    public void pop() {
        System.out.println("Eliminar: ");
        Gato gatoActual = stack[top - 1];
        System.out.println("Gato ID: " + gatoActual.getId() + "Gato URL: " + gatoActual.getUrl());
        stack[top - 1] = null;
        System.out.println("Gato eliminado");
    }

    // Verificar si el stack está vacio
}
