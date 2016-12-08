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
public class SeleccionDirecta {
    public ListaDobleLigada seleccionDirecta(ListaDobleLigada arreglo, int c){
        NodoDoble i, k, j;
        String menor[];
	for(i=arreglo.getInicio(); !i.equals(arreglo.getFin()); i=i.getSiguiente()){
            menor = i.getDato().getArray();
	    k=i;
            System.out.println("for");
	    for(j=i.getSiguiente();j!=null/*&& !j.equals(arreglo.getFin())*/;j=j.getSiguiente()){
                System.out.println("for2");
                if(j.getDato().getDato(c).compareTo(menor[c])<0){
                    System.out.println("if ");
                    menor=j.getDato().getArray();
                    k=j;
                }
                System.out.println(j);
            }
            System.out.println("Sali for2");
            k.getDato().setArray(i.getDato().getArray());
            i.getDato().setArray(menor);
            //k.getDato().setArray(i.getDato().getArray());
            //i.getDato().setArray(menor.getDato().getArray());
        }
        return arreglo;
	}
}
