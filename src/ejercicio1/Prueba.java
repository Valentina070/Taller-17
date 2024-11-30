/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
}
}