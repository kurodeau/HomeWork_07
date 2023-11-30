package HomeWorkExt.hwpen;

public abstract class Pen {
	
	String band;
	double price;
	
	//宣告建構方法, 並予以多型輸入
	public Pen(String band, double price) {
		super();
		this.band = band;
		this.price = price;
	}
	public Pen(String band) {
		this(band, 0.0);
	}
	public Pen(double price) {
		this("沒輸入品牌", price);
	}	
	public Pen() {
		this("沒輸入品牌", 0.0);
	}	
	
	//宣告對變數讀寫方法
	public void setBand(String band) {
		this.band = band;
	}
	public void setPrice(double price) {
		if ( price>0 ) {
			this.price = price;
		}
	}
    public void getBand() {
    	System.out.print("這個牌子是:" + band); 
    }
    public void getPrice() {
    	System.out.print("這個價格是:" + price);
    }    
	
    //設計抽象方法write
    public abstract void write();
    
}