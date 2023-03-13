/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.cap4;

import java.util.Scanner;

public class Ejercicio10Cap4 {

    public static void main(String[] args) {
        double x,y,z,w;
        String n,p;
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("Numero de inscripción: ");
        n = entrada.next();
        
        System.out.println("Nombres: ");
        p = entrada.next();
        
        System.out.println("Patrimonio: ");
        x = entrada.nextDouble();
        
        System.out.println("Estrato social: ");
        y = entrada.nextDouble();
        
        z = 50000;
        
        if (x > 2000000 && y > 3) {
            w = z +0.03*x;
            System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + n + " Y NOMBRE "+ p + " DEBE PAGAR: $"+ w);
        } else {
            System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + n + " Y NOMBRE "+ p + " DEBE PAGAR: $"+ z);
        }       
    }   
}
