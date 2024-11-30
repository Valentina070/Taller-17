/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author zunig
 */
public class Rectangulo extends Figura {
     private double Base;
    private double altura;
    
    public Rectangulo(double longitud, double ancho) {
        this.Base = longitud;
        this.altura = ancho;
    }
   
    @Override
    public double calcularArea() {
        return Base * altura;
    }
    
}
