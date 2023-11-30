package HomeWorkExt.hwpen;

public class InkBrush extends Pen{
	
	//宣告建構子
//	public InkBrush() {
//		super();
//	}
	public InkBrush(String band, double price) {
		super(band, price);
	};

	//override價格方法
	@Override
    public void getPrice() {
    	System.out.println("price is:" + (price*0.8) );
	}
	
	//實作抽方法write
	public void write() {
		System.out.println("沾墨之後, 方可書寫");
	}
	
	

}
