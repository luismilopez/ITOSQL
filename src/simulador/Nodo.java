/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author Alex
 */

public class Nodo{
    private Tabla dato;
    private Nodo siguiente;
    public Nodo(Tabla dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    public void setDato(Tabla dato){
        this.dato=dato;
    }
    public void setSiguiente(Nodo dato){
        this.siguiente=dato;
    } 
    public Tabla getDato(){
        return dato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
}

