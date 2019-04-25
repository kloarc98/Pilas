/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * Kevin Oswaldo Loarca Fuentes
 * 0901-17-11537
 */
public class Pilas {

    void push(String Dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Dato {

        public Dato() {
        }
    }
    
    private class Nodo{
        public Dato dato;
        public Nodo siguiente = null;
        
        public Nodo(Dato dato){
            this.dato = dato;
        }
    }
    
    private Nodo cima = null;
    
    private int longitud = 0;

    
    public void push(Dato dato){
        Nodo nodo = new Nodo(dato);
        nodo.siguiente = cima;
        cima =  nodo;
        longitud++;
    }
    public void pop(){
        if(cima!=null){
            Nodo eliminar =cima;
            cima=cima.siguiente;
            eliminar.siguiente = null;
            longitud--;
        }
    }
    public Dato obte(){
        if(cima==null){
            return null;
        }else{
            return cima.dato;
        }
    }
    public int longitud(){
        return longitud;
    }
    
    public boolean vacia(){
        return longitud==0;
    }
}
