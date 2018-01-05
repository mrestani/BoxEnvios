
package boxenvios1;

import javax.swing.JOptionPane;


public class Tarifas {
    
    private double km;
    private static double preciomanejo= 500.00;//Precio para manejo del paquete
    private double peso;
    private final double iva= 0.13;

    public Tarifas(double km, double peso) {
        this.km = km;
        this.peso = peso;
    }
    
    public void TarifaDistancia(){
        double precio=0;
        
        String m1= JOptionPane.showInputDialog("Ingrese los Km del destino:");
        km = Double.parseDouble(m1);
        
        if(km==5){
            
            precio = (preciomanejo*iva);
            
            
        } else if(km>=6 && km<=30){
            
            precio = (preciomanejo+(km*500))*iva;
            
        } else if(km>=30){
            
            precio = (preciomanejo+(km*700))*iva;
        }
        
        
        System.out.println("Total distancia: $" + precio);
    }
    
    public void TarifaPeso(){
        
        double total=0;
        
        String m2 = JOptionPane.showInputDialog("Ingrese el peso del paquete");
        peso = Double.parseDouble(m2);
        
        if(peso==5){
            total = (preciomanejo*iva);
        } else if(peso<=6 && peso>=10){
            
            total = (preciomanejo+1000)*iva;
        } else if(peso>10){
            total = (preciomanejo+3000)*iva;
        }
        
        System.out.println("El total por peso es: $" + peso);
    }
}
