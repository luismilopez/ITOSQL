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
public class Baraja {
    public ListaDobleLigada baraja(ListaDobleLigada arreglo, int c){
    NodoDoble i, k;
    String []aux;
    for(i=arreglo.getInicio().getSiguiente();!i.equals(arreglo.getFin());i=i.getSiguiente()){
        aux=i.getDato().getArray();
        k=i.getAnterior();
        System.out.println("for");
        while(k!=null && aux[c].compareTo(k.getDato().getDato(c))<0){
            System.out.println("while");
            k.getSiguiente().getDato().setArray(k.getDato().getArray());
            k=k.getAnterior();
        }
            if(k.getDato().getDato(c).compareTo(aux[c])>=0){
                System.out.println("if");
                k.getSiguiente().getDato().setArray(aux);
            }
            else{
                System.out.println("else");
                k.getSiguiente().getDato().setArray(k.getDato().getArray());
                k.getDato().setArray(aux);
            }
        System.out.println("sali while");
    }
    return arreglo;
    }
}
