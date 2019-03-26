package pkgTestShape;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	
	@Test
	public void RectangleTest1() {
		Rectangle rec = new Rectangle(3,4);
		assertEquals(rec.getLength(),3); 
		assertEquals(rec.getWidth(),4);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void RectangleTest2() {
		Rectangle rec = new Rectangle(0,0);
		
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest3() {
		Rectangle rec = new Rectangle(3,-4);
	}

	@Test (expected = IllegalArgumentException.class)
	public void RectangleTest4() {
		Rectangle rec = new Rectangle(-3,4);
	}
	
	@Test 
	public void getLengthTest() {
		Rectangle rec = new Rectangle(3,4);
		assertEquals(rec.getLength(),3);
	}
	
	@Test
	public void getWidthTest() {
		Rectangle rec = new Rectangle(3,4);
		assertEquals(rec.getWidth(),4);
	}
		
	@Test
	public void setLengthTest() {
		Rectangle rec = new Rectangle(3,4);
		rec.setLength(2);
		assertEquals(rec.getLength(), 2);
		
	}
	@Test
	public void setWidthTest() {
		Rectangle rec = new Rectangle(3,4);
		rec.setLength(5);
		assertEquals(rec.getLength(), 5);
	}	
	

	@Test
	public void Area_Test1() {
		Rectangle rec = new Rectangle(3,4);
		assertTrue(12 == rec.area());
						
	}
	@Test
	public void Area_Test2() {
		Rectangle rec = new Rectangle(3,4);
		assertFalse(15 == rec.area());
	}
	@Test
	public void Perimeter_Test1() {
		Rectangle rec = new Rectangle(3,4);
		assertTrue(14 == rec.perimeter());

	}
	@Test
	public void Perimeter_Test2() {
		Rectangle rec = new Rectangle(3,4);
		assertFalse(20 == rec.perimeter());
	}
	
	@Test
	public void compareToTest() {
		Rectangle rec1 = new Rectangle(5, 6);
		Rectangle rec2 = new Rectangle(3, 4);
		assertTrue(rec1.compareTo(rec2) >= 1);
}
}







