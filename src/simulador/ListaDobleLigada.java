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
public class ListaDobleLigada {
    private NodoDoble inicio, fin;
    private int cant;
    public ListaDobleLigada(){
        inicio=fin=null;
        cant=0;
    }
    public boolean vacia(){
        return inicio==null;
    }
    public void enlazar(NodoDoble a, NodoDoble b){
        a.setSiguiente(b);
        b.setAnterior(a);
    }
    public boolean agregarF(Fila o){
        NodoDoble n=new NodoDoble(o);
        if(vacia())
            inicio=fin=n;
        else{
            enlazar(fin, n);
        fin=n;
        }
        cant++;
        return true;
    }
    public NodoDoble getInicio(){
        return inicio;
    }
    public NodoDoble getFin(){
        return fin;
    }
    public int getTotal(){
        return cant;
    }
}
