/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author mafer
 */
public class Print {
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    protected Nodo inicio, fin;

    public void add(){
        System.out.print("Ingresar nombre:");
        lista.agregarAlInicio(in.next());
    }   
    public void buscarelemento(){
        System.out.print("Ingresar nombre:");
        lista.buscar(in.next());
    }
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        
        
        while(!salir){
            
           System.out.println("1. Agregar 1");
           System.out.println("2. Mostrar 2");
           System.out.println("3. Buscar 3");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones:");
           opcion = in.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("-----------------Agregar-----------------");
                   add();
                   break;
               case 2:
                   System.out.println("-----------------Listar-----------------");
                   lista.mostrarLista();
                   break;
                case 3:
                   System.out.println("-----------------Buscar-----------------");
                   buscarelemento();
                   break;
                case 4:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }   
        }
    }
    public static void main(String[] args) {
        Print list = new Print();
        list.menu();
    }
}
 