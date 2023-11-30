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
    public double getPrice() {
    	System.out.println("price is:" + (super.getPrice() *0.8) );
    	return super.getPrice();
	}
	
	//實作抽方法write
	public void write() {
		System.out.println("沾墨之後, 方可書寫");
	}
	
	

}
