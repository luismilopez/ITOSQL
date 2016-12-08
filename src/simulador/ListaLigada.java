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

public class ListaLigada{
    private Nodo cab, fin;
    private int cont;
    public ListaLigada(){
        fin=cab=null;
        cont=0;
    }
    public boolean vacia(){
        return cab==null;
    }
    public boolean agregar(Tabla o){
        Nodo n=new Nodo(o, null);
        if(n!=null){
            if(vacia()){
                fin=cab=n;
            }
            else
                fin.setSiguiente(n);
            fin=n;
            cont++;
            return true;
        }
        return false;
    }
    public void eliminar(Tabla t){
        if(!vacia()){
            if(cab==fin && t.equals(cab.getDato())){
                cab=fin=null;
            }else if(t.equals(cab.getDato())){
                cab=cab.getSiguiente();
            }else{
                Nodo anterior, temporal;
                anterior=cab;
                temporal=cab.getSiguiente();
                while(temporal !=null && !temporal.getDato().equals(t)){
                    anterior=anterior.getSiguiente();
                    temporal=temporal.getSiguiente();
                }
                if(temporal!=null){
                    anterior.setSiguiente(temporal.getSiguiente());
                    if(temporal.equals(fin)){
                        fin=anterior;
                    }
                }
            }
        }
    }
    public Nodo buscar(String d){
        if(vacia())
           return null;
        Nodo aux=cab;
        while(!aux.getDato().getNombre().equals(d))
            aux=aux.getSiguiente();
        return aux;
    }
    public int getCant(){
        return cont;
    }
    public Nodo getCab(){
        return cab;
    }
}

