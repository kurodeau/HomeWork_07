package HomeWorkExt.hwpen;

public class TestPen {
	
	//宣告main方法
	public static void main(String[] args) {
		
		//實體化兩個物件做測試
		Pencil p1 = new Pencil("SKB", 10.0);
		InkBrush iB1 = new InkBrush("某個牌子", 100);
		
		//宣告getPrice方法測試
		p1.getPrice();
		iB1.getPrice();
	
	}

}
