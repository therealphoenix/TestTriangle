package com.klindziuk.TriangleTestLab;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ConstructorTest {
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  @Test
  public void constructor_Test_Valid_Sides()
  {
	  Triangle triangle = new Triangle(2,3,4);
	  Assert.assertTrue(null != triangle);
  }
  //we can suppose that maximum quantity of digits in size of side is 5(usually we should ask or look in spec
  @Test
  public void constructor_Test_Valid_Sides_Minimum()
  {
	  Triangle triangle = new Triangle(0.0001,0.0001,0.0001);
	  Assert.assertTrue(null != triangle);
  }
  
//we can suppose that maximum quantity of digits in size of side is 5(usually we should ask or look in spec
  @Test
  public void constructor_Test_Valid_Sides_Maximum()
  {
	  Triangle triangle = new Triangle(99999,99999,99999);
	  Assert.assertTrue(null != triangle);
  }
  //we want to recive message with size of max quantity digit in side
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_MAX_ValidSides()
  {
	  Triangle triangle = new Triangle(4,6,Double.MAX_VALUE);
	  Assert.assertTrue(null != triangle);
  }
//we want to recive message with number of max quantity digit in side
  @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructor_Test_ValidSide_MAX_ValidSide()
  {
	  Triangle triangle = new Triangle(4,Double.MAX_VALUE,6);
	  Assert.assertTrue(null != triangle);
  }
//we want to recive message with number of max quantity digit in side
  @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructor_Test_ValidSides_MAX()
  {
	  Triangle triangle = new Triangle(4,6,Double.MAX_VALUE);
	  Assert.assertTrue(null != triangle);
  }
      
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_Zero_ValidSides()
  {
	  Triangle triangle = new Triangle(0,3,4);
	  Assert.assertTrue(null != triangle);
  }
  
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSide_Zero_ValidSide()
  {
	  Triangle triangle = new Triangle(3,0,4);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_NegativeSide_Valid_Side()
  {
	  Triangle triangle = new Triangle(-1,3,4);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSide_NegativeSide_ValidSide()
  {
	  Triangle triangle = new Triangle(3,-3,4);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_NaN_ValidSides()
  {
	  Triangle triangle = new Triangle(Double.NaN,3,4);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSide_NaN_ValidSide()
  {
	  Triangle triangle = new Triangle(3,Double.NaN,4);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSides_NaN()
  {
	  Triangle triangle = new Triangle(3,4,Double.NaN);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_PositiveInfinity_ValidSides()
  {
	  Triangle triangle = new Triangle(Double.POSITIVE_INFINITY,4,6);
	  Assert.assertTrue(null == triangle);
  }
  
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSide_PositiveInfinity_ValidSide()
  {
	  Triangle triangle = new Triangle(5,Double.POSITIVE_INFINITY,6);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSides_PositiveInfinity()
  {
	  Triangle triangle = new Triangle(5,6,Double.POSITIVE_INFINITY);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSides_NegativeInfinity()
  {
	  Triangle triangle = new Triangle(Double.NEGATIVE_INFINITY,4,6);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_ValidSide_NegativeInfinity_ValidSide()
  {
	  Triangle triangle = new Triangle(5,Double.NEGATIVE_INFINITY,6);
	  Assert.assertTrue(null == triangle);
  }
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void constructor_Test_NegativeInfinity_ValidSides()
  {
	  Triangle triangle = new Triangle(5,7,Double.NEGATIVE_INFINITY);
	  Assert.assertTrue(null == triangle);
  }
  
}
