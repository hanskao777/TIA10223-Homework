package hw4;

public class Practice3 {
	public static void main(String[] args) {
		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;// 記數有多少個母音

		for (int i = 0; i < s.length; i++) {
			for (int index = 0; index < s[i].length(); index++) {
				if (s[i].charAt(index) == 'a' || s[i].charAt(index) == 'e' || s[i].charAt(index) == 'i'
						|| s[i].charAt(index) == 'o' || s[i].charAt(index) == 'u') {
					count++;
				}
			}
		}
		System.out.print("此陣列裡面共有" + count + "個母音");
	}

}
