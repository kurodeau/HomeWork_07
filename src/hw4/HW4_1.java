package hw4;

public class HW4_1 {
	
	public static void main(String[] args) {
		
		//調用第一題_計算陣列的平均數與最大數(檢查OK
		int[] array1 = {29, 100, 39, 41, 50, 66, 8, 77, 95, 15};
//		HW4_2.findArrayArgMax(array1);
		
		//調用第二題_使輸入的字串反過來顯示(檢查OK
		String S = ("String");
//		HW4_2.getStringOpp(S);

		//調用第三題_計算字串array中指定的母音數量(檢查OK
		String[] eightPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
//		HW4_2.countSolarSystem(eightPlanets);
		
		//調用第四題_滿足借錢條件, 則印出符合編號與總數(檢查OK
		int[][] array4 = { {25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200} };
//		HW4_2.getMoneyFromMath(array4);
		
		//調用第五題_輸入年分, 月份, 日期, 計算該日期日該年的第幾天(檢查OK
//		HW4_2.countDataInYear();
		
		//調用第六題_考最高分數的次數(檢查OK
		int[][] array6 = { 
				{10, 35, 40, 100, 90, 85, 75 ,70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
				};
		HW4_2.countHighestScore(array6);
	}
	
	


}
