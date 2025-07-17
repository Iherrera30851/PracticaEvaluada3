/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author isaacherrera
 */
public class Vector {
    //Se crean datos aleatorios 
    
     public void llenaDataAleatoria(Producto[] vector) {
       Random rnd = new Random();
       String[] tipos = {"Alimentos", "Bebidas", "Higiene", "Limpieza"};
       for (int i = 0; i < vector.length; i++) {
           String codigoSuper = "CS" + i;
           String nombreSuper = "SuperChino " + i;
           String codigoProducto = "P" + (1000 + i);
           String nombreProducto = "Producto " + i;
           String nombreEmpleado = "Empleado " + (i + 10);
           String cedulaEmpleado = "1-234-567" + i;
           int cantidad = rnd.nextInt(20) + 1;
           int precioBase = rnd.nextInt(1000) + 100;
           String tipoProducto = tipos[rnd.nextInt(tipos.length)];
           double precioBruto = calcularPrecioBruto(precioBase, tipoProducto);
           double gananciaEsperada = (precioBruto - precioBase) * cantidad;
           
           //Se crea el vector 
           
           vector[i] = new Producto(
               nombreSuper,
               codigoSuper,
               codigoProducto,
               nombreProducto,
               nombreEmpleado,
               cedulaEmpleado,
               cantidad,
               precioBase,
               tipoProducto,
               precioBruto,
               gananciaEsperada
           );
       }
   }
   public void imprimeDatos(Producto[] vector) {
       StringBuilder salida = new StringBuilder();
       salida.append("Datos Súper Chino\n");
         for (Producto vector1 : vector) {
             salida.append(vector1.toString()).append("\n");
         }
       JOptionPane.showMessageDialog(null, salida.toString());
   }
   public void imprimeGananciaTotal(Producto[] vector) {
       double total = 0;
         for (Producto vector1 : vector) {
             total += vector1.getGananciaEsperada();
         }
       JOptionPane.showMessageDialog(null, "Ganancia total esperada: ₡" + total);
   }
   //Logica para calcular el precio bruto 
   private double calcularPrecioBruto(int precioBase, String tipo) {
         return switch (tipo) {
             case "Alimentos" -> precioBase * 1.20;
             case "Bebidas" -> precioBase * 1.30;
             case "Higiene" -> precioBase * 1.25 + 500;
             case "Limpieza" -> precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
             default -> precioBase;
         };
   }

   
}

