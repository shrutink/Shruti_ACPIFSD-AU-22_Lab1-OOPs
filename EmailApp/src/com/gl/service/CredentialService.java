package com.gl.service;

import java.util.Random;
	
public class CredentialService {
	
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".abc.com";
		return email;
	}
	
public   char[] generatePassword() 
{
	int length = 8;
    String symbol = "-/.^&*_!@%=+>)"; 
    String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    String small_letter = "abcdefghijklmnopqrstuvwxyz"; 
    String numbers = "0123456789"; 


    String finalString = cap_letter + small_letter + 
            numbers + symbol; 

    Random random = new Random(); 

    char[] password = new char[length]; 

    for (int i = 0; i < length; i++) 
    { 
        password[i] = 
                finalString.charAt(random.nextInt(finalString.length())); 

    } 
	return password;
	
}
public void showCredentials(String firstName,String email,String password) {
	System.out.println("Dear "+firstName+ " your generated credentials are as follows");
	System.out.println("Email --->"+email);
	System.out.println("Password --->" +password);
}
}
