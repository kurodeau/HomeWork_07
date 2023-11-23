package hw4;

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

}
