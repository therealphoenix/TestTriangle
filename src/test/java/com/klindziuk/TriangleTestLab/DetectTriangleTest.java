package com.klindziuk.TriangleTestLab;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DetectTriangleTest {
	
  @Test
  public void detectTriangle_Equilateral_Test() {
	  Triangle triangle = new Triangle(7,7,7);
	  Assert.assertEquals(triangle.TR_EQUILATERAL,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_ISOSCELES_1stSIDE_Test() {
	  Triangle triangle = new Triangle(2,7,7);
	  Assert.assertEquals(triangle.TR_ISOSCELES,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_ISOSCELES_2ndSIDE_Test() {
	  Triangle triangle = new Triangle(7,2,7);
	  Assert.assertEquals(triangle.TR_ISOSCELES,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_ISOSCELES_3rdSIDE_Test() {
	  Triangle triangle = new Triangle(7,7,2);
	  Assert.assertEquals(triangle.TR_ISOSCELES,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_ORDYNARY_Test() {
	  Triangle triangle = new Triangle(2,3,4);
	  Assert.assertEquals(triangle.TR_ORDYNARY,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_RECTANGULAR_1_Test() {
	  Triangle triangle = new Triangle(6,8,10);
	  Assert.assertEquals(triangle.TR_RECTANGULAR,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_RECTANGULAR_2_Test() {
	  Triangle triangle = new Triangle(8,6,10);
	  Assert.assertEquals(triangle.TR_RECTANGULAR,triangle.detectTriangle());
  }
  @Test
  public void detectTriangle_RECTANGULAR_3_Test() {
	  Triangle triangle = new Triangle(10,6,8);
	  Assert.assertEquals(triangle.TR_RECTANGULAR,triangle.detectTriangle());
  }
  
  // we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_NaN_ValidSides()
  {
	  Triangle triangle = new Triangle(Double.NaN,3,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_ValidSide_NaN_ValidSide()
  {
	  Triangle triangle = new Triangle(3,Double.NaN,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_ValidSides_NaN()
  {
	  Triangle triangle = new Triangle(3,4,Double.NaN);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_PositiveInfinity_ValidSides()
  {
	  Triangle triangle = new Triangle(Double.POSITIVE_INFINITY,4,6);
	  Assert.assertEquals(0,triangle.detectTriangle());
	// we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  }
  @Test
  public void detectTriangle__Test_ValidSide_PositiveInfinity_ValidSide()
  {
	  Triangle triangle = new Triangle(2,Double.POSITIVE_INFINITY,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_ValidSides_PositiveInfinity()
  {
	  Triangle triangle = new Triangle(2,3,Double.POSITIVE_INFINITY);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_NegativeInfinity_ValidSides()
  {
	  Triangle triangle = new Triangle(Double.NEGATIVE_INFINITY,4,6);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_ValidSide_NegativeInfinity_ValidSide()
  {
	  Triangle triangle = new Triangle(2,Double.NEGATIVE_INFINITY,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
//we dont have constant in code for "not a triangle" so i decide to choose 0.May be the add it after refactor.
  @Test
  public void detectTriangle_Test_ValidSides_NegativeInfinity()
  {
	  Triangle triangle = new Triangle(2,3,Double.NEGATIVE_INFINITY);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
  @Test
  public void detectTriagle_Test_NegativeSide_ValidSides()
  {
	  Triangle triangle = new Triangle(-1,3,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
  @Test
  public void detectTriagle_Test_ValidSide_NegativeSide_ValidSide()
  {
	  Triangle triangle = new Triangle(2,-3,4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }
  @Test
  public void detectTriagle_Test_ValidSides_NegativeSide()
  {
	  Triangle triangle = new Triangle(2,3,-4);
	  Assert.assertEquals(0,triangle.detectTriangle());
  }


} 
