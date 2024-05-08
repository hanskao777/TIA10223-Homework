package hw5;

public class P4_MyRectangle {
	private double width, depth;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		double area = width * depth;
		System.out.println("長方形的面積為：" + area);
		return area;
	}

	public P4_MyRectangle() {

	}

	public P4_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
