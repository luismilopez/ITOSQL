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
import java.util.ArrayList;
public class Tabla {
    private String nombre;
    private Campo [] atributos;
    private ListaDobleLigada filas;
    private int pos;
    public Tabla(int total){
        this.pos=0;
        atributos=new Campo[total];
        filas=new ListaDobleLigada();
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCampos(Campo atributo){
        this.atributos[this.pos]=atributo;
        this.pos++;
    }
    public void setDatos(String dato){
        //data.add(dato);
    }
    public String getNombre(){
        return nombre;
    }
    public Campo getCampo(int posicion){
        return atributos[posicion];
    }
    public int getLength(){
        return atributos.length;
    }
    public void setFila(Fila f){
        filas.agregarF(f);
    }
    public ListaDobleLigada getLista(){
        return filas;
    }
    public void burbuja(int pos){
        Burbuja b=new Burbuja();
        filas=b.burbuja(filas, pos);
    }
    public void burbujaSenal(int pos){
        BurbujaSenal b=new BurbujaSenal();
        filas=b.burbujaConSenal(filas, pos);
    }
    public void seleccionDirecta(int pos){
        SeleccionDirecta b= new SeleccionDirecta();
        filas=b.seleccionDirecta(filas, pos);
    }
    public void baraja(int pos){
        Baraja b=new Baraja();
        b.baraja(filas, pos);
    }
}
