/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Division extends OperacionBase {
    public Division(double num1, double num2) { super(num1, num2); }
    
    @Override
    public double calcular() {
        if (this.num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return this.num1 / this.num2;
    }
}