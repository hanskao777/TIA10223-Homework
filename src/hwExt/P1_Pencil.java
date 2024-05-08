package hwExt;

public class P1_Pencil extends P1_Pen{
	@Override
	public int getPrice() {
		System.out.println("鉛筆的售價為："+(int)(0.8*super.getPrice()));
		return (int)(0.8*super.getPrice());
	}
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	
	public P1_Pencil(String brand,int price) {
		super(brand,price);
	}
}
