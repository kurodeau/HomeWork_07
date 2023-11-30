package HomeWorkExt.hwhero;

public abstract class Hero implements MoveAble, DdefendAble, AttackAble{
	// 省略 getter/setter...
	
	//宣告變數, 因為省略 getter/setter... 跳無使用提醒不理
	private String name;
	private int level;
	private double exp;
	
	//宣告建構子, 包含預設資料
	public Hero() {
		this("David", 1, 0);
	}
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	//實作介面, 宣告各種預設值
	public void attack() {
		System.out.println("預設攻擊");
	};
	public void move() {
		System.out.println("預設移動");
	};
	public void defend() {
		System.out.println("預設防禦'");
	};
}
