package hw1;

public class Practice6 {
	public static void main(String[] args) {
		System.out.print("5+5=");
		System.out.println(5 + 5);// 為單純的int格式+int格式，因此5+5=10
		System.out.print("5+\'5\'=");
		System.out.println(5 + '5');
//		兩個基礎型態進行運算後會轉換成int，
//		'5'字元會轉換成unicode中5這個字元的編碼53，因此5+'5'=5+53=58
		System.out.print("5+\"5\"=");
		System.out.println(5 + "5");// 因"5"為字串，5+"5"會變為字串連結=55
	}
}
