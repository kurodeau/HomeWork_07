package hw5;

import java.util.Scanner;

public class HW5_2 {
	
	//第一題, 使用者可自行輸入長方形兩邊長, 並且以"*"打印出形狀
	static public void starSquare(){	

		//step1.讓使用者輸入兩邊長, 且檢查是否合法
		int width;
		int height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入你的長方形長寬, 兩數值間請放一個半形空格");
		width = scanner.nextInt();
		height = scanner.nextInt();
		if ( width>0 && height>0 ) { 
			scanner.close();
		}
		else {
			System.out.print("你這兩個值沒辦法組成一個長方形吧, 重新執行再試一次吧");
			System.exit(0);
		}
		
		//step2, 依照兩邊長打印長方形
		for ( int h=1 ; h <= height ; h++ ) {
			
			for(int w=1 ; w <= width ; w++ ) {				
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		
		
	}

	//第二題, 自動生成10個整數變數(包含100), 計算他們的平均值後將這11個數印出
	static public void randAvg(){
		
		//step1.做出10個數組成的array, 計算平均數, 打印出11個數字
		int[] randomNums = new int[10];
		int avg = 0;
		for (int n=0 ; n<10 ; n++) {
			randomNums[n] = (int)(Math.random()*100)+1 ;
			System.out.print(randomNums[n] + " ");
			avg += randomNums[n];
		}
		avg = avg / 10;
		System.out.println();
		System.out.println(avg);
		


	}

	//第三題_1, 用Overloading 找出矩陣內最大的值, int array的版本
	static public void maxElement(int[][] array ){
		
		int max = 0;
		for( int i = 0; i < array.length; i++){
			
			for( int j = 0; j < array[i].length ; j++) {
				if ( max <= array[i][j] ) { max = array[i][j]; }
				
			}
		}
		System.out.print(max);
	}

	//第三題_2, 用Overloading 找出矩陣內最大的值, double array的版本
	static public void maxElement(double[][] array ){
			
		double max = 0;
		for( int i = 0; i < array.length; i++){
			
			for( int j = 0; j < array[i].length ; j++) {
				if ( max <= array[i][j] ) { max = array[i][j]; }
					
			}
		}
		System.out.print(max);
		
	}

    //第四題, 產生8位隨機驗證碼的方法
	static public void genAuthCode(){
		
		//用萬國碼, 抓出英文字母大小寫的字元區間
		//小寫字母97~122, 大寫字母,65~90
		int count = 0;
		while ( count<8 ) {
	
			int r = (int)(Math.random() * 123);
			if(  
					(r>=48 && r<=57)  ||
					(r>=65 && r<=90) ||
					(r>=97 && r<=122)
			) {
				System.out.print( (char)r );
				count += 1;
			}
			
		}
	}



}
