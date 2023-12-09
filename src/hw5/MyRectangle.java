package hw5;

public class MyRectangle {
		
		private double width;
		private double depth;
		
		//宣告建構子
		MyRectangle(){};
		MyRectangle(double width, double depth){
			this.width = width;
			this.depth = depth;			
		};
		
		//SG方法
		public void setWidth(double width){
			this.width = width;
		}; 
		public void setDepth(double depth){
			this.depth = depth;
		}; 	
		public double getWidth(double width){
			return width;
		};
		public double getDepth(double depth){
			return depth;
		};
		
		//宣告方法getArea能計算該長方形的面積
		public double getAreadouble (){
			double product = width* depth;
			return product;
		}; 	
	
}
