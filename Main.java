 package Gmail;

import java.util.Scanner;

public class Main
{
	

	public static void main(String[] args)
	{
		MessageOpen m=new MessageOpen();		

		Scanner scn=new Scanner(System.in);
		System.out.println("welcome to gmail\nlog-in\n");
		System.out.println("gmail Id-_______\npassword-______ ");
		String id=scn.next();
		String password=scn.next();
		if(id.equals(Gmail.gmailID) && password.equals(Gmail.password)) 
		{
			System.out.println("welcome  "+Gmail.gmailID);
			
			System.out.println("\n1-inbox\n2-starred\n3-social\n4-promotions\n5-spam\n6-sent\n7-compose");
			String message=scn.next();
			if("inbox".equals(message)) 
			{
				m.inbox();
			}
			else if("starred".equals(message)) 
			{
				m.Starred();
			}
			else if("social".equals(message)) 
			{
				m.social();
			}
			else if("promotions".equals(message)) 
			{
				m.promotions();
			}
			else if("spam".equals(message)) 
			{
				m.spam();
			}
			else if("sent".equals(message)) 
			{
				m.sent();
			}
			else if ("compose".equals(message))
			{
				System.out.println("to_______");
				String to=scn.next();
				System.out.println("subject_______(its a optional)\nyes\nno");
				String subject=scn.next();
				if("yes".equals(subject)) 
				{
					
					System.out.println("subject-______");
					String yes=scn.next();
					
				}
				System.out.println("message-______");
				String mail=scn.next();
				System.out.println("send\nyes\nno");
				String sending=scn.next();
				if("yes".equals(sending)) 
				{
					System.out.println("the mail has been sent to "+to);
				}
				
				
				
				
			}
		}
		else 
		{
			System.out.println("wrong password");
		}
		System.out.println("\ndo u want to logout your account\nyes\nno");
		String logout=scn.next();
		if("yes".equals(logout)) 
		{
			System.out.println("your account has been logged out");
		}
		else 
		{
			System.out.println("the account remains same");
		}
		
		
		
		
	}

}
