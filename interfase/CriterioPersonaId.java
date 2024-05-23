package interfase;



public class CriterioPersonaId extends Criterio<Persona>{
     public int comparar(Persona a, Persona b){
          
          if (a.getId() == b.getId())
              return 0;
          else if (a.getId() > b.getId())
              return 1;
          else
              return -1;
          
          //return a.getId()-b.getId();

     }
     
}