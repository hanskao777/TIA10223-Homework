package hwExt;

public class SwordMan extends Hero implements Action{

	public SwordMan() {
		super();
	}

	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("揮劍");
	}

	public void move() {
		super.move();
	}

	public void defend() {
		super.defend();
	}

}
