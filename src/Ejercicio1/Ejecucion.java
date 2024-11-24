package Ejercicio1;

public class Ejecucion {

    public static void main(String[] args) {
        
        Producto CocaCola = new Producto("Coca-Cola", 3000, 25);
        Producto PostobonFresa = new Producto("Postobon Fresa", 2500, 30);
        Producto Pan = new Producto("Pan de mogolla", 500, 50);
        
        CocaCola.mostrarInfo();
        System.out.println("---------------");
        PostobonFresa.mostrarInfo();
        System.out.println("---------------");
        Pan.mostrarInfo();
    }
    
}
