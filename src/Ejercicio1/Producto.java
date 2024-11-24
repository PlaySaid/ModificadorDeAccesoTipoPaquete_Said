package Ejercicio1;

public class Producto {
    
    //Aqui todas tienen el acceso default//
    String nombre;
    double precio;
    int stock;
    
    Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    
    //Este tambien es de acceso default//
    void mostrarInfo(){
        System.out.println("Nombre de producto: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Stock: "+stock);
    }
}
