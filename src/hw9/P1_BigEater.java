package hw9;

public class P1_BigEater implements Runnable {
	String s = "";
//	寫法一，試著回傳物件，為了可以接續寫上.start
	public P1_BigEater setS(P1_BigEater p,String s) {
		this.s = s;
		return p;
	}

//	寫法二，比較簡單易懂的寫法
	public void setS(String s) {
		this.s = s;
	}
	
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println(s+"吃第"+i+"碗飯");
			int j = (int)(Math.random()*2500)+500;
			try {
				Thread.sleep(j);	
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println(s+"吃完了！");//應該是老師給我們的方便吧，故意把上面設計成開始吃，不然又要寫一個if-else判斷的樣子
	}

	public static void main(String[] args) {
		P1_BigEater p1 = new P1_BigEater();
		P1_BigEater p2 = new P1_BigEater();
		System.out.println("-----大胃王快食比賽開始-----");
//		寫法一，使用匿名函式，並且使用了回傳物件，就可以接續使用.start();
//		但是後面發現使用匿名函式要再呼叫isAlive()跟join()方法都很麻煩，要多寫很多字，所以好像還是算了
//		new Thread(p1.setS(p1,"饅頭人")).start();
//		new Thread(p2.setS(p2,"詹姆士")).start();
		
//		寫法二，簡單易讀，先把饅頭人跟詹姆士放進類別，再用run加上名字，為什麼要那麼麻煩？
//		因為run不給傳入引數ˊ_>ˋ
//		寫法二跟寫法一會得到一樣的結果
		p1.setS("饅頭人");
		p2.setS("詹姆士");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
		
//		寫法一，chatgpt教的，感覺滿廢的，為了要在兩個執行緒都跑完才印出大胃王比賽結束，所以使用了join，join又有拋出例外
//		try {
//			t1.join();
//			t2.join();
//		}catch(InterruptedException ie) {
//			ie.printStackTrace();
//		}
		
//		寫法二，錯的，if-else只會做一次判斷，而且是在main執行緒跑，會跟t1、t2同時開始執行，所以t1跟t2都還沒死掉就已經執行了
//		if(t1.isAlive()||t2.isAlive()) {
//		}else {
//			System.out.println("-----大胃王快食比賽結束！-----");			
//		}
		
//		寫法三，用while迴圈來實現寫法二的想法，chatgpt提供的
		while(t1.isAlive()||t2.isAlive()) {
//			while的特性是會執行無數次，直到符合條件跑完迴圈
		}
		System.out.println("-----大胃王快食比賽結束！-----");
		
//		結論，thread部分兩個寫法都可以，不過到了後半部寫法一就會很麻煩，雖然很酷
//		後半部則是選擇寫法一或是寫法三，寫法二是錯的，跟寫法三邏輯一樣，只是if-else只會執行一次，而while會檢查無數次
//		至於寫法一跟寫法三，具體要看thread怎麼執行來判斷哪個比較省資源，但是現在還是算了Q
//		我喜歡寫法三，因為不用處理例外
	}
}
