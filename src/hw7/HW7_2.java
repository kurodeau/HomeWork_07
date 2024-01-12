package hw7;

import java.io.*;
import java.math.*;
//import java.lang.StringBuffer;

public class HW7_2 {
	
	public static void main(String[] args) {
		
		//產生10個 1~100亂數;
		String filePath = "./HW7_files"; //設定要存放檔案的目錄
		String fileName = "Data.txt"; //設定要寫入檔案的名稱		

		StringBuffer content = new StringBuffer();
		
		for(int i= 0; i<= 9; i++ ) {
			int r = (int)(Math.random() * 1000)+ 1;
		    if ( i<9 ) { content.append( r + "," ); }
		    else { content.append( r + "\n" ); };
		};
//		System.out.println( content );
		
		//判斷目標路徑是否存在
//		File dir = new File( filePath ); //將字串路徑轉為Path
		Path dir = new Path( filePath ); //將字串路徑轉為Path
		
		if( !dir.exists() ) {
			System.out.println("不存在這個路徑");
			
			try{ 
				File.createTempFile(filePath, fileName); 
				}
			catch( IOException e ){
				e.printStackTrace();
			};
		}
		else if( dir.list().length == 0 ){
			
			try{ 
				File.createTempFile(filePath, fileName); 
				}
			catch( IOException e ){
				System.out.println("創檔案問題");
			};
			System.out.println("路徑存在, 檔案不存在, 繼續操作");
		};
		

		//寫入資料到檔案中
		try { 
            
			FileWriter fw = new FileWriter( filePath + "/" + fileName );
			BufferedWriter bw = new BufferedWriter( fw );
			
			bw.append( content.toString() );
			System.out.println( "文件寫入完成" );
			
			bw.close();
			fw.close();
			}
		catch( IOException e ) {
//			System.out.println( "例外" );
			
		};

	}


}
