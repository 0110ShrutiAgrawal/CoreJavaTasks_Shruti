package com.hughes.exercises;

//i/p: vasu34k@gmail.com
//o/p: valid email id
// 
//i/p: bob34kgmail.com
//o/p:Invalid email id

/**
 * @author 91959
 *
 */
public class CheckValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "shruti@gmail.com";
		//If we don't check position
		
		 if(email.contains("@") && email.contains(".")) {
		 System.out.println("valid email");
		 }
		 else {
		 System.out.println("Not valid");
		 }

		//If we check position 
		if (!email.isEmpty() && email.contains("@") && email.indexOf('.') > email.indexOf('@')) {
			System.out.println("Valid email id");
		} else {
			System.out.println("Invalid email id");
		}
	}

}
