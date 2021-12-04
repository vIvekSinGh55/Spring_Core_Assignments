package com.question4;

import org.springframework.stereotype.Service;


public interface BankAccountService {
	
	public double withdraw(long accountld, double balance);
	public double deposit(long accountld, double balance);
	public double getBalance(long accountld);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);

}