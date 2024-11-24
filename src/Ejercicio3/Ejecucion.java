package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        Persona chico = new Persona("Alejandro", 18);
        
        System.out.println(chico.getNombre());
        System.out.println(chico.edad);
        
        System.out.println("...");
        
        chico.setNombre("Carlos");
        System.out.println(chico.getNombre());
        System.out.println(chico.edad);
        
        System.out.println("---------------------");
        chico.mostrarDatos();
    }
    
}
