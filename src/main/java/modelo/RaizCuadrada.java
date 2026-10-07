/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class RaizCuadrada extends OperacionBase {
    public RaizCuadrada(double num1) { super(num1, 0); }
    
    @Override
    public double calcular() {
        return Math.sqrt(this.num1);
    }
}