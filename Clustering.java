import java.util.*;
import java.lang.Math;
public class Clustering
{
		public static void main(String args[])
		{
			int m1,m2;
			int summ1=0,summ2=0,j=0,i=0;
			double avg1,avg2;
			int k=0;
			
			
			ArrayList<Integer> cluster1 = new ArrayList<Integer>();
			ArrayList<Integer> cluster2 = new ArrayList<Integer>();
			int[] myarray={3, 6, 10, 16, 19, 23, 30, 11, 25};
			int random=(int)(Math.random()*8);
			
			int random2=(int)(Math.random()*8);
			while(random==random2)
			{
				random=(int)(Math.random()*8);
				random2=(int)(Math.random()*8);
			}
			
			m1=myarray[random];
			m2=myarray[random2];

			System.out.println(m1);
			System.out.println(m2);

			 for(i=0;i<myarray.length;i++)
			 {
			 		int sum1=Math.abs(myarray[i]-m1);
			 		int sum2=Math.abs(myarray[i]-m2);
			 		if(sum1<=sum2)
			 		{
			 			cluster1.add(myarray[i]);
			 			j++;
			 		}
			 		else
			 		{
			 			cluster2.add(myarray[i]);
			 			k++;
			 		}

			 } 
			 System.out.println("printing cluster 1");
			 System.out.println(cluster1);
			 System.out.println("Printing cluster 2");
			 System.out.println(cluster2);

			 	int size1=cluster1.size();
			 	int size2=cluster2.size();

			 	for(i=0;i<size1;i++)
			 	{
			 		summ1=summ1+cluster1.get(i);
			 		

			 	}
			 	
			 	for(i=0;i<size2;i++)
			 	{
			 		 summ2=summ2+cluster2.get(i);
			 	}
			 	avg1=(summ1/size1);
			 	avg2=(summ2/size2);
			 	System.out.println("Average of cluster 1 is "+avg1);
			 	System.out.println("Average of cluster 2 is "+avg2);
			 	
			 	


		}
}