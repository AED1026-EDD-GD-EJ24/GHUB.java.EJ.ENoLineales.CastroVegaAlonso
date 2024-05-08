package arbolBinarioOrdenado;

public class Estudiante implements Comparable{
    private int codigo;
    private String nombre;
    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean esIgual(Object q) {
        Estudiante obj =(Estudiante)q;
        
        return (this.codigo==obj.getCodigo());
    }
    @Override
    public boolean esMayor(Object q) {
        Estudiante obj =(Estudiante)q;
        return (this.codigo >obj.getCodigo());
    }
    @Override
    public boolean esMenor(Object q) {
        Estudiante obj =(Estudiante)q;
        return (this.codigo<obj.getCodigo());
        
    }
    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
    
    
}