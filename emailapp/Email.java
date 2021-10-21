package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength =10;
	private String department;
	private int mailboxCap = 1000;
	private String altEmail;
	private String email;
	private String companySuff = "company.com";
	Scanner in = new Scanner(System.in);
	//constructor to receive first and last name.
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call method asking for department
		this.department = setDepartment();
		System.out.println("Department picked: " + this.department);
		
		//call method for constructing and returning random password
		this.password = setPassword(defaultPasswordLength);
		System.out.println("Random Password: " + this.password);
		
		//combine elements to get make email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@ARMC" + department + "." + companySuff;
		System.out.println("Your e-mail is: " + email);
	}
	//ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nENTER DEPARTMENT CODE");
		//create scanner object to input 
		
		//ask for user input to determine department
		int depcho = in.nextInt();
		
		if (depcho == 1) {
			return "Sales";
		}
		else if(depcho == 2) {
			return "Development";
		}
		else if(depcho == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}
	//generate random password
	private String setPassword(int length) {
		//all the abilities we could choose from 
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!";
		char[] password = new char[length];
		//create a for loop to grab values and create random password
		for(int i = 0; i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set mailbox cap
	public int getMailboxCap() {
		return mailboxCap;
	}
	public void setMailboxCap(int mailboxCap) {
		this.mailboxCap = mailboxCap;
	}
	//set for alt email
	public String setAltEmail() {
		System.out.println("what is a safe email?");
		return altEmail = in.next();
	}
	public void getAltEmail(String altEmail) {
		System.out.println(altEmail);
	}
	//change password ability 
	public String changePassword() {
		return password;
	}
	public void setNewPassword(String password) {
		this.password = password;
	}
	//get method
	public String showInfo() {
		return "Your Info is: " + firstName + " " + lastName +
				"\nDispaly alternate EMAIL: " 	+ altEmail +
				"\nSHOW MAILBOX CAPACITY: " + mailboxCap + "mb";
				
	}
	
}
