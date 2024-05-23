package interfase;


public class TestOrdenar {
    public static void main(String[] args) {
        Persona p1 = new Persona(20,"ana");
        Persona p2 = new Persona(80, "beto");
        Persona p3 = new Persona(30, "carla");
        Persona p4 = new Persona(40, "daniela");
        Persona p5 = new Persona(70, "ernesto");
        Persona p6 = new Persona(60, "felipe");
        Persona p7 = new Persona(5, "zulema");
       
       
        Persona[] personas = {p1,p2,p3,p4,p5,p6,p7};
        
       

        //definimos, ordenamos y mostramos
        Persona arr[]={new Persona(20,"ana"),
                       new Persona(80, "beto"),
                       new Persona(30, "carla"),
                       new Persona(40, "daniela"),new 
                       Persona(70, "ernesto"),new 
                       Persona(60, "felipe"),new 
                       Persona(5, "zulema")
                    };
        //por el criterio de id
        Util.ordenar(arr,new CriterioPersonaId());
        System.out.println("Ordenadas por ID");
        Util.imprimir(arr);

        //por el criterio de nombre
        Util.ordenar(arr,new CriterioPersonaNombre());
        System.out.println("Ordenadas por Nombre");
        Util.imprimir(arr);
     }
     private static void muestraArray(Comparable<?> arr[]){
        for (int i=0; i<arr.length; i++){ 
            System.out.println(arr[i]);
        }
    }

    
}