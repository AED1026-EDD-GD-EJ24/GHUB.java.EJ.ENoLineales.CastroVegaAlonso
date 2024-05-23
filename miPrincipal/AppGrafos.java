package miPrincipal;
import java.util.Scanner;
import grafos.matrizAdyacencia.Vertice;
import grafos.listaAdyacencia.GrafoAdcia;
import grafos.matrizAdyacencia.GrafoMatriz;
public class AppGrafos{
    public static void menu(){
        int opc;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("********************************");
            System.out.println("           GRAFOS               ");
            System.out.println("********************************");
            System.out.println("1) Matriz de Adyacencia         ");
            System.out.println("2) Lista de Adyacencia          ");
            System.out.println();
            System.out.println("0) SALIR                        ");
            System.out.println("********************************");
            System.out.print("Selecciona opción:");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                   matrizAdyacencia();
                   break;
                case 2:
                   listaAdyacencia();
                   break;
                case 0:
                   System.out.println("Hasta luego");
                   break;
                default:
                  System.out.println("opción inválida");
            }
        } while(opc !=0);
    }
    public static void matrizAdyacencia(){
        System.out.println("********************************");
        System.out.println("      MATRIZ ADYACENCIA         ");
        System.out.println("********************************");
        GrafoMatriz grafo = new GrafoMatriz();
        grafo.nuevoVertice("D");
        grafo.nuevoVertice("F");
        grafo.nuevoVertice("K");
        grafo.nuevoVertice("L");
        grafo.nuevoVertice("R");
        try{
            grafo.nuevoArco("D", "F");
            grafo.nuevoArco("D", "K");
            grafo.nuevoArco("F", "D");
            grafo.nuevoArco("L", "K");
            grafo.nuevoArco("L", "F");
            grafo.nuevoArco("R", "D");
            System.out.println("Adyacente D y F?"+grafo.adyacente("D","F"));
            System.out.println("Adyacente F y D?"+grafo.adyacente("F","D"));
            System.out.println("Adyacente R y F?"+grafo.adyacente("R","F"));
            }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Vertices:"+grafo.numeroDeVertices());
        System.out.println(grafo.imprimirVertices());
        System.out.println("Matriz Adyacencia:");
        System.out.println(grafo.imprimirMatriz()); 

    }
    public static void listaAdyacencia(){
        System.out.println("********************************");
        System.out.println("        LISTA ADYACENCIA        ");
        System.out.println("********************************");

        GrafoAdcia grafo = new GrafoAdcia();

        try {
            grafo.nuevoVertice("D");
            grafo.nuevoVertice("F");
            grafo.nuevoVertice("K");
            grafo.nuevoVertice("L");
            grafo.nuevoVertice("R");
            grafo.nuevoArco("D", "F");
            grafo.nuevoArco("D", "K");
            grafo.nuevoArco("F", "D");
            grafo.nuevoArco("L", "K");
            grafo.nuevoArco("L", "F");
            grafo.nuevoArco("R", "D");
            System.out.println("Vertices:");
            System.out.println(grafo.imprimirVertices());
            System.out.println("Matriz Adyacencia:");
            System.out.println(grafo.imprimirMatriz());

        } catch (Exception e) {
           //e.printStackTrace();
        }

    }
}