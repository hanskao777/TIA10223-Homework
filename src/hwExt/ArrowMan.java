package hwExt;

public class ArrowMan extends Hero implements Action{

	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}

	public void move() {
		super.move();
	}

	public void defend() {
		super.defend();
	}
}
