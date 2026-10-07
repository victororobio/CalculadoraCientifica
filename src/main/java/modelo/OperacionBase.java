/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class OperacionBase implements Operacion {
    protected double num1;
    protected double num2;

    public OperacionBase(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}