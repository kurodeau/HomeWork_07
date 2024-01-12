package hw9;

import java.lang.Runnable;

public class HW9_1 {

	// 設定 ready 參數 讓兩 Thread 同時開跑
	private static boolean ready = false;

	public static void main(String[] args) {

		// 建立: Djeeta, Grand
		Djeeta djeeta = new Djeeta();
		Grand grand = new Grand();
		Thread d1 = new Thread(djeeta);
		Thread g1 = new Thread(grand);

		d1.start();
		g1.start();
		ready = true;
	}

	public static class Djeeta implements Runnable {

		private int eatCountD = 1;

		public void run() {
			while (!ready) {
				System.out.println("Djeeta 準備中");
			}
			;

			while (eatCountD <= 10) {
				if (eatCountD < 10) {

					System.out.println("Djeeta 吃完第" + eatCountD + "碗");
					eatCountD++;

					try {
						Thread.sleep((int) (Math.random() * 2500) + 500);
					} catch (Exception e) {
						System.out.println("Djeeta Thread 錯誤");
					};

				}
				if (eatCountD == 10) {
					System.out.println("Djeeta 吃完全部10碗了!");
					eatCountD++;
				};

			};

		};

	};

	public static class Grand implements Runnable{
		
		private int eatCountG = 1;
		
		public void run() {
			while( !ready ) {
				System.out.println("Grand 準備中");
			};
			
			while( eatCountG <= 10 ) {
				if( eatCountG < 10 ) {
					
					System.out.println("Grand 吃完第" + eatCountG + "碗");
					eatCountG++;
					
					try{
						Thread.sleep( (int)(Math.random()*2500)+ 500 );
					}
					catch( Exception e ){
						System.out.println("Grabd Thread 錯誤");
					};
					
			    };
			    if (eatCountG == 10) {
					System.out.println("Grand 吃完全部10碗了!");
					eatCountG++;
				};
				
			};
		   
	    };
		
	};

};
