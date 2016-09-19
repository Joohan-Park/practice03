package prob2;

public class Account {
	String accountNO;
	int balance;
	
	//생성자
	public Account(String accountNO){
		this.accountNO=accountNO;
		System.out.println(this.accountNO+" 계좌가 개설되었습니다.");
	}

	//setter getter
	public String getAccountNo() {
		return accountNO;
	}

	public void setAccountNo(String accountNO) {
		this.accountNO = accountNO;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//메소드
	public void save(int balance){
		System.out.println(this.accountNO+"계좌에 "+balance+"만원이 입금되었습니다.");
		this.balance+=balance;
		
	}
	
	public void deposit(int balance){
		System.out.println(this.accountNO+"계좌에 "+balance+"만원이 출금되었습니다.");
		this.balance-=balance;
	}
	
}
