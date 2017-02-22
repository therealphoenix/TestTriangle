package com.klindziuk.TriangleTestLab;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class CheckTriangleTest {
	
	  //we can suppose that maximum quantity of digits in size of side is 5(usually we should ask or look in spec)
	  @Test
	  public void checkSides_Test_Valid_Sides_Minimum()
	  {
		  Triangle triangle = new Triangle(0.0001,0.0001,0.0001);
		  Assert.assertTrue(triangle.checkTriangle());
	  }
	  	  
	//we can suppose that maximum quantity of digits in size of side is 5(usually we should ask or look in spec)
	  @Test
	  public void checkSides_Test_Valid_Sides_Maximum()
	  {
		  Triangle triangle = new Triangle(99999,99999,99999);
		  Assert.assertTrue(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_1_TriangleIsLine()
	  {
		  Triangle triangle = new Triangle(2,1,1);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_2_TriangleIsLine()
	  {
		  Triangle triangle = new Triangle(1,2,1);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_3_TriangleIsLine()
	  {
		  Triangle triangle = new Triangle(1,1,2);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  
	  @Test
	  public void checkSides_Test_MAX_ValidSides()
	  {
		  Triangle triangle = new Triangle(Double.MAX_VALUE,4,5);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_MAX_ValidSide()
	  {
		  Triangle triangle = new Triangle(4,Double.MAX_VALUE,5);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSides_MAX()
	  {
		  Triangle triangle = new Triangle(4,6,Double.MAX_VALUE);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_Zero_ValidSides()
	  {
		  Triangle triangle = new Triangle(0,3,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_Zero_ValidSides()
	  {
		  Triangle triangle = new Triangle(2,0,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSides_Zero()
	  {
		  Triangle triangle = new Triangle(0,3,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  
	  @Test
	  public void checkSides_Test_NegativeSide_ValidSides()
	  {
		  Triangle triangle = new Triangle(-1,3,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_NegativeSide_ValidSide()
	  {
		  Triangle triangle = new Triangle(2,-3,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSides_NegativeSide()
	  {
		  Triangle triangle = new Triangle(2,3,-4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	
	  @Test
	  public void checkSides_Test_NaN_ValidSides()
	  {
		  Triangle triangle = new Triangle(Double.NaN,3,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_NaN_ValidSide()
	  {
		  Triangle triangle = new Triangle(3,Double.NaN,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSides_NaN()
	  {
		  Triangle triangle = new Triangle(2,3,Double.NaN);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  
	  @Test
	  public void checkSides_Test_PositiveInfinity_ValidSides()
	  {
		  Triangle triangle = new Triangle(Double.POSITIVE_INFINITY,4,6);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_PositiveInfinity_ValidSide()
	  {
		  Triangle triangle = new Triangle(2,Double.POSITIVE_INFINITY,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSides_PositiveInfinity()
	  {
		  Triangle triangle = new Triangle(2,3,Double.POSITIVE_INFINITY);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  
	  @Test
	  public void checkSides_Test_NegativeInfinity_ValidSides()
	  {
		  Triangle triangle = new Triangle(Double.NEGATIVE_INFINITY,4,6);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test_ValidSide_NegativeInfinity_ValidSide()
	  {
		  Triangle triangle = new Triangle(2,Double.NEGATIVE_INFINITY,4);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  @Test
	  public void checkSides_Test__ValidSides_NegativeInfinity()
	  {
		  Triangle triangle = new Triangle(2,3,Double.NEGATIVE_INFINITY);
		  Assert.assertFalse(triangle.checkTriangle());
	  }
	  	  
	}
