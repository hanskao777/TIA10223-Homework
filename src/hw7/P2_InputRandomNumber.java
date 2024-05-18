package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class P2_InputRandomNumber {
	public static void main(String[] args) {
		File file = new File("C:\\TIA102_Workspace\\TIA10223-Homework\\src\\hw7\\Data.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			for (int i = 1; i <= 10; i++) {
				int num = (int) (Math.random() * 1000);
				ps.print(num + " ");
			}
			ps.close();
			bos.close();
			fos.close();

		} catch (IOException e) {
			System.out.println("格式錯誤");
		}

	}
}
