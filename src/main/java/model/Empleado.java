/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author davidespinal
 */
public class Empleado extends Persona {

    private double salarioBase;
    private double bono;
    public static int contadorEmpleado = 0; //Sera el miembro estatico que nos ayudara a contar las instancias globales creadas

    public Empleado(String id, String nombre, Direccion direccion, double salarioBase, double bono) {
        super(id, nombre, direccion);//llamada al constructor padre
        this.salarioBase = salarioBase;
        this.bono = bono;
        contadorEmpleado++;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
