import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Enter length of rectangle (positive integer): ");
            double lengthRect = scnr.nextDouble();
        System.out.println("Enter width of rectangle (positive integer): ");
            double widthRect = scnr.nextDouble();
        System.out.println("Now enter the radius of the circle (positive integer): ");
            double radiusCir = scnr.nextDouble();
        System.out.println("Enter side A of triangle (positive integer): ");
            double sideA = scnr.nextDouble();
        System.out.println("Enter side B of triangle (positive integer): ");
            double sideB = scnr.nextDouble();
        System.out.println("Enter side C of triangle (positive integer): ");
            double sideC = scnr.nextDouble();


        //Perform calculations and then output to screen
        double areaRect = (lengthRect * widthRect);
            System.out.println("Area of rectangle: " + areaRect);
        double areaCir = (3.14 * (radiusCir * radiusCir));
            System.out.println("Area of circle: " + (int)(areaCir * 100) / 100.0);
        double perimRect = (2 * lengthRect) + (2 * widthRect);
            System.out.println("Perimeter of rectangle: " + perimRect);
        double circumCir = 2 * 3.14 * radiusCir;
            System.out.println("Circumference of circle: " + (int)(circumCir * 100)/ 100.0);
        double varS = ((sideA + sideB + sideC) / 2);
        double areaTri = Math.sqrt(varS * (varS - sideA) * (varS - sideB) * (varS - sideC));
            System.out.println("Area of triangle: " + areaTri);
        double perimTri = (sideA + sideB + sideC);
            System.out.println("Perimeter of triangle: " + perimTri);


        //Prompt user for input
        System.out.println("Enter the radius of the sphere: ");
            double radiusSph = scnr.nextDouble();
        System.out.println("Enter the diameter of the rectangular prism: ");
            double diamPrism = scnr.nextDouble();
        System.out.println("Enter the height of the rectangular prism: ");
            double heightPrism = scnr.nextDouble();
        System.out.println("Enter the width of the rectangular prism: ");
            double widthPrism = scnr.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
            double heightCyl = scnr.nextDouble();
        System.out.println("Enter the radius of the cylinder: ");
            double radiusCyl = scnr.nextDouble();


        //Output calculations
        double surfSph = 4 * 3.14 * (radiusSph * radiusSph);
            System.out.println("The surface area of the sphere is: " + (int)(surfSph * 100) / 100.0);
        double volSph = 4 * 3.14 * (radiusSph * radiusSph * radiusSph) / 3;
            System.out.println("The volume of the sphere is: " + volSph);
        double surfPrism =  2 * ((heightPrism * diamPrism) + (heightPrism * widthPrism) + (diamPrism * widthPrism));
            System.out.println("The surface area of the rectangular prism is: " + surfPrism);
        double volPrism = heightPrism * widthPrism * diamPrism;
            System.out.println("The volume of the rectangular prism is: " + volPrism);
        double surfCyl = (2 * 3.14 * heightCyl * radiusCyl) + (2 * 3.14 * radiusCyl * radiusCyl);
            System.out.println("The surface area of the cylinder is: " + surfCyl);
        double volCyl = 3.14 * (radiusCyl * radiusCyl) * heightCyl;
            System.out.println("The volume of the cylinder is: " + (int)(volCyl * 100) / 100.0);
    }
}