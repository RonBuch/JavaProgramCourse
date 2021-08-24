package ru.stqa.pft.sandbox;

import java.nio.channels.Pipe;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Mike");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle rectangle = new Rectangle(10, 20);
    System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " = " + area(rectangle));

    Point point = new Point(-2.1, 4.4, -10, 30, 2);
    System.out.println("Расстояние между точкой А и В на плоскости = " + pointDistance(point) + " единиц измерения.");
  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;

  }

  public static double area(Rectangle rectangle) {
    return rectangle.a * rectangle.b;
  }

  public static double pointDistance(Point point) {
    return Math.sqrt((Math.pow(point.AC, point.powerOf2)) + (Math.pow(point.BC, point.powerOf2)));
  }

}