package arbolBinarioOrdenado;

public class DemoComparable {
    public static void main(String[] args) {
        Persona p1 = new Persona(20, "Ana");
        Persona p2 = new Persona(10, "Beatriz");
        if(p1.esMenor(p2)){
            System.out.println(p1.getNombre()+" es Menor que "+p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" No es Menor que "+p2.getNombre());
        }
        
    }
    
}