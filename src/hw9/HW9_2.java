package hw9;

import java.lang.Runnable;

public class HW9_2 {
	
	public static void main(String[] args) {
		BearAccount bearAccount = new BearAccount( 0 );
		System.out.println( "最初帳戶有:" + bearAccount.getAccountBalance() );
		System.out.println("============以下開始動作");
		System.out.println("");

		BearBig bearBig = new BearBig( bearAccount );
		BearMom bearMom = new BearMom( bearAccount );
		Thread bBig = new Thread( bearBig );
		Thread bMom = new Thread( bearMom );
		bBig.start();
		bMom.start();
	};
}

//建立雄大帳號類別
class BearAccount{
	private int accountBalance;
	public BearAccount(){};
	public BearAccount( int accountBalance ){
		setAccountBalance( accountBalance );
	};
	public int getAccountBalance(){
		return( accountBalance );
	};
	public void setAccountBalance( int accountBalance ){
		this.accountBalance = accountBalance;
	};
	
	//建立變數控制的提款方法, 不到2000 發出匯款通知, 不到提款金額停止行為
	synchronized public void withdraw( int money ){
		while( accountBalance <= money ){
			System.out.println("帳戶餘額低於:" + money + "，停止提款行為");
			try{ 
				wait();
				}
			catch( InterruptedException e ){
				e.printStackTrace();
			};
		};
		accountBalance -= money;
		System.out.println("本次提款:" + money + "，帳戶餘額:" + accountBalance);
		if( accountBalance <= 2000 ){
			System.out.println("帳戶餘額在:" + accountBalance + "以下，要求他媽匯款");
			notify();
		};
	};
	synchronized public void deposit( int money ){
		while( accountBalance > 3000 ){
			System.out.println("帳戶餘額:" + accountBalance );
			try {
				wait();
			}
			catch( InterruptedException e ){
				e.printStackTrace();
			}
//			finally{
//				System.out.println("進入finally");	
//			};
//			accountBalance += money;
//			System.out.println( "    雄大他媽匯了 2000, 現在餘額有: " + accountBalance );
//			if( accountBalance > 3000 ){
//				System.out.println("帳戶餘額:" + accountBalance + "，通知可以領錢");
//				notify();
//			};
		};
		accountBalance += money;
		System.out.println( "    雄大他媽匯了 2000, 現在餘額有: " + accountBalance );
		if( accountBalance > 3000 ){
			System.out.println("帳戶餘額:" + accountBalance + "，通知可以領錢");
			notify();
		};
	};
}

//雄大行為邏輯, 進行10次提款
class BearBig implements Runnable {
	BearAccount bearAccount;
	public BearBig( BearAccount bearAccount ){
		this.bearAccount = bearAccount;
	};
	public void run(){
		for( int i= 0; i<= 9; i++ ){
			bearAccount.withdraw( 1000 );
			System.out.println("============雄大動作第" + (i+1) + "次");
			System.out.println("");
		};
	};
}
//雄大他媽行為邏輯, 進行10次存款
class BearMom implements Runnable {
	BearAccount bearAccount;
	public BearMom( BearAccount bearAccount ){
		this.bearAccount = bearAccount;
	};
	public void run(){
		for( int i= 0; i<= 9 ;i++ ){
			bearAccount.deposit( 2000 );
			System.out.println("============雄大他媽動作第" + (i+1) + "次");
			System.out.println("");
		};
	};
}
