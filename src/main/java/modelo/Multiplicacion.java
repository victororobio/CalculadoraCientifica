/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Multiplicacion extends OperacionBase {
    public Multiplicacion(double num1, double num2) { super(num1, num2); }
    
    @Override
    public double calcular() {
        return this.num1 * this.num2;
    }
} 