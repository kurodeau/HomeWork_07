package hw10;

import java.sql.Array;

public class HW10_2 {
	
	//題目1:請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否為質數 (提示:Math類別)
	public static void isRandomNumPrime() {
		
		int[] numbers = new int[5];
		
		for (int i= 0; i< 5; i++ ) {
			numbers[i] = ( (int)(Math.random()* 100) )+ 1;
//			System.out.println( numbers[i] );
		}
		
		outer:for ( int i= 0 ; i< 5; i++) {
			
			for (int j= 1; j<= numbers[i]; j++) {
				
				if ( numbers[i] == 1 ) {
					System.out.println( numbers[i] + "  是質數" );
				}
				else if ( numbers[i] == j ) {
					if ( numbers[i] < 10 ) {
						System.out.println( numbers[i] + "  是質數" );
						continue outer;
					}
					else if ( numbers[i] < 100 ) {
						System.out.println( numbers[i] + " 是質數" );
						continue outer;
					}
					else if ( numbers[i] == 100 ) {
						System.out.println( numbers[i] + "是質數" );
						continue outer;
				    }
				}
				else if ( numbers[i] % j == 0 ) {
					if ( numbers[i] < 10 ) {
						System.out.println( numbers[i] + "  不是質數" );
						continue outer;
					}
					else if ( numbers[i] < 100 ) {
						System.out.println( numbers[i] + " 不是質數" );
						continue outer;
					}
					else if ( numbers[i] == 100 ) {
						System.out.println( numbers[i] + "不是質數" );
						continue outer;
					}
				}
				
		    }

		}		
		
	} 

}
