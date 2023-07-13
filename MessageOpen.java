package Gmail;
import java.util.Scanner;

public class MessageOpen implements Messages
{

	Scanner scn=new Scanner(System.in);
	
	public void inbox()
	{
		System.out.println("1-HRmanager\n2-naukrialert\n3-avast\n4-preeti\n5-zomato\n6-atlassian\n7-hireclap");
		String click=scn.next();
		if("HRmanager".equals(click)) 
		{
			System.out.println("naukrialerts@naukri.com\nYou last updated your profile on 2023-05-03. Updated profiles appear on top of recruiter search");
		}
		else if("naukrialert".equals(click)) 
		{
			System.out.println("Hey Sabari s ,\nGenpact  is actively hiring. Kindly share the following details and updated resume to apply for the job and increase your chances of getting an interview call");
		}
		else if("avast".equals(click)) 
		{
			System.out.println("avast need to scan ur pc plz go through it");
		}
		else if("preeti".equals(click)) 
		{
			System.out.println("preeti023@naukri.com\\nYou last updated your profile on 2023-05-03. Updated profiles appear on top of recruiter search");
		}
		else if("zomato".equals(click)) 
		{
			System.out.println("noreply@mailers.zomato.com-\nWe'd like to take you out");
		}
		else if("atlassian".equals(click)) 
		{
			System.out.println("This is a quick email to remind you of the upcoming renewal\n for the following products on (shabari-student.atlassian.net).\n Your products will be renewed on May 20, 2023");
		}
		else if("hireclap".equals(click)) 
		{
			System.out.println("Manipal and ICICI Securities present an amazing opportunity\nto become a Relationship Manager at ICICI Securities. ");
		}
		
	}

	
	public void Starred() 
	{
		System.out.println("1-alufit\n2-madhura\n3-moni\n4-vignesh\n5-manish\n6-sraddha\n7-anuradha");
		String click=scn.next();
		if("alufit".equals(click)) 
		{
			System.out.println("delivery date is at 04-11-2022 ,complete the procedure and take the vehicle");
		}
		else if("madhura".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("moni".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("vignesh".equals(click)) 
		{
			System.out.println("naukrialerts@naukri.com\\nYou last updated your profile on 2023-05-03. Updated profiles appear on top of recruiter search");
		}
		else if("manish".equals(click)) 
		{
			System.out.println("i have sent my resume to you sir just go through once  ");
		}
		else if("sraddha".equals(click)) 
		{
			System.out.println(" i have sent my resume to you sir just go through once");
		}
		else if("anuradha".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride sir -shankari@royalenfield.com ");
		}
		
		
	}

	
	public void social()
	{
		System.out.println("1-facebook\n2-instagram\n3-youtube\n4-tiktok\n5-jio\n6-hotstar\n7-netflix");
		String click=scn.next();
		if("facebook".equals(click)) 
		{
			System.out.println("madhura has sent u a message plz just look once ");
		}
		else if("instagram".equals(click)) 
		{
			System.out.println("madhura has sent u a message in instagram  plz just look once ");
		}
		else if("youtube".equals(click)) 
		{
			System.out.println("plz look through this link-https://www.youtube.com/watch?v=7NK_JOkuSVY ");
		}
		else if("tiktok".equals(click)) 
		{
			System.out.println("just watch this video once  ");
		}
		else if("jio".equals(click)) 
		{
			System.out.println("jio is offering u a gift voucher just look once ");
		}
		else if("hotstar".equals(click)) 
		{
			System.out.println("u need to suscribe the channel last date is on 05-08-2024 ");
		}
		else if("netflix".equals(click)) 
		{
			System.out.println("u need to suscribe the channel last date is on 15-09-2024  ");
		}
		
	}

	
	
	
	
	
	public void promotions() 
	{
		System.out.println("1-croma\n2-shine\n3-naukri\n4-RE\n5-bookmyshow\n6-jio\n7-tiktok");
		String click=scn.next();
		if("croma".equals(click)) 
		{
			System.out.println("delivery date is at 04-11-2022 ,complete the procedure and take the vehicle");
		}
		else if("shine".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("naukri".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("RE".equals(click)) 
		{
			System.out.println("naukrialerts@naukri.com\\nYou last updated your profile on 2023-05-03. Updated profiles appear on top of recruiter search");
		}
		else if("bookmyshow".equals(click)) 
		{
			System.out.println("i have sent my resume to you sir just go through once  ");
		}
		else if("jio".equals(click)) 
		{
			System.out.println(" i have sent my resume to you sir just go through once");
		}
		else if("tiktok".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride sir -shankari@royalenfield.com ");
		}
		
	}

	
	public void spam()
	{
		System.out.println("1-lara\n2-julie\n3-babyh**\n4-****me\n5-*ot\n6-k**sb**y\n7-nu***");
		String click=scn.next();
		if("lara".equals(click)) 
		{
			System.out.println("today night i have offering u a party tickets lets we both go and stay thr itself");
		}
		else if("julie".equals(click)) 
		{
			System.out.println("today night i have offering u a party tickets\n lets we both go and stay thr itself ");
		}
		else if("babyh**".equals(click)) 
		{
			System.out.println("plz check my profile waiting for ur message ");
		}
		else if("****me".equals(click)) 
		{
			System.out.println(" plz check my profile waiting for ur message ");
		}
		else if("*ot".equals(click)) 
		{
			System.out.println("plz check my profile waiting for ur message lets go out spend time with eachother ");
		}
		else if("k**sb**y".equals(click)) 
		{
			System.out.println("plz check my profile waiting for ur message lets go out spend time with eachother ");
		}
		else if("nu***".equals(click)) 
		{
			System.out.println("plz check my profile waiting for ur message lets go out spend time with eachother  ");
		}
	}
	
	public void sent() 
	{
		System.out.println("1-royalenfield\n2-RE\n3-yamaha\n4-naukrialert\n5-madhura\n6-monitha\n7-shankari");
		String click=scn.next();
		if("royalenfield".equals(click)) 
		{
			System.out.println("delivery date is at 04-11-2022 ,complete the procedure and take the vehicle");
		}
		else if("RE".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("yamaha".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride ");
		}
		else if("naukrialert".equals(click)) 
		{
			System.out.println("naukrialerts@naukri.com\\nYou last updated your profile on 2023-05-03. Updated profiles appear on top of recruiter search");
		}
		else if("madhura".equals(click)) 
		{
			System.out.println("i have sent my resume to you sir just go through once  ");
		}
		else if("monitha".equals(click)) 
		{
			System.out.println(" i have sent my resume to you sir just go through once");
		}
		else if("shankari".equals(click)) 
		{
			System.out.println("your bike has been delivered enjoy the ride sir -shankari@royalenfield.com ");
		}
		
		
	}
	 
	   

	
	
	

}
