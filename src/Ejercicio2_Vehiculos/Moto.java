package Ejercicio2_Vehiculos;

public class Moto extends Vehiculo{
    
    public Moto(String tipo){
        super(tipo);
        
    }
    public void motoDetalles(){
        System.out.println("---MOTO---");
        System.out.println("Tipo: "+tipo);
    }
}
