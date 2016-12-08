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
public class Burbuja {
    
    public ListaDobleLigada burbuja(ListaDobleLigada arreglo, int c){
                String []aux;
                int i=0, j=0;
                for(NodoDoble x=arreglo.getInicio();x!=null;x=x.getSiguiente()){
                    for(NodoDoble y=arreglo.getFin(); !y.equals(x);y=y.getAnterior())
                        if(y.getAnterior().getDato().getDato(c).compareTo(y.getDato().getDato(c))>0){
                            aux=y.getAnterior().getDato().getArray();
                            y.getAnterior().getDato().setArray(y.getDato().getArray());
                            y.getDato().setArray(aux);
                        }
                }
		return arreglo;
	}
}
