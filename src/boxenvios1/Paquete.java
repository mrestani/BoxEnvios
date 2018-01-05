
package boxenvios1;


public class Paquete {
    
    private String trackingNbr;
    private String fechaIngreso;
    private int peso;
    private Casillero casillero;

    public Paquete(String trackingNbr, String fechaIngreso, Integer peso, Casillero casillero) {
        this.trackingNbr = trackingNbr;
        this.fechaIngreso = fechaIngreso;
        this.peso = peso;
        this.casillero=casillero;
    }

    
    @Override
    public String toString(){
        return String.format("Paquete numero: %s. Peso: %s. Recibido el: %s.", trackingNbr, peso,fechaIngreso);
    }

    
    public String getTrackingNbr() {
        return trackingNbr;
    }

    public void setTrackingNbr(String trackingNbr) {
        this.trackingNbr = trackingNbr;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }
}
