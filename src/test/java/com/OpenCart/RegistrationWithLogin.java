package com.OpenCart;

import com.BaseClass.Browser;

public class RegistrationWithLogin extends Browser {

	public static void main(String[] args) {
		
		chrome_launch();
		open_URL("https://demo.opencart.com");
		Registration.TC_Registration_001();
		LogIn.Login_TC_001();
 
	}

}
