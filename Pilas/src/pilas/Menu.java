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
        
        Pilas pila = new Pilas();
        Scanner Scanner = new Scanner(System.in);
        int opcion;
        
        do{
              
            System.out.println("Ingrese que opcion desea");
            System.out.print("1. PUSH\n2.Ver si esta Vacia\n3. POP\n"
                    + "4. TOP\n5. Salir\n");
           opcion = Scanner.nextInt();
                
            switch(opcion){
                
                case 1:
                    System.out.println("-ingrese Dato");
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
                   
            }while(opcion!=0);
        pila.Push("1");
        pila.Push("2");
        pila.Push("3");
        pila.Push("4");
        pila.Push("5");
        
        
        System.out.println(pila.Pop());
        System.out.println(pila.Vacia());
        System.out.println(pila.Pop());
        System.out.println(pila.Vacia());
    }

    
}
