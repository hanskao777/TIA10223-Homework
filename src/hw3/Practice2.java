package hw3;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		System.out.println("開始猜數字吧！我不會例外處理，你不輸入0~100的正整數我就報錯給你看(#`Д´)ﾉ，請輸入數字：");
		int i = (int) (Math.random() * 100);
		int left = 0, right = 100;
		int count = 0;
		int countG0 = 0;//countGenius0，第一次就輸入0
		int countG100 = 0;//countGenius100，第一次就輸入100
		int count0=0;
		int count100=0;
//		System.out.println(i);
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num>i) {
				if(num==100&&count ==0) {
					right = 99;
					countG100++;
					count100++;
					System.out.println("懂猜哦~可惜猜錯了~正確答案在"+left+"到"+right+"之間~");
					right = 100;
				}else if(num==100&&countG100!=0){
					count100++;
					right = 99;
					System.out.println("猜一次就夠了哦，100大於99好嗎？正確答案在"+left+"到"+right+"之間(# ﾟДﾟ) ﾑｯ!");
					right = 100;
				}else if(num<right||(num==100&&count100==0)) {
					count100++;
					right = num;
					System.out.println("太大囉！正確答案在"+left+"到"+right+"之間~");
				}else {
					System.out.println("就說太大了，你是不是傻！正確答案在"+left+"到"+right+"之間啦！");
				}
				
			}else if(num<i) {
				if(num ==0&&count ==0) {
					left = 1;
					countG0++;
					count0++;
					System.out.println("這麼酷！直接猜0，可惜猜錯了，正確答案在"+left+"到"+right+"之間~");
					left = 0;
				}else if(num ==0&&countG0!=0){
					count0++;
					left = 1;
					System.out.println("好了啦，你就猜過了，0也小於1，你很皮哦~正確答案在"+left+"到"+right+"之間（￣へ￣）");
					left = 0;
				}
				else if(num>left||(num==0&&count0==0)) {
					count0++;
					left = num;
					System.out.println("太小囉！正確答案在"+left+"到"+right+"之間~");
				}else {
					System.out.println("就說太小了，該吃藥囉！正確答案在"+left+"到"+right+"之間啦！");
				}
			}else {
				System.out.println("答對了！答案就是"+i);
				break;
			}
		count++;
		}
	}
}
