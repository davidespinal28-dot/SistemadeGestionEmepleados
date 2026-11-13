/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadegestionemepleados;
import controlador.EmpleadoController;
import java.util.ArrayList;
/**
 *
 * @author davidespinal
 */
public class SistemadeGestionEmepleados {

    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        
        // 1.Probar el registro de empleados
        boolean exito1 = controller.registrarEmpleado("EMP01", "David Espinal", "Tegucigalpa", "El Hatillo", 15000, 2500);
        boolean exito2 = controller.registrarEmpleado("EMP02", "Maria Lopez", "San Pedro Sula", "Barrio Guamilito", 18000, 3000);
        
        if (exito1 && exito2){
            System.out.println("!Empleados guardados correctamente en empleados.txt!");
        }
        
        // 2.Leer los datos persistidos en el archivo
        System.out.println("\n--- Lista de Empleados en Archivo ---");
        ArrayList<String> empleado = controller.listarEmpleado();
        for (String emp : empleado) {
            System.out.println(emp);
        }
    }
}
