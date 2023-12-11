package hw6;

import java.util.Scanner;

public class CalTest {
		
	public static void main(String[] args){
		
		//讓使用者可以自訂變數
		int x = 0;
		int y = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請依序輸入x, y, 將會計算x 的y 次方");
		System.out.println("請輸入x");
		x = scanner.nextInt();
		System.out.println("請輸入y");
		y = scanner.nextInt();
		
		Calculator c1 = new Calculator();
		//try 調用setter方法, 判斷例外
		try {
			c1.setterxy(x, y);
			System.out.print( c1.powerXY() );
		}
		catch (CalException c){
			c.printStackTrace();
		}
		scanner.close();
	}

}
