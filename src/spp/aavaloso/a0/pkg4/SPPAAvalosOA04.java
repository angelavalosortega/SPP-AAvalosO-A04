/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a0.pkg4;
import java.util.Scanner;

/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int opEntrada;
     double ang, res;
     Scanner kb=new Scanner(System.in);
        System.out.println("Calcula el seno, coseno o tangente de un angulo que se encuentre entre 0 y 360 grados");
        System.out.println("Introduzca la opcion deseada");
        System.out.println("1. Calculo de seno");
        System.out.println("2. Calculo de coseno");
        System.out.println("3. Calculo de tangente");
        System.out.println("4. Salir");
        opEntrada=kb.nextInt();
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al calculo de seno");
                ang= nuevoangulo();
                res= Math.sin(ang);
                System.out.println("El seno de su angulo es= "+res);
                break;
            case 2:
                System.out.println("Bienvenido al calculo de coseno");
                ang= nuevoangulo();
                res= Math.cos(ang);
                System.out.println("El coseno de su angulo es= "+res);
                break;
            case 3:
                System.out.println("Binevenido al calculo de tangente");
                ang= nuevoangulo();
                res= Math.tan(ang);
                System.out.println("La tangente de su angulo es= "+res);
                break;
            default:
                System.out.println("¡Adios!");
                                      
                               
        }
        }
static double nuevoangulo(){
double ang;
Scanner kb=new Scanner(System.in);
    System.out.println("Introduzca el valor de su angulo. Tiene que estar entre 0 y 360");
    ang=kb.nextDouble();
    do{       
        System.out.println("Introdujo un valor equivocado");
        System.out.println("Introduzca el valor de su angulo. Tiene que estar entre 0 y 360");
        ang=kb.nextDouble();
    }while(ang<0 || ang >360);
    System.out.println("Usted introdujo un angulo de "+ang);
    return ang;
}
}