package com.question3;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository
{
	private void BankAccRepositoryImpl()
	{
		
		BankAccount bankaccount = new BankAccount();
		bankaccount.setAccountHolderName("Hk");
		bankaccount.setAccountId(1);
		bankaccount.setAccountType("Savings");
		bankaccount.setAccountBalance((long) 200052);


	}
}
