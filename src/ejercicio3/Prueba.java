/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        Transporte transporte2 = new Bicicleta();
        Transporte transporte3 = new Coche();

        transporte.moverse(); 
        transporte2.moverse(); 
        transporte3.moverse();
    }
}
