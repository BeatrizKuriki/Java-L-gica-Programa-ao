package entities;

public class Rectangle {
	public double width;
	public double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double diagonal() {
		double result = (width * width) + (height * height);
		return Math.sqrt(result);

	}

	public double perimeter() {
		return (2 * width) + (2 * height);
	}

	public String toString() {
		return "AREA: " + String.format("%.2f", area()) + " PERÍMETRO: " + String.format("%.2f", perimeter())
				+ " DIAGONAL: " + String.format("%.2f", diagonal());

	}

}
