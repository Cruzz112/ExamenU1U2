/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examennu1u2;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class ExamennU1U2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto1");
        String producto1Nombre = scanner.nextLine();
        System.out.println("Ingrese el precio original de "+ producto1Nombre);
        double producto1PrecioOriginal = scanner.nextDouble();
        
        
        System.out.println("Ingrese el nombre del producto 2");
        scanner.nextLine();
        String producto2Nombre = scanner.nextLine();
        System.out.println("Ingresse el precio original de "+ producto2Nombre);
        double producto2PrecioOriginal = scanner.nextDouble();
        
        
        System.out.println("Ingrese el nombre del producto 3  ");
        scanner.nextLine();
        String producto3Nombre = scanner.nextLine();
        System.out.println("Ingrese el precio original de"+ producto3Nombre);
        double producto3PrecioOriginal = scanner.nextDouble();
        
        double descuentoProducto1 = 0.30* producto1PrecioOriginal;
        double descuentoProducto = 0;
        double costoFinalProducto1 = producto1PrecioOriginal - descuentoProducto;
        
        double descuentoPrtoducto2 = 0.65* producto2PrecioOriginal;
        double costoFinalProducto2 = producto2PrecioOriginal - descuentoProducto;
        
                
                double descuentoProducto3 = 0.15* producto3PrecioOriginal;
                double costoFinalProducto3 = producto3PrecioOriginal - descuentoProducto;
                
        
        
        
        
    }
        
     
        
        
        
        
        
        
        
       
        
    
}

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
