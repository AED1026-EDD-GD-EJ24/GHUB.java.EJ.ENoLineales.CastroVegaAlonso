package arbolBinarioOrdenado;
import pilas.Pila;
import colas.Cola;

public class ArbolBinario{
    private Nodo raiz;
    
    
    
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    /*
     * Método recursivo en pre-orden
     */
    private void preorden(Nodo aux){
        if(aux !=null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());

        }
    }
    public void preorden(){
        preorden(raiz); //se invoca al método recursivo
    }

    //Método recursivo inOrden
    private void inorden(Nodo aux){
        if(aux !=null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }

    public void inorden(){
        inorden(raiz);
    }

    //Método recursivo postOrden
    private void postorden(Nodo aux){
        if(aux !=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    public void postorden(){
        postorden(raiz);
    }

    //Recorrido Iterativo en Preorden, utilizando una pila
    public void preordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if(aux.getDerecho() !=null)
               pila.apilar(aux.getDerecho());
            if(aux.getIzquierdo() !=null)
               pila.apilar(aux.getIzquierdo());
        }
    }

    //Recorrido  Iterativo en InOrden, utilizando una pila
    public void inordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while(aux != null || !pila.esVacia()){
            if(aux !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }

    }

    //Recorrido Iterativo en PostOrden, utilizando una pila
    public void postordenIterativo(){
        Pila<Nodo> pila = new Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while(aux !=null){
            //avanza por la izquierda y apila los nodos
            while(aux.getIzquierdo() !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            while (aux !=null && (aux.getDerecho() == null || aux.getDerecho() == q)){
                visitar(aux);
                q = aux;
                if (pila.esVacia())
                  return;

                aux = pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
    }
    public void recorridoPorNivel(){
        Cola<Nodo> cola = new Cola<Nodo>();
        cola.encolar(raiz);
        while(!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            
            if(aux.getIzquierdo()!=null)
               cola.encolar(aux.getIzquierdo());
            if(aux.getDerecho() !=null)
               cola.encolar(aux.getDerecho());
            cola.desencolar();

        }

    }

    //Insercion de nodo, version iterativa

    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);

        if(raiz == null){
           raiz = nuevo;
           
        }

        else{
            //anterior hace una referencia al padre de aux
            Nodo anterior = null;

            // aux es un auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
           
            
            while(aux !=null){
                anterior = aux;
                if(dato.esMenor(aux.getValor()))
                      aux = aux.getIzquierdo(); 
                  
                else if(dato.esMayor(aux.getValor()))
                    aux = aux.getDerecho();
                else 
                   throw new Exception("Dato Duplicado");
                    
            }
            if(dato.esMenor(anterior.getValor()))
               anterior.setIzquierdo(nuevo);
            else
               anterior.setDerecho(nuevo);

        }

    }

    //Version recursiva de insertar
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        raiz = insertarRec(raiz, dato);
    }

    private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
        if(raizSub == null)
           //caso base, termina la recursividad
           raizSub = new Nodo(dato);
        else{
            if (dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
                raizSub.setIzquierdo(iz);

            }else{
                if(dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(),dato);
                    raizSub.setDerecho(dr);
                }
                else{
                     
                   throw new Exception("Nodo duplicado");
                }
            }
        }
        return raizSub;
    }
    //Elimina un Nodo del árbol
    public boolean eliminar(Object valor){
        Comparable dato = (Comparable)valor;
        //Buscar el nodo a eliminar
        Nodo antecesor = null;
        Nodo aux = raiz;
        while(aux != null){
            if (dato.esIgual(aux.getValor())){
                break;
            }
            antecesor = aux;
            if(dato.esMenor(aux.getValor()))
               aux = aux.getIzquierdo();
            else
               aux = aux.getDerecho();
        }
        if (aux ==null)
           return false; // dato no encontrado
        /* si llega a este punto, el nodo a eliminar existe y es
           aux y su antecesor es antecesor
         * Examinar cada caso
         * 1. si tiene menos de dos hijos, incluso una hoja
         *    reajustar los enlaces de su antecesor
         */
        if(aux.getIzquierdo()==null)
           if(aux.getValor().esMenor(antecesor.getValor()))
              antecesor.setIzquierdo(aux.getDerecho());
           else
              antecesor.setDerecho(aux.getDerecho());
        else if(aux.getDerecho()==null)
           if (aux.getValor().esMenor(antecesor.getValor()))
              antecesor.setIzquierdo(aux.getIzquierdo());
           else
              antecesor.setDerecho(aux.getIzquierdo());
        else 
           //El nodo a eliminar tiene ramas izquierda y derecha
           reemplazarPorMayorIzquierdo(aux);
        aux = null;
        return true;
    }
    private void reemplazarPorMayorIzquierdo(Nodo act){
        Nodo mayor = act;
        Nodo ant = act;
        mayor = act.getIzquierdo();
        //Buscar el mayor de la rama izquierda
        //ant es el antecesor de mayor
        while(mayor.getDerecho() != null){
            ant = mayor;
            mayor = mayor.getDerecho();
        }
        act.setValor(mayor.getValor()); //reemplazo
        //reajuste
        if(ant == act)
           ant.setIzquierdo(mayor.getIzquierdo());
        else 
           ant.setDerecho(mayor.getDerecho());

    }

    public Nodo buscar(Object valor){
        Comparable dato = (Comparable) valor;
        if (raiz == null)
           return raiz;
        else{
            //aux: auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
            while(aux != null){
                if(dato.esIgual(aux.getValor()))
                   return aux;
                if(dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else
                   aux = aux.getDerecho();
            }
            return null;
        }
    }
    public Nodo getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }
    public ArbolBinario() {
        raiz =null;
    }
    
}