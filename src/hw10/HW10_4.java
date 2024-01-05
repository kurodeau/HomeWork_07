package hw10;

import java.util.Scanner;
import java.util.Date;

public class HW10_4 {
	
	public static void dateType() {
		
		String checkInput = "^\\d{4}[01-12]{1}[01-31]{1}$";
		String checkType = "^['1''2''3']{1,1}";
		boolean unCorrect = true;

		System.out.print("請輸入要轉換的時間YYYYMMDD,例如:20121231");
		
		//do_while 判斷書輸入內容事由數字組成
		String num;
		do{
			Scanner sc = new Scanner(System.in);
			num = sc.next();
			if ( num.matches(checkInput) ) {
				unCorrect = false;
			}
			else {
				System.out.print("輸入格式錯誤, 請重新輸入格式為YYYYMMDD");
			}
			
		}while ( unCorrect );
		
		System.out.print("選擇以下列何種表示方法顯示(1)年/月/日(2)月/日/年(3)日/月/年");
		String type = null;
		do{
			Scanner sc = new Scanner(System.in);
			type = sc.next();
			if ( type.matches(checkType) != true ) {
				type = null;
				System.out.println("請輸入1~3 且只能是");
			}
		}while ( type == null );
		
		int intType = Integer.parseInt(type);
		int intNum = Integer.parseInt(num);
		switch( intType ) {
		case 1:
			System.out.println(  intNum );
			break;
		case 2:
			System.out.println(  intNum );
			break;
		case 3:		
			System.out.println(  intNum );
			break;
		}
		
	}

}
