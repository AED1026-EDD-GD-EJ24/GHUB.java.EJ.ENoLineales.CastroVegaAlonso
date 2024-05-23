package miPrincipal;

import java.util.Scanner;
import arbolBinarioOrdenado.ArbolBinario;

import arbolBinarioOrdenado.Entero;


import arbolBinarioOrdenado.BTreePrinter;

public class AppArbolBinarioBusqueda{
    public static void menu(){
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println();
            System.out.println("********************************");
            System.out.println("       ARBOLES BINARIOS         ");
            System.out.println("********************************");
            System.out.println("1) Insertar nodo                ");
            System.out.println("2) Buscar nodo                  ");
            System.out.println("3) Eliminar nodo                ");
            System.err.println();
            System.out.println("0) SALIR                       ");
            System.out.println("Selecciona opción:");
            
            opc=consola.nextInt();
            switch(opc){
                case 1:
                    insertarNodo();
                    break;

                case 2:
                   //buscarNodo();
                   break;
                   
                
                case 3:
                   eliminarNodos();
                   break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                   System.out.println("Opcion inválida");

            }
        } while (opc != 0);
    }
    public static void insertarNodo(){
        System.out.println("**** INSERTAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(50));
            arbol.insertar(new Entero(60));
            arbol.insertar(new Entero(70));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            arbol.inorden();
            System.out.println("\n Recorrido Preorden");
            arbol.preorden();
            System.out.println("\n Recorrido Postorden");
            arbol.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            
            

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
      
       

    }
    public static void eliminarNodos(){
        System.out.println("**** ELIMINAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try{
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(40));
            arbol.insertar(new Entero(50));
            arbol.insertar(new Entero(60));
            arbol.insertar(new Entero(70));
           
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Mostrar el arbol después de la insercion");
            System.out.println("Elimina un Nodo que solamente tiene un hijo");
            System.out.println("Eliminar 1 que es una hoja");
            arbol.eliminar(new Entero(1));



            /*
            arbol.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Elimino 5 que solamente tiene hijo izquierdo");
            arbol.eliminar(new Entero(5));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            arbol.inorden();
            System.out.println("\n Recorrido Preorden");
            arbol.preorden();
            System.out.println("\n Recorrido Postorden");
            arbol.postorden();
            //Imprime el arbol depues de la eliminacion
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Elimino 30 que solamente tiene hijo derecho");
            arbol.eliminar(new Entero(30));
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("Elimina 10 que tiene hijo izquierdo y derecho");
            arbol.eliminar(new Entero(10));
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            //inserto algunos nodos
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(-5));
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            arbol.insertar(new Entero(-3));
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            arbol.eliminar(new Entero(2));
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            */
            
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
       


    }
    public static void buscarNodo(){
        System.out.println("**** BUSCAR NODOS ****");
        ArbolBinario arbol = new ArbolBinario();
        try{
           
            
            arbol.insertar(new Entero(10));
            arbol.insertar(new Entero(15));
            arbol.insertar(new Entero(30));
            arbol.insertar(new Entero(5));
            arbol.insertar(new Entero(2));
            arbol.insertar(new Entero(1));
            arbol.insertar(new Entero(40));
            System.out.println("RECORRIDO DE ARBOLES:");
            System.out.println("\n Recorrido Inorden");
            arbol.inorden();
            System.out.println("\n Recorrido Preorden");
            arbol.preorden();
            System.out.println("\n Recorrido Postorden");
            arbol.postorden();
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            BTreePrinter.printNode(arbol.getRaiz());
            System.out.println("busco el dato 5");
            System.out.println("Elemento buscado 5 "+arbol.buscar(new Entero(5)).getValor());
            System.out.println("Busco un elemento que no existe 50");
            System.out.println("Elemento buscado 50 "+arbol.buscar(new Entero(50)));


        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage()+" "+e.getStackTrace()+e.getLocalizedMessage());
        }
    }
}