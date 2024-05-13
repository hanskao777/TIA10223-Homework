package hw6;

public class Calculator {
	private int x, y;

	public Calculator() {

	}

	public Calculator(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			return (int) Math.pow(x, y);
		}
	}
}
