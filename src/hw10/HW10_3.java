package hw10;

import java.util.Scanner;

public class HW10_3 {
	
	static public void selectNumDisplayType() {
		
		String checkInput = "^\\d+$";
		String checkType = "^['1''2''3']{1,1}";
		boolean unCorrect = true;

		System.out.print("請輸入任意數");
		
		//do_while 判斷書輸入內容事由數字組成
		String num;
		do{
			Scanner sc = new Scanner(System.in);
			num = sc.next();
			if ( num.matches(checkInput) ) {
				unCorrect = false;
			}
			else {
				System.out.print("輸入的內容不是數字, 重新輸入");
			}
			
		}while ( unCorrect );
		
		System.out.print("選擇以下列何種表示方法顯示(1)千分位(2)百分比(3)科學記號");
		String type = "";
		do{
			Scanner sc = new Scanner(System.in);
			type = sc.next();
			if ( type.matches(checkType) != true ) {
				type = null;
				System.out.println("請輸入1~3 且只能是");
			}
		}while ( type == null );
		
		int intType = Integer.parseInt(type);
		double doubleNum = Double.parseDouble(num);
		switch( intType ) {
		case 1:
			System.out.println(  doubleNum / 1000 );
			break;
		case 2:
			System.out.println(  (doubleNum * 100) + "%" );
			break;
		case 3:		
			System.out.println(  String.format("%.2e", doubleNum) );
			break;
		}
				
	}
	
}
