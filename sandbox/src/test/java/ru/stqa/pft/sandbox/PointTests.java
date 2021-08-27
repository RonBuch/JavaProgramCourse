package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void smoke(){
    Point p1 = new Point(5,5);
    Point p2 = new Point(-4,3);
    Assert.assertEquals(p1.distance(p2), 9.219544457292887);
  }

  @Test
  public void positive (){
    Point p1 = new Point(50,50);
    Point p2 = new Point(50,50);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }


//  @Test
//  public void testDistance() {
//
//    Point p = new Point(5, 3, 6, 7, 2);
//    Assert.assertEquals(p.pointDistance(), 4.123105625617661);
//  }
//
//  @Test
//  public void testDistanceIsZero() {
//    Point p = new Point(5, 5, 5, 5, 2);
//    Assert.assertEquals(p.pointDistance(), 0.0);
//
//  }
//  @Test
//  public void testNegative () {
//    Point p = new Point(5,5,5,55,2);
//    Assert.assertFalse(p.pointDistance()==0);
//  }
//

}

