package HomeWorkExt.hwpen;

public abstract class Pen {
	
	private String band;
	private double price;
	
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
    public String getBand() {
    	return band;
    }
    public double getPrice() {
    	return price;
    }    
	
    //設計抽象方法write
    public abstract void write();
    
}