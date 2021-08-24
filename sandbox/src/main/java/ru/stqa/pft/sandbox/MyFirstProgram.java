package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Mike");

    double l = 10;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 10;
    double b = 20;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");
  }

  public static double area(double len) {
    return len * len;

  }

  public static double area(double a, double b) {
    return a * b;
  }


}