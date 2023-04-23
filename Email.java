package emailapplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String companyEmail;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private int defaultLength = 10;
	private String company = "wns.com";
	
	//Constructor
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		// call the method for department
		this.department = setDepartment();
		// call the method for email
		this.companyEmail = setEmail();
		//call the method for password
		this.password = setPassword(defaultLength);
		//printing password
		System.out.println("Password: "+password);
		
	}
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("Department codes: \n1. Sales\n2. Development\n3. Accounting \n4. none\nEnter a code:");
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		if(code == 1) {this.department = "sales";}
		else if(code == 2) {this.department = "devs";}
		else if(code ==3) {this.department = "accounts";}
		else this.department="";
		return department;
		
	}
	//Create password
	private String setPassword(int length)
	{
		String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%?&1234567890";
		char [] password = new char[length];
		for(int i = 0; i < length; i ++)
		{
			int rand = (int)(Math.random()*passSet.length());
			password[i]=passSet.charAt(rand);
		}
		return new String (password);
	}
	//Create default email address
	private String setEmail()
	{
		this.companyEmail = firstName+"."+lastName+"@"+department+"."+company;
		return companyEmail;
	}
	//In case to change the password
	private void changePassword(String password) {
		this.password = password;}
	//to change the mailbox capacity
	private void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//to set the alternate email
	private void setAlternateEmail(String email) {
		this.alternateEmail = email;
	}
	//to show the info
	public String showInfo()
	{
		return "Name: "+firstName+" "+lastName+"\nEmail id: "+companyEmail+"\nMailbox Capacity:"+mailboxCapacity;
	}
	
	
	

}
