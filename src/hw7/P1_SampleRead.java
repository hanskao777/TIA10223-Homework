package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P1_SampleRead {
	public static void main(String[] args) {
		File file = new File("C:\\\\TIA102_Workspace\\\\TIA10223-Homework\\\\src\\\\hw7\\\\sample.txt");
		try {
			int i;
			String j;
			int count = 0, countLine = 0;
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while ((i = br.read()) != -1) {
				if (i != 32 && i != 10)//空白跟換行的ASCII要拿掉，看個人
					count++;
			}
			br.close();
			fr.close();// 關掉重開readline才會正常執行，不然會從最後一行開始讀取空白內容

			FileReader fr2 = new FileReader(file);
			BufferedReader br2 = new BufferedReader(fr2);
			while ((j = br2.readLine()) != null) {
				countLine++;
			}
			br2.close();
			fr2.close();
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料", file.length(), count, countLine);
		} catch (IOException e) {
			System.out.println("格式錯誤");
		}
	}
}
