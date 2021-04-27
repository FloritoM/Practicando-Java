package com.mycompany.proyecto_bar;
import java.util.*;
/**
 Aca va los totales, la suma hasta el momento, acceso al menu
 */
public class Pedido {
    
    Scanner sc = new Scanner(System.in);
    
    Menu hamburguesa1 = new Menu("Hamburguesa con queso", 100);
    Menu hamburguesa2 = new Menu("Hamburguesa sin queso", 80);
    Menu hamburguesa3 = new Menu("Hamburguesa completa", 250);
    Menu sandwich1 = new Menu("Sandwich de milanesa completo", 250);
    Menu sandwich2 = new Menu("Sandwich de milanesa de pollo", 200);
    Menu sandwich3 = new Menu("Sandwich de milanesa de carne", 200);
    
    
    // <Menu> porque tiene elementos tipo Menu (de la clase Menu)
    List <Menu> listaPedido = new ArrayList<Menu>(); 
     
    public void hamburguesas(){
        System.out.println("Ingresá la opción deseada --> ");
        System.out.println("(1) - Hamburguesa con queso - $100");
        System.out.println("(2) - Hamburguesa sin queso - $80");
        System.out.println("(3) - Hamburguesa completa (lechuga, tomate, jamón) - $250");
        System.out.println("(4) - Salir al menú principal");
        System.out.println("");
        
        int x = 1;
        do {
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch(opcion){
                    case 1: 
                        System.out.println("Agregaste al pedido --> hamburguesa con queso");
                        listaPedido.add(hamburguesa1);
                        break;
                    case 2:
                        System.out.println("Agregaste al pedido --> hamburguesa sin queso");
                        listaPedido.add(hamburguesa2);
                        break;
                    case 3:
                        System.out.println("Agregaste al pedido --> hamburguesa completa");
                        listaPedido.add(hamburguesa3);
                        break;
                    case 4:
                        x = 2;
                        break;
                    default:
                        System.out.println("!!! OPCION INVÁLIDA !!!");
                        break;
            }
        }while (x==1) ;
        
    }  
      
    public void sandwiches(){
        System.out.println("Ingresá la opción deseada --> ");
        System.out.println("(1) - Sandwich de milanesa completo - $250");
        System.out.println("(2) - Sandwich de milanesa de pollo - $200");
        System.out.println("(3) - Sandwich de milanesa de carne - $200");
        System.out.println("(4) - Salir al menú principal");
        System.out.println("");
        
        int x = 1;
        do {
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();

            switch(opcion){
                    case 1: 
                        System.out.println("Agregaste al pedido --> Sandwich de milanesa completo");
                        listaPedido.add(sandwich1);
                        break;
                    case 2:
                        System.out.println("Agregaste al pedido --> Sandwich de milanesa de pollo");
                        listaPedido.add(sandwich2);
                        break;
                    case 3:
                        System.out.println("Agregaste al pedido --> Sandwich de milanesa de carne");
                        listaPedido.add(sandwich3);
                        break;
                    case 4:
                        x = 2;
                        break;
                    default:
                        System.out.println("!!! OPCION INVÁLIDA !!!");
                        break;
                }
            } while(x==1);
    }   
    
    
    public void listaPedido(){
        //System.out.println(" ~~~ El pedido hasta el momento es: \n" + listaPedido);
        for(Menu m: listaPedido) {
             System.out.println(m);
         }
    }
    
    public void totalPedido(){ 
        double total = 0;
        for(Menu m: listaPedido) {
             total = total + m.getPrecio();
         }
        System.out.println("Subtotal hasta el momento: $" + total);
    }
    
    
    
    
}
