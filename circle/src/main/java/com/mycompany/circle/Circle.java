package com.mycompany.circle;

public class Circle {
    public static void main(String[] args) {
        Crcle circle = new Crcle(5);
        System.out.println("Circle - Radius: " + circle.getradious());
        System.out.println("Circle - Area: " + circle.calculateArea());
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle - Length: " + rectangle.getlength()+ ", Width: " + rectangle.getwidth());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea());
        System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle - Side1: " + triangle.getSide1() + ", Side2: " + triangle.getSide2() + ", Side3: " + triangle.getSide3());
        System.out.println("Triangle - Area: " + triangle.calculateArea());
        System.out.println("Triangle - Perimeter: " + triangle.calculatePerimeter());
    }
}