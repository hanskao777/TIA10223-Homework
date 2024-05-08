package hw5;

//驗證碼不會出現一樣的字
public class Practice5_2 {
	public static void main(String[] args) {
		Practice5_2 p5 = new Practice5_2();
		System.out.println("本次隨機產生驗證碼為：");
		p5.genAuthCode();
	}

	public String genAuthCode() {
		String s = "";
		char[] c = new char[8];
		int count = 1;
		while (count <= 8) {
			int i = (int) (Math.random() * 75) + 48;
			if ((i >= 48 & i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
				c[count - 1] = (char) i;
				for (int j = 0; j < count - 1; j++) {
					if (c[count - 1] != c[j]) {
						if (j == count - 2) {
							s += c[count - 1];
							count++;
							break;
						}
					}
				}
				if (count == 1) {
					s += c[count - 1];
					count++;
				}

			}

		}
		System.out.println(s);
		return s;
	}
}
