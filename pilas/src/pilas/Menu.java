/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Menu {
    public static void main(String args[]){
        
               
        Pilas nodo = new Pilas();
        Scanner Scanner = new Scanner(System.in);
        int opcion;
        String Dato;
        
        do{
              
            System.out.println("Ingrese que opcion desea");
            System.out.print("1. PUSH\n2.Ver si esta Vacia\n3. POP\n"
                    + "4. TOP\n5. Salir\n");
           opcion = Scanner.nextInt();
                
            switch(opcion){
                
                case 1:
                    System.out.println("-ingrese Dato");
                    Dato = Scanner.nextLine();
                    nodo.push(Dato);
                    if(nodo.vacia()){
                        System.out.println("Pila Vacia");
                    }else{
                        System.out.println("Pila = "+nodo.longitud()+" "+ nodo.obte());
                    }
                    
                    break;
                case 2:
                    nodo.vacia();
                    break;
                case 3:
                    break;
                case 4:
                    nodo.obte();
                    break;
                case 5:
                    break;
            }
                   
            }while(opcion!=0);
    
    }
    
}
