package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String department="",genEmail,genPassword;
		char[] password;
		System.out.println("Please enter the department from the following");
		System.out.println(" 1.Technical\n 2.Admin\n 3.Human Resource\n 4.Legal\n");
		Scanner scanchoice=new Scanner(System.in);
		choice=scanchoice.nextInt();
		switch(choice){
			case 1:
				department="tech";
				break;
			case 2:
				department="admin";
				break;
			case 3:
				department="hr";
				break;
			case 4:
				department="legal";
				break;
			default:
				System.out.println("Enter a valid option");
				scanchoice.close();
				System.exit(-1);
				}
		Employee emp=new Employee("Harshit","Choudary");
		CredentialService service=new CredentialService();
		genEmail=service.generateEmailAddress(emp.getFirstName(),emp.getLastName(),department);
		password=service.generatePassword();
		genPassword=new String(password);
		service.showCredentials(emp.getFirstName(),genEmail,genPassword);
		scanchoice.close();
	}	
}
