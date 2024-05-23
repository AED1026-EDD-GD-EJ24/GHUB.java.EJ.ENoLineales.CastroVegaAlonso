package interfase;



public class Util {
    public static <T> void ordenar(T[] arr, Criterio<T> cr){
        boolean ordenado = false;
        while(!ordenado){
            ordenado = true;
            for (int i = 0; i < arr.length-1; i++) {
                //Ahora la decición sobre quién ordena a quién
                //lo toma la clase criterio
                if (cr.comparar(arr[i], arr[i+1])<0) {
                    T aux = (T)arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;
                }
            }
        }
        
    }
     public static <T> void imprimir(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}