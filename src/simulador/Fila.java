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
public class Fila {
    private String [] row;
    private int pos;
    public Fila(int t){
        row=new String[t];
        pos=0;
    }
    public void setDato(String dato){
        row[pos]=dato;
        pos++;
    }
    public String getDato(int pos){
        return row[pos];
    }
    public String[] getArray(){
        return row;
    }
    public void setArray(String[] arre){
        row=arre;
    }
}
