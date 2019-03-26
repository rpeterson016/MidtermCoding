package pkgShape;

public class Rectangle extends Shape {
	private int iLength;
	private int iWidth;
	
	public Rectangle(int length, int width) {
		super();
		iLength = length;
		iWidth = width; 
		{
		if (length <= 0 || width <= 0 ) {
			 throw new IllegalArgumentException("side length must be positive"); } 
		}
	}
		
		public int getLength() {
			return iLength;
		}
		public int getWidth() {
			return iWidth;
		}
		public void setLength(int length) {
			iLength = length;
		}
		public void setWidth(int width) {
			iWidth = width;
		}
	@Override
	public double area() {
		return this.iLength * this.iWidth;
	}

	@Override
	public double perimeter() {
		return 2*(this.iLength + this.iWidth);
	}
	
	public int compareTo(Object rec) {
		return (int) (this.area() - ((Rectangle) rec).area());

		
		
	}
}



