package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class BankBalance {


	/* In real time u are having bussiness usecase where u need to write a method to check the 
	 * balance of a user.
	 * But u need to ensure proper logging statements are maintained and authorized user and tranaction open,close etc
	 * What if u have 10 or more bussiness usecases like this where logging code is required in each 
	 * and every method then u need to write the logic in all methods or need to write a single 
	 * method and need to call in all places both are time consuming and redundant code. 
	 * 
	 * U can use Aspect Oriented programming.
	 */	
	public void showBalance(int a) {
		System.out.println("Your bank balance is ...");
		//int a1=10/0;
	}
	
	public void transferBalance(String acc1,String acc2) {
		System.out.println("Transferring amount from "+acc1+" to "+acc2+"...");
	}
}
