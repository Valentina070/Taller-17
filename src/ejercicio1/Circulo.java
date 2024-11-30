/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author zunig
 */
class Circulo extends Figura{
     private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
   
    @Override
    public double calcularArea(){
        return 3.1415 * radio * radio;
    }
}

