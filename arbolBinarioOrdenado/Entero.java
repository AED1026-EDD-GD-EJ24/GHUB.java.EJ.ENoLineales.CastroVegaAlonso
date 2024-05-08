package arbolBinarioOrdenado;

public class Entero implements Comparable{
    private int dato;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Entero(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Entero [dato=" + dato + "]";
    }

    @Override
    public boolean esIgual(Object q) {
        Entero obj = (Entero)q;
        return (this.dato==obj.getDato());
        
    }

    @Override
    public boolean esMayor(Object q) {
        Entero obj = (Entero)q;
        return (this.dato>obj.getDato());
    }

    @Override
    public boolean esMenor(Object q) {
        Entero obj = (Entero)q;
        return (this.dato<obj.getDato());
    }
    
    
    
}