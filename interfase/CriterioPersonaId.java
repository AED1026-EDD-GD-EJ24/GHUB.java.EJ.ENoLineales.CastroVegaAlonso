package interfase;

public class CriterioPersonaId extends Criterio {

    @Override
    public int compara(Object a, Object b) {
        Persona p1 = (Persona) a;
        Persona p2 = (Persona) b;
        return p1.getId() - p2.getId();
    }

}