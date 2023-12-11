package hw6;

public class Calculator{

	// 宣告類別變數
	private int x = 0;
	private int y = 0;

	// 宣告建構方法
	Calculator() {
	};
	Calculator(int x, int y) throws CalException {		
		setterxy(x, y);
		}
	// 宣告GS方法
	public void setterxy(int x, int y) throws CalException{
		if ( x == 0 && y == 0 ){
			throw new CalException("0 的0 次方沒有意義");
		}
		else if ( y < 0) {
			throw new CalException("y請不要是負值");
		}
		else {
			setterx(x);
			settery(y);
		}
	}
	public void setterx(int x) throws CalException {
		this.x = x;
	}
	public void settery(int y) throws CalException {
		this.y = y;
	}
	public int getterx() {
		return x;
	}
	public int gettery() {
		return y;
	}
	// 設計powerXY方法為,功能是會計算x的y次方並回傳結果。
	public double powerXY() {
		double answer;
		answer = Math.pow(x, y);
		return answer;
	}
}
