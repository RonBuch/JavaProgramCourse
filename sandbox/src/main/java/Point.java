

public class Point {
  // point A (xa, ya), point B (xb, yb)

  double xa = -2.1;
  double xb = 4.4;
  double ya = -10;
  double yb = 30;
  double AC = xb - xa;
  double BC = yb - ya;
  int powerOf2 = 2;

  double result2 = Math.sqrt((Math.pow(AC, powerOf2)) + (Math.pow(BC, powerOf2)));
  


 System.out.println("Расстояние между точкой А и В на плоскости = " + result + " единиц измерения.");
 System.out.println("Terminate this program.");

 System.out.println("Расстояние между точкой А и В на плоскости = " + result2 + " единиц измерения.");
 System.out.println("Terminate this program.");


  double result = Math.sqrt((AC * AC) + (BC * BC));
}
