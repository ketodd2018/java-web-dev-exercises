package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("Area of the circle is " + area);
        input.close();
    }
}
