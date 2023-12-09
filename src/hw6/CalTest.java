package hw6;

import java.util.Scanner;

public class CalTest {
		
	public static void main(String[] args){
		
		//使使用者可以自訂變數
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("替您計算x 的y 次方");
		System.out.println("請輸入x");
		x = scanner.nextInt();
		System.out.println("請輸入y");
		y = scanner.nextInt();
		scanner.close();
		
		
		Calculator testArray = new Calculator(x, y);
		
		//以try, 呼叫testArray.powerXY()方法
		try { testArray.powerXY(); }
		catch( CalException a ){
			System.out.println(public CalException("0的 0次方沒有意義...請重新輸入吧"));
			//這裡要放輸入x, y 的code
		}catch(  ) {
			
		}
		
		testArray.powerXY();
		
		
		
	}

}
