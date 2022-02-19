/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mafer
 */
public class Lista {
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
   
    public void agregarAlInicio(String elemento){
        inicio = new Nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
   
    public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }
    public void buscar(String elemento){
        Nodo aux = inicio;
        while(aux != null){
            
            if(aux.dato.equals(elemento)){
                System.out.print("[" + aux.dato + "]->");
            }else{
                System.out.print("No encontrado");
            }
            aux=aux.siguiente;
        }
    }
}
