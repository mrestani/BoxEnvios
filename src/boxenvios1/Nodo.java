
package boxenvios1;


public class Nodo<Dato> {
    
    private Dato dato;
    private Nodo<Dato> siguiente;
    
    public Nodo(Dato dato){
        this.dato=dato;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }
    
    public Nodo<Dato> getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo<Dato> siguiente){
        this.siguiente=siguiente;
    }


    @Override
    public String toString() {
        return   dato + "\n" ;
    }
    
    
}
