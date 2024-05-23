package interfase;
public class DemoComparable{
    public static void main(String[] args) {
        /* 
        Persona p1 = new Persona(1, "ana");
        Persona p2 = new Persona(2,"bertha");
        if(p1.compareTo(p2)>0)
           System.out.println(p1.getNombre()+" es mayor que "+p2.getNombre());
        else
        System.out.println(p1.getNombre()+" No es mayor que "+p2.getNombre());
        */
        CriterioPersonaId cpId =new CriterioPersonaId();
        Persona p1 = new Persona(2, "ana");
        Persona p2 = new Persona(1,"bertha");
        if (cpId.comparar(p1,p2)>0)
           System.out.println(p1+" es mayor que "+p2);
        else
           System.out.println(p1+" No es mayor que "+p2);

        CriterioPersonaNombre cpNom = new CriterioPersonaNombre();
        if (cpNom.comparar(p1,p2)>0)
           System.out.println(p1+" es mayor que "+p2);
        else
           System.out.println(p1+" No es mayor que "+p2);

        



        
        
    }
}