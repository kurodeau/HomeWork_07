package HomeWorkExt.hwpen;

public class Pencil extends Pen{
	
	//宣告建構子
	public Pencil(String band, double price) {
		super(band, price);
	};

	//override價格方法
	@Override
    public double getPrice() {
    	System.out.println("price is:" + (super.getPrice()*0.9) );
    	return super.getPrice();
	}
	
	//實作抽方法write
	public void write() {
		System.out.println("削皮之後, 方可書寫");
	}
}
