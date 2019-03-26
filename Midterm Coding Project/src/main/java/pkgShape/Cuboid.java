package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	public Cuboid(int length, int width, int depth) {
		super(length, width);
		if (depth <= 0) {
			throw new IllegalArgumentException("depth must be a positive number"); }
		iDepth = depth;

	}
	private int iDepth; 
	
	public int getDepth() {
		return iDepth;
	}
	public void setDepth(int depth) {
		iDepth = depth;
	}
	
	public double volume(){
		return super.getLength() * super.getWidth() * iDepth;
		
	}
	@Override 
	public double area() {
		return 2 * (super.getLength()* super.getWidth() + super.getLength()* iDepth + super.getWidth()*iDepth);
		
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("perimeter invalid in this context");
	}
	public int compareTo1(Object cube) {
		return (int) (this.volume() - ((Cuboid) cube).volume());
	}
		
	public int compareTo(Object cube) {
			return (int) (this.area() - ((Cuboid) cube).area());
	}
		

	public static class SortByArea implements Comparator <Cuboid> {

	@Override
	public int compare(Cuboid cube1, Cuboid cube2) {
			
			if (cube1.area() > cube2.area()) {
				return 1;
			}
			else if (cube1.area() < cube2.area()) {
				return -1;
			}
			else {
				return 0;
			}
			
		}
	}
	public static class SortByVolume implements Comparator <Cuboid> {

	@Override
	public int compare(Cuboid cube1, Cuboid cube2) {
		if (cube1.volume() > cube2.volume()) {
			return 1;
		}
		else if (cube1.volume() < cube2.volume()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	}
}