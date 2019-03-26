package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {
	
	@Test
	public void CuboidTest() {
		Cuboid cube = new Cuboid(3,4,5);
		assertEquals(cube.getLength(),3);
		assertEquals(cube.getWidth(),4);
		assertEquals(cube.getDepth(),5);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void CuboidTest2() {
		Cuboid cube = new Cuboid(1,2,-3);
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid cube = new Cuboid(3,4,5);
		cube.perimeter(); 
	}
	@Test
	public void getDepthTest() {
		Cuboid cube = new Cuboid(3,4,5);
		assertEquals(cube.getDepth(),5);
		
	}
	@Test
	public void setDepthTest() {
		Cuboid cube = new Cuboid(3,4,5);
		cube.setDepth(7);
		assertEquals(cube.getDepth(), 7);
	}
	@Test
	public void Area_Test() {
		Cuboid cube = new Cuboid(3,4,5);
		assertTrue(94 == cube.area());
		
	}
	@Test
	public void SortByArea() {
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
		Cuboid cube1 = new Cuboid (1,1,1);
		Cuboid cube2 = new Cuboid (1,2,3);
		Cuboid cube3 = new Cuboid (2,3,4);
		
		cubes.add(cube3);
		cubes.add(cube1);
		cubes.add(cube2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cube1);
		expected.add(cube2);
		expected.add(cube3);
		
		Collections.sort(cubes, new Cuboid.SortByArea());
		assertTrue(cubes.equals(expected));
			
		
	}
	@Test
	public void SortByVolume() {
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>(3);
		Cuboid cube1 = new Cuboid (1,1,1);
		Cuboid cube2 = new Cuboid (1,2,3);
		Cuboid cube3 = new Cuboid (2,3,4);
		
		cubes.add(cube3);
		cubes.add(cube1);
		cubes.add(cube2);
		
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>(3);
		expected.add(cube1);
		expected.add(cube2);
		expected.add(cube3);
		
		Collections.sort(cubes, new Cuboid.SortByVolume());
		assertTrue(cubes.equals(expected));
	}
	
}
