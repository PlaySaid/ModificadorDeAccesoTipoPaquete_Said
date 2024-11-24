package Ejercicio2_Vehiculos;

public class Vehiculo {
    
    String tipo;
    
    public Vehiculo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void mostrarDetalles(){
        System.out.println("Tipo: "+tipo);
    }
}
