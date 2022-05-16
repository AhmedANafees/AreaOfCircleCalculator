import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class AreaOfACircleCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("What is the radius(cm)?");
       double radius = input.nextDouble();
       double area = areaCircle(radius);
       System.out.println("The radius if the circle is " + area + "cm2" );
    }
    
    public static double areaCircle(double radius) {
        double area = Math.PI*radius*radius;
        return area;
    }    
}
