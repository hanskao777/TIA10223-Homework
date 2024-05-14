package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P1_SampleRead {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("C:\\TIA102_Workspace\\TIA10223-Homework\\src\\hw7\\sample.txt");
			BufferedReader br = new BufferedReader(fr);
		}catch(IOException e) {
			System.out.println("格式錯誤");
		}
		System.out.printf("Sample.txt檔案共有%d個位元組，yyy個字元，zzz列資料");
	}
}
