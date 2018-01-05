package boxenvios1;


public class ColaPaq <Dato> {
    
    private Nodo<Dato> primero;
    
    
    public void colaVacia(){
        primero = null;
    }
    
    public boolean estaVacia(){
        
        return primero==null;
        
    }
    
    public void encolarPaq(Dato dato){
        
        Nodo <Dato> nuevo = new Nodo<>(dato);
        
        if (!estaVacia()) {
            nuevo.setSiguiente(primero);
        } 
        
        primero = nuevo;
        
    }
    
    public void quitarPrimero(){
        
        Nodo<Dato> aux;
        
        if (!estaVacia()){
            
            aux=primero;
            primero = primero.getSiguiente();
            aux=null; 
        }
    }
    
    public void quitarUltimo(){
        
        Nodo <Dato> aux;
        aux = primero;
        
        if(aux.getSiguiente()==null)
            colaVacia();
        
        if(!estaVacia()){
            aux=primero;
            
            while(aux.getSiguiente().getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            
            aux.setSiguiente(null);
        }
    }
    
    public Dato eliminarpaq(){
        
        Dato elemento = recorrerCola();
        
        if (elemento!=null)
            quitarUltimo();
        return elemento;
    }
    
    public Dato recorrerCola(){
        
        Dato elemento = null;
        Nodo <Dato> aux;
        
        if(!estaVacia()){
            aux=primero;
            
            while(aux.getSiguiente()!=null){
                aux= aux.getSiguiente();
            }
            
            elemento= aux.getDato();
        }
        return elemento;
    }
    
    public Dato devolverPrimero(){
        
        Dato d = null;
        
        if(!estaVacia()){
            
            d= primero.getDato();
        }
        return d;
    }
    
    public int cantidadElementos(){
        
        Nodo <Dato> aux;
        int numelementos = 0;
        aux=primero;
        
        while (aux!=null){
            numelementos++;
            aux = aux.getSiguiente();
        }
        return numelementos;
    }
    
    public Dato devolverDato(int pos){
        Nodo<Dato> aux=primero;
        int cont=0;
        Dato dato=null;
         
        if(pos<0 || pos>=cantidadElementos()){
            System.out.println("La posición insertada no es correcta");
            
        }else{

            while(aux!=null){
                if (pos == cont){
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                cont++;
            }
        }
         
        return dato;
    }
    
    public Nodo<Dato> devolverNodo(int pos){
        Nodo<Dato> aux=primero;
        int cont=0;
         
        if(pos<0 || pos>=cantidadElementos()){
            System.out.println("La posición insertada no es correcta");
        }else{
            while(aux!=null){
                
                if (pos == cont){
                    return aux; 
                }
                aux=aux.getSiguiente();
                cont++;
            }
        }
         
        return aux;
    }
    
    public void modificarDato(int pos, Dato dato){
        
        Nodo<Dato> aux;
        aux=primero;
        int cont=0;
         
        if(pos<0 || pos>=cantidadElementos()){
            System.out.println("La posición insertada no es correcta");
        }else{

            while(aux!=null){
                if (pos == cont){
                    aux.setDato(dato); 
                }
                cont++;
                aux=aux.getSiguiente();
            }
        }
    }
    
    public void borrarPosicion(int pos){
        
        Nodo<Dato> aux=primero;
        Nodo<Dato> anterior=null;
        int contador=0;
 
        if(pos<0 || pos>=cantidadElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
            while(aux!=null){
                if (pos == contador){
                    if (anterior==null){
                        primero = primero.getSiguiente();
                    }else {
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
        }
    }
    
    
    public Dato devolverYBorrarPrimero(){
        
        Dato dato=devolverPrimero();
        quitarPrimero();
        return dato;
    }
    
    public int posicionDeDato(Dato d, int pos){
        
        Nodo<Dato> aux;
       if (estaVacia()){
            return -1;
       }else{
           int contador=pos;
           boolean encontrado=false;
            
           aux=devolverNodo(pos);

            while(aux!=null && !encontrado){
               if(d.equals(aux.getDato())){
                   encontrado=true;
               }else{
                    contador++;
                    aux=aux.getSiguiente();
               }
            }
            if(encontrado){
                return contador;
            }else{
                return -1;
            }
       }
    }
    
    public boolean datoExiste(Dato d){
        
        boolean existe=false;
        Nodo<Dato> aux=primero;
 
        while(aux!=null && !existe){
 
            if(aux.getDato().equals(d)){
                existe=true;
            }
            aux=aux.getSiguiente();
        }
 
        return existe;
    }
    
    public void mostrar(){
        System.out.println("Contenido de la cola:");
        System.out.println("----------------------");
         
        Nodo<Dato> aux=primero;
         
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getSiguiente();
        }
    }
    
    @Override
    public String toString(){
         
        String contenido="";
        Nodo<Dato> aux=primero;
         
        while(aux!=null){
            contenido+=aux.getDato()+"\n";
            aux=aux.getSiguiente();
        }
         
        return contenido;
    }
    



    
    
}
