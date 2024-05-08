package hwExt;

public class Practice1 {
	public static void main(String[] args) {
		P1_Pen[] p1 = new P1_Pen[2];
		p1[0] = new P1_Pencil("百樂",50);
		p1[1] = new P1_InkBrush("飛龍",100);
		
		for(int i = 0;i<p1.length;i++) {
			p1[i].write();
			p1[i].getPrice();
		}
	}
}
