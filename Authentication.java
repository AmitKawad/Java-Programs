import java.util.Scanner;
import java.io.*;
 public class Authentication
{
	public static void main(String args[])
	{	
		
		 String password;
		 
		 
		System.out.println("Enter the password");
		System.out.println("The password must contain 1 capital letter,1small letter,1 special character and the length of the password must br greater than 8");
		Scanner scan=new Scanner(System.in);
		password=scan.nextLine();

		
		ValidatePassword v1=new ValidatePassword();
		v1.vali(password);
		
		
		
		
	}
}
class ValidatePassword
{
	public void vali(String password)
	{
		
		int  small=0;
		 int cap=0;
		 int specialchar=0;
		 int num=0;
		int length=0;

		for(int x=0;x<password.length();x++)
		{
			if(password.charAt(x)>47 && password.charAt(x)<58)
				num++;
			
			if(password.charAt(x)>64 && password.charAt(x)<91)
				cap++;

			if(password.charAt(x)>93 && password.charAt(x)<123)
				small++;

			if(password.charAt(x)>32 && password.charAt(x)<48)
					specialchar++;

			if(password.charAt(x)>57 && password.charAt(x)<65)
			{
				specialchar++;
			}

				length++;

		}
		if(num<1 || cap<1 || small<1|| specialchar<1|| length<8)
			{
				System.out.println("Password not valid");
				
			}
			else
			
			{
				
				System.out.println("your password"+password+"is valid");
				try
				{
					FileWriter fw=new FileWriter("password.txt");
					fw.write(password);
					fw.close();
				}
				catch(Exception e )
				{
					System.out.println(e);
				}

				

				
			}
		


		
	}
}