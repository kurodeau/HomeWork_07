package hw4;

import java.util.Scanner;

public class HW4_3 {

	public static void main(String[] args) {

		int range = 49;
		int num = 1;
		int ban = 0;

		System.out.println("請輸入1~9的一個數");
		Scanner scanner = new Scanner(System.in);
		ban = scanner.nextInt();
		scanner.close();

		int conLottoNum = 0; // 自動選號用,不要這功能可以去掉

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
					conLottoNum += 1;
				}
			}
			System.out.println();
			System.out.println("以上是不包含" + ban + "的樂透數字");

			int[] conLottoArray = new int[conLottoNum]; // 自動選號用,可以不要
			int yourLotto[] = new int[6]; // 自動選號用,可以不要

			int count = 0; // 自動選號用,可以拿掉
			while (num <= range) { // 自動選號用,可以拿掉
				if ((num > 10) && (num / 10) == ban) {
					num++;
				} else if ((num % 10) == ban) {
					num++;
				} else {
					conLottoArray[count] = num;
					num++;
					count += 1;
				}
			}

			int r = (int) (Math.random() * conLottoNum); // 自動選號用隨機生成數用,可以拿掉
			System.out.println("測試訊息,目前的隨機數r=" + r); // 自動選號用隨機生成數用,可以拿掉
			
			System.out.print("自動選號的結果是:"); // 自動選號用隨機生成數用,可以拿掉

			int chose = 0; //已經隨隨機選出數字的次數
			while (chose < 6) { // 自動選號用,可以拿掉

				for (int i = 0; i <= (conLottoNum - 1); i++) {
					if (r == conLottoArray[i] &&
						r != yourLotto[0] &&
						r != yourLotto[1] &&
						r != yourLotto[2] &&
						r != yourLotto[3] &&
						r != yourLotto[4] &&
						r != yourLotto[5])

					{
//						yourLotto[count] = r;
						System.out.print(yourLotto[count] + " ");
						r = (int) (Math.random() * conLottoNum);
						chose += 1;
						continue;
					}

				}

			}

		}
	}
}
