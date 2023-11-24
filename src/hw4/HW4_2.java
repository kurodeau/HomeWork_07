package hw4;
import java.lang.StringBuilder;
import java.util.Scanner;

public class HW4_2 {
	
	public static void findArrayArgMax(int[] x) {
		
		double arrayArg = 0;
		int arrayMax = x[0];
		
		// 迴圈加總array
		for (int i =0 ; i <= (x.length-1) ; i++) {
			arrayArg += x[i];
		}
		arrayArg = (arrayArg / (x.length));
		System.out.println("這個array的所有元素平均數是:" + arrayArg);
		
		for (int i =0 ; i <= (x.length-1) ; i++) {
			if (x[i] > arrayMax) {
				arrayMax = x[i];
			}
		}
		System.out.println("這個array中最大的元素是:" + arrayMax);
		
	}
	
	public static void getStringOpp(String s) {

		int stringL = s.length();
		StringBuilder sOpp = new StringBuilder();
		
		for( int i=0 ; i <= stringL-1 ; i++) {
			sOpp.append( s.charAt(stringL-1-i) );
		};
		System.out.print(sOpp);
		
	} 
	
	public static void countSolarSystem(String[] s) {
		
		int[] aeiou = new int[5];
		
		for(int i=0 ; i< (s.length) ; i++) {
			
			for(int j=0 ; j< (s[i].length() ) ; j++) {
				
				if ( s[i].charAt(j) == 'a' ) {
					aeiou[0] += 1 ;}
					else if ( s[i].charAt(j) == 'e'  ) {
						aeiou[1] += 1 ;
					}
					else if ( s[i].charAt(j) == 'i'  ) {
						aeiou[2] += 1 ;
					}
					else if ( s[i].charAt(j) == 'o'  ) {
						aeiou[3] += 1 ;
					}
					else if ( s[i].charAt(j) == 'u'  ) {
						aeiou[4] += 1 ;
					}	
				}
			}
		System.out.println("母音分別有");
		System.out.print("a:" + aeiou[0] + " ");
		System.out.print("e:" + aeiou[1] + " ");
		System.out.print("i:" + aeiou[2] + " ");
		System.out.print("o:" + aeiou[3] + " ");
		System.out.print("u:" + aeiou[4] + " ");
		}
		
	public static void getMoneyFromMath(int[][] array4) {
		
		int countMath = 0;
		int needMoney;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個欲借金額, 將篩選可以借的人");
		needMoney = scanner.nextInt();
		scanner.close();
		
		System.out.print("符合借錢條件的人有:");
		
		for (int i=0 ; i< (array4[0].length) ; i++){
			
			if ( array4[1][i] >= needMoney ) {
				countMath += 1;
				System.out.print(array4[0][i] + " ");
			}
		}
		System.out.print(",共" + countMath + "人");

	}	
	
    public static void countDataInYear() {
    	
		//輸入日期並判斷是否符合
    	int count = 0;
    	int leapYear = 0;
		int[] yourData = new int[3]; 
    	Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一組日期, 分別包含1~n碼的西元年分, 1~2碼的月份, 1~2碼的日期");
		System.out.println("首先請輸入1~4碼的西元年分");
		yourData[0] = scanner.nextInt();
		if (yourData[0] < 1) {
			System.out.println("你這年分不對, 我只想計算正整數, 重新執行一次吧");
			System.exit(0);
		}
		System.out.println("再請請輸入1~2碼的月份");
		yourData[1] = scanner.nextInt();
		if (yourData[1] < 1 || yourData[1] > 12) {
			System.out.println("你這月份不對,他該介於1~12, 重新執行一次吧");
			System.exit(0);
		}
		System.out.println("最後請輸入1~2碼的日期");
		yourData[2] = scanner.nextInt();
		switch (yourData[1]){
		    case 1:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("1月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 2:
		    	if (    ( yourData[0] % 4 == 0 ) &&
		    			( yourData[2] < 1 || yourData[2] > 29 ) )
		    	{
		    		System.out.println("2月份的日期錯誤,你這是閏年該介於29), 重新執行一次吧");
					System.exit(0);
		    	}
		    	else if( ( yourData[0] % 4 != 0 ) &&
		    			( yourData[2] < 1 || yourData[2] > 28 )  )
		    	{
		    		System.out.println("2月份的日期錯誤,他該介於28, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 3:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("3月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 4:
		    	if (yourData[2] < 1 || yourData[2] > 30) {
		    		System.out.println("4月份的日期錯誤,他該介於1~30, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 5:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("5月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 6:
		    	if (yourData[2] < 1 || yourData[2] > 30) {
		    		System.out.println("6月份的日期錯誤,他該介於1~30, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 7:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("7月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 8:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("8月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 9:
		    	if (yourData[2] < 1 || yourData[2] > 30) {
		    		System.out.println("9月份的日期錯誤,他該介於1~30, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 10:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("10月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 11:
		    	if (yourData[2] < 1 || yourData[2] > 30) {
		    		System.out.println("11月份的日期錯誤,他該介於1~30, 重新執行一次吧");
					System.exit(0);
		    	}
		    case 12:
		    	if (yourData[2] < 1 || yourData[2] > 31) {
		    		System.out.println("12月份的日期錯誤,他該介於1~31, 重新執行一次吧");
					System.exit(0);
		    	}
		    default :
		            {
		            System.out.println("接著為你計算這個日期是該年分的第幾天...");
		            scanner.close();
		            }
		    }
		
		//計算潤年
		if ( yourData[0] % 4 == 0 ) {
			leapYear += 1;
		}
		//接下來計算這個日期是該年的第幾天
		switch (yourData[1]){
	    case 12:{ count = (334 + leapYear + yourData[2]); break;}
	    case 11:{ count = (304 + leapYear + yourData[2]); break;}
	    case 10:{ count = (273 + leapYear + yourData[2]); break;}    	
	    case 9:{ count = (243 + leapYear + yourData[2]); break;}
	    case 8:{ count = (212 + leapYear + yourData[2]); break;}    	
	    case 7:{ count = (181 + leapYear + yourData[2]); break;}
	    case 6:{ count = (150 + leapYear + yourData[2]); break;}
	    case 5:{ count = (119 + leapYear + yourData[2]); break;}
	    case 4:{ count = (89 + leapYear + yourData[2]); break;}
	    case 3:{ count = (58 + leapYear + yourData[2]); break;}
	    case 2:{ count = (30 + yourData[2]); break;}
	    case 1:{ count = (yourData[2]); break;}	
	    }
		System.out.println("你這日期是當年的第" + count + "天"); 

		}
    	
    public static void countHighestScore(int[][] array6) {
    	
    	int[][] highestScore = {
    			{1, 2, 3, 4, 5, 6, 7, 8},
    			{0, 0, 0, 0, 0, 0, 0, 0}
    			};
    	int bestStu = 0;
    	int bestG = 0;
    	for ( int i=0 ; i < (array6.length) ; i++) {
    		
    		for ( int j=0 ; j<(array6[0].length) ; j++) {
    			if ( array6[i][j] > bestG) {
    				bestG = array6[i][j];
    				bestStu = j;
    			}
    			
//    			if ( j>=1 && highestScore[i][j] > bestG) {
//    				bestStu = j;
//    			}
    		}
    		highestScore[1][bestStu] += 1; 
    		bestG = 0;
    	}
    	System.out.println("每個同學最高分的次數如下:");
    	
    	for ( int i=0 ; i < (highestScore[0].length) ; i++) {
    		System.out.print(highestScore[0][i]+"號:"+highestScore[1][i]+"次  ");
    	}
    
    }
    	
}
    

	

