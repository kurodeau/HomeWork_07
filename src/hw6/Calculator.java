package hw6;

import java.util.Scanner;

import hw6.CalException;

public class Calculator{

	// 宣告類別變數
	private int x = 0;
	private int y = 0;

	// 宣告建構方法
	Calculator() {
	};
	Calculator(int x, int y) throws CalException {
		setterxy(x, y);
	};
	// 宣告GS方法
	public void setterxy(int x, int y) throws CalException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("替您計算x 的y 次方");
		System.out.println("請輸入x");
		x = scanner.nextInt();
		System.out.println("請輸入y");
		y = scanner.nextInt();

		
		if ( x == 0 && y == 0 ){
			throw new CalException("0的 0次方沒有意義...請重新輸入吧");
			setterxy();
		}
		else {
			this.x = x;
			this.y = y;
			scanner.close();
		}
	}
	public int getterx() {
		return x;
	}
	public int gettery() {
		return y;
	}
	// 設計powerXY方法為,功能是會計算x的y次方並回傳結果。
	public int powerXY() {
		int answer = 1;
		for (int i = 0; i <= y; i++) {
			if (i != 0) {
				answer = answer * x;
			}
		}
		return answer;
	}
}
