package ru.stqa.pft.sandbox;

import java.nio.channels.Pipe;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Mike");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(10, 20);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


    Point p1 = new Point(5,5);
    Point p2 = new Point(5,5);
    System.out.println("Расстояние между точкой А и В на плоскости = " + p1.distance(p2) + " единиц измерения.");
//    Point point = new Point(-2.1, 4.4, -10, 30, 2); //Исходный объект для задания №2
//    Point p1 = new Point(-5, 5, 5, 5, 2);
//    System.out.println("Расстояние между точкой А и В на плоскости = " + p1.pointDistance() + " единиц измерения.");
  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");
  }




}