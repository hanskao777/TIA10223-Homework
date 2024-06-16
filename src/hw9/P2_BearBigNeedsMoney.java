package hw9;

class Account {
	int deposit;
	boolean withdrawFinished;
//	boolean remitFinished;//沒用到
	boolean withdrawNotify;
	boolean remitNotify;

	synchronized public void remit(int a) {
		if (remitNotify) {
			System.out.println("媽媽被熊大要求匯款！");
			remitNotify = false;
		}
		while (deposit > 3000 && withdrawFinished == false) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			withdrawNotify = true;
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		deposit += a;
		System.out.println("媽媽存了" + a + "，帳戶共有" + deposit);
		notify();
	}

	synchronized public void withdraw(int money, int count) {
		if (withdrawNotify) {
			System.out.println("熊大被老媽告知帳戶已經有錢！");
			withdrawNotify = false;
		}
		while (deposit < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			remitNotify = true;
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		deposit -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + deposit);
		if (deposit < 2000) {
			notify();
		}
		if (count == 10) {
			withdrawFinished = true;
			notify();
		}
	}
}

class Withdraw extends Thread {
	Account ac;

	public Withdraw(Account ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			ac.withdraw(1000, i);
			System.out.println("領了" + i + "次");
		}
	}
}

class Remit extends Thread {
	Account ac;

	public Remit(Account ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			ac.remit(2000);
			System.out.println("存了" + i + "次");
		}
//		ac.remitFinished = true;//沒用到
	}
}

public class P2_BearBigNeedsMoney {
	public static void main(String[] args) {
		Account ac = new Account();
		Remit re = new Remit(ac);
		Withdraw wi = new Withdraw(ac);
		re.start();
		wi.start();
	}
}