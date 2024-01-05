package hw7;

import java.io.*;

public class HW7_1 {

	public static void main(String[] args) {

		int c; // 用來代指每個讀到的字元
		String l; // 用來代指內文的某行
		int lNum = 0; //用來計算文件中所有行數
		int n = 0; // 用來代指字元的數量計次
		long size; // 代指文件位元大小
		
		try {

			//取得文件中字數
			FileReader fr1 = new FileReader("C:\\THA105_Workspace\\HomeWork_07\\Sample.txt");

			while ( ( c = fr1.read( )) != -1) {
//				System.out.print((char) c);
				n += 1;
			};

			//取得文件中行數			
			FileReader fr2 = new FileReader("C:\\THA105_Workspace\\HomeWork_07\\Sample.txt");
			BufferedReader br2 = new BufferedReader(fr2);

			while( (l = br2.readLine()) != null ) {
//				System.out.println(l);
//				System.out.println("還在執行找行迴圈");
				lNum += 1;
			};
			
			//取得文件的位元數
//			FileInputStream fis3 = new FileInputStream("C:\\THA105_Workspace\\HomeWork_07\\Sample.txt");
//			InputStreamReader isr3 = new InputStreamReader(fis3);
			
			File file3 = new File("C:\\THA105_Workspace\\HomeWork_07\\Sample.txt");
			size = file3.length();
			
			
			br2.close();
			fr2.close();
			fr1.close();
			
			System.out.println("一共有:");
			System.out.println(size + " 個位元");
			System.out.println( n + " 個字元");
			System.out.println(lNum + " 行字");

		    }
		catch (IOException e) {};

	}

}
