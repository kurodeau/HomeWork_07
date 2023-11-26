package hw3;

import java.util.Scanner;

public class HW3_2 {

	// 第一題,讓使用者可自行輸入三個整數, 並作為三角形邊長判斷是否符合三角形
	public static void isTriangle() {

		int s[] = new int[3]; // 預設三角形三條邊長並作為array

		Scanner scanner = new Scanner(System.in);
		System.out.println("請分別輸入三個正整數, 將依之作為三角形的三條邊長並判斷這是不是三角形");

		for (int i = 0; i <= (3 - 1); i++) {
			System.out.println("請輸入第" + (i + 1) + "條邊長");
			s[i] = scanner.nextInt();
		}
		;
		scanner.close();

		if (s[0] < 1 || s[1] < 1 || s[2] < 1) {
			System.out.println("不是三角形, 這裡有三角形的邊長<1, 請重新來過");
		}

		else if ((s[0] + s[1] <= s[2]) || (s[0] + s[2] <= s[1]) || (s[1] + s[2] <= s[0])) {
			System.out.println("不是三角形 ,三角形的任意兩邊和都必須>第三邊, 請重新來過");
		}

		else {

			if (s[0] == s[1] && s[1] == s[2]) {
				System.out.println("是三角形, 且三條邊完全相等, 這是一個正三角形");
			}

			else if ((Math.pow(s[0], 2) + Math.pow(s[1], 2) == Math.pow(s[2], 2))
					|| (Math.pow(s[0], 2) + Math.pow(s[2], 2) == Math.pow(s[1], 2))
					|| (Math.pow(s[1], 2) + Math.pow(s[2], 2) == Math.pow(s[0], 2))) {
				System.out.println("是三角形, 且其中兩條邊的平方和等於第三邊平方, 這是一個直角三角形");
			}

			else if (s[0] == s[1] || s[1] == s[2] || s[0] == s[2]) {
				System.out.println("是三角形, 且其中兩條邊完全相等, 這是一個等腰三角形");
			}

			else {
				System.out.println("是三角形");
			}

		}

	}

	// 第二題,1~100的終極密碼
	public static void isSecretNumber() {
		System.out.println("歡迎來到不猜中正確數字就不會結束的程式...");
		System.out.println("請你隨意輸入介於1~100的整數, 直到猜到正確的密碼吧");

		int secretNumber = (int) (Math.random() * 100);
//		System.out.println("測試訊息, 密碼是:" + secretNumber);

		int usernum = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			usernum = scanner.nextInt();
			if (usernum > secretNumber) {
				System.out.println("密碼比你猜得更小, 也就是密碼小於" + usernum);
			} else if (usernum < secretNumber) {
				System.out.println("密碼比你猜得更大, 也就是密碼大於" + usernum);
			}

		} while (usernum != secretNumber);

		scanner.close();
		System.out.println("恭喜, 密碼就是" + usernum);

	}

	// 第三題,不出現指定號碼的隨機樂透選號
	public static void randomLottoNumberWithoutURNum() {

		int range = 49;
		int num = 1;
		int ban = 0;
		
		System.out.println("請輸入1~9的一個數");
		Scanner scanner = new Scanner(System.in);
		ban = scanner.nextInt();
		scanner.close();

		if (ban > 9 || ban < 1) {
			System.out.print(ban + ",這個數沒有介於1~9,重新執行一次吧");
		} else {
			while (num <= range) {
				if ((num > 10) && (num / 10) == ban) {
					num++;
				} else if ((num % 10) == ban) {
					num++;
				} else {
					System.out.print(num + ",");
					num++;
				}
			}
			System.out.println();
			System.out.println("以上是不包含" + ban + "的樂透數字");
			

			
		
		}
		
	}	

    //第三題ex, 如果支援隨機選號(這個進階就直接重寫了, 順便改改原本的邏輯)
	public static void randomLottoNumberWithoutURNum2() {
		int[] canChooseNums = new int [49];
		int ban = 2; //暫時寫死, 之後調整為自訂1~9
		
		System.out.println("請輸入1~9的一個數");
		Scanner scanner = new Scanner(System.in);
		ban = scanner.nextInt();
		scanner.close();
		
		//判斷輸入值是否合法
		if ( ban < 1 || ban > 9 ) {
			System.out.println("這沒有介於1~9, 程式將關閉");
			System.exit(0);
		}
		
		System.out.println("排除你所選數" + ban + "後, 還有這些數字可選:");
		//迴圈在CanChooseNums清單放入剩下的數, 順便打印
		for ( int lottoNum = 1 ; lottoNum<canChooseNums.length ; lottoNum++) {
			if (ban > 9 || ban < 1) {  //判斷ban是否符合條件
				System.out.print(ban + ",這個數沒有介於1~9,重新執行一次吧");
				System.exit(0);
			} 
			else 
			{
				
				if (  (lottoNum > 10) && (lottoNum / 10) == ban) 
				{  canChooseNums[lottoNum-1] = 0;  } 
				else if ((lottoNum % 10) == ban)
				{  canChooseNums[lottoNum-1] = 0;  } 
				else 
				{
					System.out.print(lottoNum + ",");
				    canChooseNums[lottoNum-1] = lottoNum;	}		
			}
		
		}
		
		//迴圈抽取六個數
		System.out.println("");
		System.out.println("你的自動選號是:");
		int[] yourNums = new int [6];
		int yourNumsCount = 0;
		
		while (  yourNumsCount != yourNums.length  ) 
		{
			int randomNum = (int)(Math.random()*canChooseNums.length);
			if (    (  canChooseNums[randomNum] != 0  )&&
				    (  canChooseNums[randomNum] != yourNums[0]  )&&
				    (  canChooseNums[randomNum] != yourNums[1]  )&&
				    (  canChooseNums[randomNum] != yourNums[2]  )&&
				    (  canChooseNums[randomNum] != yourNums[3]  )&&
				    (  canChooseNums[randomNum] != yourNums[4]  )&&
				    (  canChooseNums[randomNum] != yourNums[5]  )    ) 
			    {
					System.out.print( canChooseNums[randomNum]+" ");
					yourNums[yourNumsCount] = canChooseNums[randomNum];
					yourNumsCount += 1;
			    }
		}
		
		
	}

}

