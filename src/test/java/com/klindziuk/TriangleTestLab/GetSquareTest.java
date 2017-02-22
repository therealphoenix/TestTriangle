package com.klindziuk.TriangleTestLab;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class GetSquareTest {
  @Test
  public  void getSquare_Test_Valid() {
	  Triangle triangle = new Triangle(2,3,4);
	   double square = 3;
	   Assert.assertEquals(square, Math.ceil(triangle.getSquare()));
	    }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public  void getSquare_Test_Null() {
	  Triangle triangle = new Triangle(0,3,4);
	   double square = 0;
	   Assert.assertEquals(square,triangle.getSquare());
	    }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public  void getSquare_Test_NaN() {
	  Triangle triangle = new Triangle(Double.NaN,3,4);
	   double square = Double.NaN;
	   Assert.assertEquals(square, triangle.getSquare());
	    }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public  void getSquare_Test_PositiveInfinity() {
	  Triangle triangle = new Triangle(Double.POSITIVE_INFINITY,3,4);
	   double square = Double.NaN;
	   Assert.assertEquals(square, triangle.getSquare());
	    }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public  void getSquare_Test_NegativeInfinity() {
	  Triangle triangle = new Triangle(Double.NEGATIVE_INFINITY,3,4);
	   double square = Double.NaN;
	   Assert.assertEquals(square, triangle.getSquare());
	    }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public  void getSquare_Test_NegativeNumber() {
	  Triangle triangle = new Triangle(-1,3,4);
	   double square = Double.NaN;
	   Assert.assertEquals(square, triangle.getSquare());
	    }
  
  
}
