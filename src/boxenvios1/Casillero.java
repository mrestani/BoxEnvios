
package boxenvios1;


public class Casillero {
    
     private String nombre;
    private String direccionDestino;
    private Integer distancia;
    private Persona usuario;
    
    private ListaUsuarios<Paquete> paquetes;
    //falta meter arbol

    public Casillero(String nombre, String direccionDestino, Integer distancia, Persona usuario) {
        this.nombre = nombre;
        this.direccionDestino = direccionDestino;
        this.distancia = distancia;
        this.usuario = usuario;
        paquetes = new ListaUsuarios<>();
    }
    
    public String getDetalles(){
        return String.format("Nombre: %s. Direccion de destino: %s. Distancia: %s Kms.\n\n PAQUETES:\n%s", nombre,direccionDestino,distancia,paquetesToString());
    
    }
    
    public String paquetesToString(){
        
        String result = "";
        for (int i=0; i<paquetes.cuantosElementos(); i++){
            result=result+paquetes.devolverDato(i).toString()+"\n";
        }
        return result;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s. Direccion de destino: %s. Distancia: %s Kms", nombre,direccionDestino,distancia.toString());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public ListaUsuarios<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ListaUsuarios<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }
}
