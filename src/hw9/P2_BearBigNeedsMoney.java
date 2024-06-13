package hw9;

class Account {
	int deposit;

	synchronized public void remit(int a) {
		while (deposit > 3000) {
			System.out.println("夠多了，太多的話等等被拿去儲值手遊ˊ_>ˋ");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		deposit += a;
		System.out.println("匯了" + a + "塊，存款有" + deposit + "塊");
		notify();
	}

	synchronized public void withdraw(int money) {
		while (deposit < money) {
			System.out.println("沒錢啦，快點去找媽媽哭哭！");
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		deposit -= money;
		System.out.println("領了" + money + "塊，存款剩下" + deposit + "塊");
		if (deposit < 2000) {
			System.out.println("媽媽快點給錢錢Q_Q");
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
			ac.withdraw(1000);
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