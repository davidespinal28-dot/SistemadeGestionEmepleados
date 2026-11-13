/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import model.Empleado;
import model.Direccion;
import persistencia.ArchivoEmpleado;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author davidespinal
 */
public class EmpleadoController {
    private ArchivoEmpleado dao;

    public EmpleadoController() {
        this.dao = new ArchivoEmpleado();
    }
    public boolean registrarEmpleado(String id, String nombre, String ciudad, String calle, double salario, double bono) {
        try {
            Direccion dir = new Direccion(ciudad, calle);
            Empleado emp = new Empleado(id, nombre, dir, salario, bono);
            dao.guardarEmpleado(emp);
            return true;
        } catch (IOException e) {
            System.err.println("Error de E/S" + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<String> listarEmpleado(){
        try{
            return dao.leerEmpleado();
        } catch (IOException e){
            System.err.println("Error al leer datos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
