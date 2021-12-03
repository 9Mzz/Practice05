package com.javaex.ex08;

public class Account {

	//필드
    private String accountNo;
    private int balance;
	
    
    //생성자 작성
    public Account() {
    	
    }
    public Account(String accountNo) {
    	this.balance = 0;
	}

    //필요한 메소드 작성
    //메소드g/s
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
    
    
    //메소드
	public int deposit(int money) {
		balance = balance + money;
		return balance;
	}
	public int withdraw(int money) {
		balance = balance - money;
		return balance;
	}
	public void showBalance() {
		System.out.println(balance);
	}
    
    
}