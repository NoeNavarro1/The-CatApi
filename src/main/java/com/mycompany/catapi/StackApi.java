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

    //Guardar los datos de getMeEncanta 
    private int[] pila;
    private int top;
    private int tamañoPila;
    
    public void getMeEncanta() {
        tamañoPila = 1;
        top = -1;
        pila = new int[tamañoPila];
    }

    //las operaciones basicas de la pila
    public void push(int dato) {
        if (top == (tamañoPila - 1)) {
            redimensionar();
        }
        pila[++top] = dato;
    }

    public Integer pop() {
        if (top < 0) {
            return null;
        }
        return pila[top--];
    }

    private void redimensionar() {
        int[] temp = pila;
        tamañoPila *= 2;
        pila = new int[tamañoPila];

        for (int i = 0; i <= top; i++) {
            pila[i] = temp[i];
        }
    }
}
