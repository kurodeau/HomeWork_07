package hw1;

public class HW1 {

	public static void main(String[] args) {
//		// 題目一
//		int num1 = 12;
//		int num2 = 6;
//		int product = num1 * num2; // 積
//		System.out.println(num1 + "和" + num2 + "的乘積是" + product);
//		int sum = num1 + num2; // 和
//		System.out.println(num1 + "和" + num2 + "的加總是" + sum);
//
//		// 題目二
//		int egg_nums = 200;
//		final int DOZEN = 12;
//
//		int dozen_nums = egg_nums / DOZEN;
//		System.out.println("一共是" + dozen_nums + "打");
//		int eggs_scattered = egg_nums % DOZEN;
//		System.out.println("而且剩下" + eggs_scattered + "顆");
//		System.out.println("一共是" + dozen_nums + "打");
//
//		// 題目三
//		int time_sec = 256559;
//		int sec_nums = time_sec % 60; // 計算分鐘之外的剩餘秒數
//		int min_nums = time_sec % (60 * 60 * 24) / (60 * 60) / (60); // 計算小時之外的剩餘分鐘數
//		int hour_nums = time_sec % (60 * 60 * 24) / (60 * 60); // 計算日之外的剩餘時數
//		int days_nums = time_sec / (60 * 60 * 24); // 計算小時之外的剩餘秒數
//		System.out.println(time_sec + "是" + days_nums + "天," + hour_nums + "時," + min_nums + "分," + sec_nums + "秒");
//
//		// 題目四
//		final double PI = 3.1415;
//		int r = 5;
//		double area = r * r * PI;
//		double perimeter = 2 * r * PI;
//		System.out.print("半徑" + r + "的話:");
//		System.out.printf("面積是%.2f", area);
//		System.out.printf(",圓周是%.2f %n", perimeter);

		// 題目五
		// int money = 1_500_000;
		double set = 0.02;
		double money_year = 1_500_000;
		int years = 10;
		while (years != 0) {
			money_year = money_year * (1 + set);
			years = years - 1;
		}
//		System.out.printf("存款連本帶利共:%.2f %n", money_year);
		System.out.print("十年後連本帶利是" + ( Math.round(money_year) ) );

//		// 題目六
//		System.out.println(5 +5); //同為int整數型別,彼此正常計算
//		System.out.println(5 +'5'); //'5'被轉成萬國碼所代表的數字()進行計算,可以參考下面註解掉的內容
////		int sample1 = '5';
////		System.out.println(sample1);
//		System.out.println(5 +"5"); //"5"是字串,運算內容包含字串,則一律由算術改寫為串接,可以參考下面註解的內容
////		String sample2 = "5";
////		System.out.println(sample2 + 7 +sample2);		

	}

}
