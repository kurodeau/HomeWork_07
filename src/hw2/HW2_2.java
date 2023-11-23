package hw2;

public class HW2_2 {
	
	//第一題,1~1000的偶數和,用for
	public static void even_1000(){
		
		int range = 1000;
		int num = 1;
		for (; num <= range; num++){
			
			if (num %2 ==0) {
				System.out.print(num +" ");
			}

		}
		System.out.println();
		System.out.println("以上是1~10000的所有偶數");
		System.out.println();
	}
		
	//第二題,1~10的連乘積,用for
	public static void product_1_10_for(){
		
		int range = 10;
		int num = 1;
		int product =1;
		for (;num <= range; num++){
			product =product *num;
		}
		System.out.print(product);
		System.out.println();
		System.out.println("以上是1~10的連乘積(by for)");
		System.out.println();
	}
		
	//第三題,1~10的連乘積,用while
	public static void product_1_10_while(){
		
		int range = 10;
		int num = 1;
		int product = 1;
		while (num <=range) {
			product =product *num;
			num ++; 
		}
		System.out.print(product);
		System.out.println();
		System.out.println("以上是1~10的連乘積(by while)");
		System.out.println();
	}
		
	//第四題,1~10個別的平方數,用while
	public static void squares_1_10_while(){
		
		int range = 10;
		int num = 1;
		int product = 1;
		while (num <=range) {
			product =num *num;
			System.out.print(product +"_");
			num ++; 
		}
		System.out.println();
		System.out.println("以上是1~10的個別平方數(by while)");
		System.out.println();
	}
		
	//第五題,1~49排除含有4的值,用while
	public static void exclude_4() {
		int range = 49;
		int num = 1;
		while(num <=range) {
			if ( (num>10) && (num/10) ==4) {num++;}
		    else if ( (num%10) ==4) {num++;}
			else {
				System.out.print(num + ",");
				num++;}
		}
		System.out.println();
		System.out.println("以上是不包含4的樂透數字");
		System.out.println();
	}
   
	//第六題,倒10層數三角形,用for
	public static void re_triangle_10() {
		int nums = 10;
		int count = 0;
		for(;count <=nums; count++) {
			for(int i =1; i <=(nums -count); i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("以上就是1~10的倒三角形");
		System.out.println("");
	}
		
	//第六題,倒10層數三角形,while
	public static void re_triangle_AF() {
		int y = 1;
		int nums_y = 6;
		String[] le = {"A","B","C","D","E","F"};
		while (y<= nums_y) {
			int x = 1;
			while(x<= y) {
				System.out.print(le[y-1]);
				x++;
			}
			y++;
			System.out.println();
		}
		System.out.println("以上就是A-F的正金字塔");
	}

}
