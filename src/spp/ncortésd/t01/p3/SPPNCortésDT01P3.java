/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortésd.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortésDT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Distancia entre dos puntos a partir de las coordenas x,y");
        // Declarar Variables
        double X1, X2, Y1, Y2, D, ResX, ResY;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce X1");
        X1= kb.nextDouble();
        System.out.println("Introduce Y1");
        Y1= kb.nextDouble();
        System.out.println("Introduce X2");
        X2= kb.nextDouble();
        System.out.println("Introduce Y2");
        Y2= kb.nextDouble();
        
        //Ejecutar operación
        ResX=X1-X2;
        ResY=Y1-Y2;
                
        D= Math.sqrt(Math.pow(ResX,2)+ Math.pow(ResY,2));
        
        //Mostrar resultado
        
        System.out.println("Distancia entre puntos =" + D);
        
        
    }
    
}
