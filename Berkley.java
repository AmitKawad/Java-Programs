//Berkley's Clock Synchronization Algorithm in Java.



import java.util.*;
import java.lang.Math;
public class Berkley
{
	public static void main(String args[])
	{
		int hr,min,sum=0;
		int n,i;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of Systems");
		n=scan.nextInt();
		int[] h=new int[n];
		int[] m=new int[n];
		int[] diff=new int[n];
		int[] hrs =new int[n];
		int random=(int)(Math.random()*n);


		System.out.println("Enter hours for each system");
		for(i=0;i<n;i++)
		{
			h[i]=scan.nextInt();
		}
		System.out.println("Enter minutes for each system");
		for(i=0;i<n;i++)
		{
			m[i]=scan.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println("time for System "+i+"is "+h[i]+":"+m[i]);
		}
		
		
		for(i=1;i<n;i++)									
		{
			if(h[i]<h[0])
			{
				diff[i]= (-1)*((60-m[i])+m[0]);
			}
			else
			{
				diff[i]=(-1)*(m[0]-m[i]);           
			}
			
			sum=sum+diff[i];

				
		}
		System.out.println("Sum is "+sum);
		
		int avg=Math.abs(sum/n);
		System.out.println("average is "+avg);

		
		m[0]=m[0]+avg;

		System.out.println("Time for System 0 is "+h[0]+":"+m[0]);
		for(i=1;i<n;i++)
		{
			m[i]=m[0];
			h[i]=h[0];
			System.out.println("time for System "+i+"is "+h[i]+":"+m[i]);
		}



	}

}





					/* OUTPUT
					time for System 0is 3:0
					time for System 1is 2:50
					time for System 2is 3:25
					Sum is 15
					average is 5
					Time for System 0 is 3:5
					time for System 1is 3:5
					ime for System 2is 3:5

					
					
					
					*/
