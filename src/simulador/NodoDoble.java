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
public class NodoDoble{
    private NodoDoble anterior, siguiente;
    private Fila dato;
    public NodoDoble(Fila dato){
        this.dato=dato;
        anterior=null;
        siguiente=null;
    }
    public void setDato(Fila dato){
        this.dato=dato;
    }
    public void setAnterior(NodoDoble anterior){
        this.anterior=anterior;
    }
    public void setSiguiente(NodoDoble siguiente){
        this.siguiente=siguiente;
    }
    public Fila getDato(){
        return dato;
    }
    public NodoDoble getAnterior(){
        return anterior;
    }
    public NodoDoble getSiguiente(){
        return siguiente;
    }
}
