package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance () {

    Point p = new Point(5,3,6,7,2);
      Assert.assertEquals(p.pointDistance(), 4.123105625617661);
    }



  }

