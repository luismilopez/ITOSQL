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
public class BurbujaSenal{
    public ListaDobleLigada burbujaConSenal(ListaDobleLigada arreglo, int c){
		String []aux;
                NodoDoble x=arreglo.getInicio(), y;
		boolean band = false;
                int i=0;
		while(!x.equals(arreglo.getFin()) && band == false){
                    System.out.println("entre a while");
			band = true;
                        NodoDoble temp=arreglo.getFin();
                        for(int j=0;j<i;j++){
                            temp.getAnterior();
                        }
			for(y = arreglo.getInicio(); !y.equals(temp); y=y.getSiguiente()){
                            System.out.println("for");
                            if(y.getDato().getDato(c).compareTo(y.getSiguiente().getDato().getDato(c))>0){
                                aux=y.getDato().getArray();
                                y.getDato().setArray(y.getSiguiente().getDato().getArray());
                                y.getSiguiente().getDato().setArray(aux);
                                band=false;
                            }
                        }
                        i++;
                    x=x.getSiguiente();
		}
		return arreglo;
	}
}