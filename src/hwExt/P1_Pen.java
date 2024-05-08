package hwExt;

public abstract class P1_Pen {
	private String brand;
	private int price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return this.brand;
	}

	public int getPrice() {
		return this.price;
	}

	public P1_Pen() {

	}

	public P1_Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public abstract void write();
}
