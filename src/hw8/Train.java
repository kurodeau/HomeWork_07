package hw8;

import java.util.*;

public class Train implements Comparable<Train>{

	//宣告類別變數
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	//宣告建構子
	public Train() {
		super();
	}
	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	//宣告GS方法
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//改寫hashCode, equals, toString, compartor
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	public int compare(Train t1, Train t2) {
		if ( t1.number == t2.number ) {	
			return (0);
		}
		else if(t1.number >= t2.number) {
			return (1);
		}
		else {
			return (-1);
		}
	}
	public int compareTo(Train t) {
        // 按照 id 進行比較
        return Integer.compare(this.number, t.number);
    }
	
	
}
