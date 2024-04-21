package hw1;

public class Practice3 {
	public static void main(String[] args) {
		int time = 256_559;// 用time把256559秒存起來
		int days, hours, minutes, seconds;
		days = time / (60 * 60 * 24);// 一天有60*60*24秒
		hours = time % (60 * 60 * 24) / (60 * 60);// 不用重複計算天數的小時數
		minutes = time % (60 * 60) / 60;// 理由同上
		seconds = time % 60;// 理由同上
		System.out.println(time + "秒為" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
	}
}
