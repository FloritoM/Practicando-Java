/*
 if list.length == 0 sout "ups vemos que no te llevas nada!
 */
package com.mycompany.proyecto_bar;
import java.util.Scanner;
/**
 * Aca se crea el user
 */
public class Principal extends Pedido {

    public static void main(String[] args) {

        Pedido usuario = new Pedido();
        
        System.out.println("Hola! Ingresá como querés que te llamemos a continuación: ");
        
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        
        System.out.println("~ Bienvenidx " + user + "! ~");
        
        System.out.println("--> A continuación te mostramos las opciones disponibles -->\n- Ingresá el número correspondiente a la opción deseada");
        
        boolean condicion = true;
        while(condicion == true){
            System.out.println("(1) - Ver menú de hamburguesas"); 
            System.out.println("(2) - Ver menú de sandwiches");
            System.out.println("(3) - Ver lo pedido y subtotal hasta el momento"); 
            System.out.println("(4) - Salir de la aplicación");
            
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println(" ******* HAMBURGUESAS ******* ");
                    usuario.hamburguesas();
                    break;
                case 2:
                    System.out.println(" ******* SANDWICHES ******* ");
                    usuario.sandwiches();
                    break;
                case 3:
                    System.out.println(" ******* PEDIDO ******* ");
                    usuario.listaPedido();
                    usuario.totalPedido();
                    break;
                case 4:
                    System.out.println(" --- GRACIAS POR PASAR! --- ");
                    condicion = false;
                    break;
                default:
                    System.out.println("!!! OPCION INVÁLIDA !!!");
                    break;
            }
        }
        
    }
    
}
