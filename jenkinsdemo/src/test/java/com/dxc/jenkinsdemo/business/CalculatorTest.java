package com.dxc.jenkinsdemo.business;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
{
	Calculator calc = null;
  @Before
  public void setUp( ) throws Exception
  {
	  calc = new Calculator();
  }
  @After
  public void tearDown() throws Exception
  {
	  calc=null;
  }
  @Test
  public void testSum()
  {
	  assertEquals(30,calc.sum(19, 20));
  }
  @Test
  public void testSub()
  {
	  assertEquals(5,calc.sub(25, 20));
  }
  @Test
  public void testSqr()
  {
	  assertEquals(100,calc.square(10));
  }
  @Test
  public void testPower()
  {
	  assertEquals(125,calc.power(5, 3));
  }
  @Test
  public void testDivide()
  {
	  assertEquals(2,calc.div(10, 5));
  }
}
