package hw9;
//看完老師的範例改的

class Account1 {
	int deposit = 0;
	boolean dontRemit =false;
//	boolean withdrawFinished;//想要把旗標改寫在其他地方
//	boolean withdrawNotify;
//	boolean remitNotify;

	synchronized public void remit(int a) {
//		if (remitNotify) {
//			System.out.println("媽媽被熊大要求匯款！");
//			remitNotify = false;
//		}
//		上面幾行都是多餘的，寫在wait()後面就會有相同的效果
		while (deposit > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
//			withdrawNotify = true;
			try {
//				System.out.println("媽在等");
				wait();
			} catch (InterruptedException ie) {
				System.err.println("媽媽可以結束匯款惹～");
				dontRemit = true;
				return;
			}
			System.out.println("媽媽被熊大要求匯款！");
		}
		deposit += a;
		System.out.println("媽媽存了" + a + "，帳戶共有" + deposit);
		notify();
	}

	synchronized public void withdraw(int money) {// 上個寫法有傳入count，為了要控制旗標，但是旗標換地方了
//		if (withdrawNotify) {
//			System.out.println("熊大被老媽告知帳戶已經有錢！");
//			withdrawNotify = false;
//		}
		while (deposit < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
//			remitNotify = true;
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("熊大被老媽告知帳戶已經有錢！");
		}
		deposit -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + deposit);
		if (deposit < 2000) {
			notify();
		}
//		因為沒有旗標了，這邊也不用了
//		if (count == 10) {
//			withdrawFinished = true;
//			notify();
//		}
	}
}

class Withdraw1 extends Thread {
	Account1 ac;

	public Withdraw1(Account1 ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			ac.withdraw(1000);// 本來會傳入i控制旗標，但是旗標換地方了
//			System.out.println("領了" + i + "次");
		}
//		System.out.println("w死掉");
	}
}

class Remit1 extends Thread {
	Account1 ac;

	public Remit1(Account1 ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if(ac.dontRemit) {
				break;//老師是讓十次迴圈都跑完，可是我不喜歡，所以設了一個旗標，被interrupt後就結束了
			}
			ac.remit(2000);
//			System.out.println("存了" + i + "次");
		}
	}
}

public class P2_1_BearBigNeedsMoney {
	public static void main(String[] args) {
		Account1 ac1 = new Account1();
		Remit1 re = new Remit1(ac1);
		Withdraw1 wi = new Withdraw1(ac1);
		re.start();
		wi.start();
		
		while (re.isAlive()) {//我就調皮，跟老師寫得不太一樣，而且不好讀:D，但是我很愉悅
			if(!wi.isAlive()) {//說實在的我不懂為什麼老師要用旗標
				re.interrupt();//interrupt好像不會把執行緒砍了，要再自己把執行緒結束
			}
			//為啥小吳要sleep?
		}
		
//		下面是老師的寫法
//		while (true) {
//			// 熊大執行緒跑完了而且媽媽還在就中斷wait
//			if (Son.isFinished && t_mom.isAlive()) {
//				t_mom.interrupt();
//			}
//			
//			try {
//				// 讓無窮迴圈睡一下，把執行權讓出來
//				Thread.sleep(500);
//			} catch (InterruptedException ie) {
//				ie.printStackTrace();
//			}
//			
//			// 兩個執行緒都結束了，main也可以結束
//			if (Son.isFinished && !t_mom.isAlive())
//				break;
//		}
	}
}