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
    String arr[];
    int max;
    int top;
    
    public Pilas(){
        arr = new String[10];
        top = 0;
    }
    
    public boolean Vacia(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
    public void Push(String str){
        if(top<arr.length){
        arr[top]=str;
        top++;
        }else{
            String temporal[] = new String[arr.length+10];
            for(int i = 0;i<arr.length; i++){
                temporal[i]=arr[i];
            }
            arr = temporal;
        }
    }
    public String peek(){
        if(top>0)
        return arr[top-1];
        else 
            return null;
    }
    public String Pop(){
        String temp=null;
        if(top>0){
            temp=arr[top-1];
            arr[top-1]=null;
            top--;
        }
        return temp;
    }
    
}
