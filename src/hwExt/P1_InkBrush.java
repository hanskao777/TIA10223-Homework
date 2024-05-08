package hwExt;

public class P1_InkBrush extends P1_Pen {
	@Override
	public int getPrice() {
		System.out.println("毛筆的售價為："+(int)(0.9*super.getPrice()));
		return (int)(0.9*super.getPrice());
	}
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	
	public P1_InkBrush(String brand,int price) {
		super(brand, price);
	}
}
