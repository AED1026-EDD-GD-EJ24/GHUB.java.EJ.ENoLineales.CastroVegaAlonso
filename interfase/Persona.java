package interfase;

//public class Persona implements Comparable<Persona> {
    public class Persona  {
    private int id;
    private String nombre;
    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Persona() {
        this(0,"");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    /* 
    @Override
    public int compareTo(Persona o) {
        if (this.nombre.compareTo(o.getNombre())<0){
            return -1;
        }else if(this.nombre.compareTo(o.getNombre())>0)
           return 1;
        else{
        return 0;
        }
    }
    */
    
    
    /* 
    @Override
    public boolean esIgual(Object q) {
        Persona obj = (Persona)q;
        //return (this.id == obj.getId());
        return (this.nombre.equals(obj.getNombre()));
    }
    @Override
    public boolean esMayor(Object q) {
        Persona obj = (Persona)q;
        //return(this.id> obj.getId());
        return (this.nombre.compareTo(obj.getNombre()) > 0);
    }
    @Override
    public boolean esMenor(Object q) {
        Persona obj = (Persona)q;
        //return(this.id<obj.getId());
        return (this.nombre.compareTo(obj.getNombre()) < 0);
    }
    */

}