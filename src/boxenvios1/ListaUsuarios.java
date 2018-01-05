
package boxenvios1;


public class ListaUsuarios<Dato> {
    
    private Nodo<Dato> primero;
    
    public ListaUsuarios(){
        listaVacia();
    }
    
    private void listaVacia(){
        primero = null;
    }
 
    public boolean estaVacia(){
        return primero == null;
    }
 
    
    public void insertarPrimero(Dato d){
        Nodo<Dato> nuevo = new Nodo<>(d);
 
        if (!estaVacia()){
            
            nuevo.setSiguiente(primero);
        }

        primero=nuevo;
    }
    
    public void insertarUltimo(Dato d){
 
        Nodo<Dato> aux = new Nodo<>(d);
        Nodo<Dato> rec_aux;
 
        if (estaVacia()) {
            insertarPrimero(d);
        }else {
            rec_aux = primero;
             
            //Buscamos el ultimo nodo
            while(rec_aux.getSiguiente() != null){
                rec_aux=rec_aux.getSiguiente();
            } 
            rec_aux.setSiguiente(aux);
        }
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
        
        Nodo<Dato> aux=primero;
        if(aux.getSiguiente()==null)
           listaVacia();
        if(!estaVacia()) {
            aux=primero;
            
            while(aux.getSiguiente().getSiguiente() != null){
                aux=aux.getSiguiente();
            }
             
            aux.setSiguiente(null);
        }
 
    }        
 
    
    public Dato devolverUltimo(){
        Dato elemento = null;
        Nodo<Dato> aux;
        if (!estaVacia()){
            aux = primero;
             
            //Recorremos
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            elemento = aux.getDato();
        }
        return elemento;
    }
 

    public Dato devolverPrimero(){
        Dato elemento = null;
        if (!estaVacia()){
            elemento = primero.getDato();
        }
        return  elemento;
    }
 
 
    public int cuantosElementos(){
        Nodo<Dato> aux;
        int numElementos=0;
        aux = primero;
 
        while(aux != null){
            numElementos++;
            aux = aux.getSiguiente();
        }
        return numElementos;
 
    }
     
 
    public Dato devolverDato(int pos){
        
        Nodo<Dato> aux=primero;
        int cont=0;
        Dato dato=null;
         
        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
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
         
        if(pos<0 || pos>=cuantosElementos()){
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
     

    public void introducirDato(int pos, Dato dato){
        Nodo<Dato> aux=primero;
        Nodo<Dato> auxDato=null; 
        Nodo<Dato> anterior=primero; 
         
        int contador=0;
         
        if(pos<0 || pos>cuantosElementos()){
            System.out.println("La posición insertada no es correcta");
        }else{
             
            if(pos==0){
                insertarPrimero(dato);
            }else if(pos==cuantosElementos()){
                insertarUltimo(dato);
            }else{

                while(aux!=null){
                    if (pos == contador){
                        auxDato=new Nodo<>(dato);
                        anterior.setSiguiente(auxDato);
                    }

                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSiguiente(); 
                }
            }
        }
         
    }
     
   
    public void modificarDato(int pos, Dato dato){
        
        Nodo<Dato> aux=primero;
        int cont=0;
         
        if(pos<0 || pos>=cuantosElementos()){
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
 
    public void borraPosicion(int pos){
 
        Nodo<Dato> aux=primero;
        Nodo<Dato> anterior=null;
        int contador=0;
 
        if(pos<0 || pos>=cuantosElementos()){
            System.out.println("La posición insertada no es correcta");
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
 
    public int indexOf (Dato t){
 
       Nodo<Dato> aux=primero;
       if (estaVacia()){
            return -1;
       }else{
           int contador=0;
           boolean encontrado=false;

           while(aux!=null && !encontrado){
               if(t.equals(aux.getDato())){
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
     

    public int indexOf (Dato t, int pos){
 
       Nodo<Dato> aux;
       if (estaVacia()){
            return -1;
       }else{
           int contador=pos;
           boolean encontrado=false;

           aux=devolverNodo(pos);

            while(aux!=null && !encontrado){
               if(t.equals(aux.getDato())){
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
 
 
    public boolean datoExistente(Dato t){
 
        boolean existe=false;
 
        Nodo<Dato> aux=primero;
 
        while(aux!=null && !existe){
 
            if(aux.getDato().equals(t)){
                existe=true;
            }
            aux=aux.getSiguiente();
        }
 
        return existe;
    }
     
    
    public void mostrar(){
        System.out.println("Contenido de la lista");
        System.out.println("---------------------");
         
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
