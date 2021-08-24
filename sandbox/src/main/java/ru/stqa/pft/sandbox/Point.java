package ru.stqa.pft.sandbox;

public class Point {
  public double ax;
  public double ay;
  public double bx;
  public double by;
  public double powerOf2;
  public double AC;
  public double BC;

  public Point (double ax, double ay, double bx, double by, double powerOf2) {
    this.ax = ax;
    this.ay = ay;
    this.bx = bx;
    this.by = by;
    this.powerOf2 = powerOf2;
    this.AC = bx - ax;
    this.BC = by - ay;
  }

  public double pointDistance() {
    return Math.sqrt((Math.pow(this.AC, this.powerOf2)) + (Math.pow(this.BC, this.powerOf2)));
  }

}
