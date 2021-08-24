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



//    Point point = new Point(-2.1, 4.4, -10, 30, 2); //Исходный объект для задания №2
    Point point = new Point(-5, 5, 5, 5, 2);
    System.out.println("Расстояние между точкой А и В на плоскости = " + point.pointDistance() + " единиц измерения.");
  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");
  }




}