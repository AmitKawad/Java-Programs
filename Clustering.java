/* K means Clustering algorithm in Java*/







import java.util.*;
import java.lang.Math;
public class Clustering
{
		public static void main(String args[])
		{
			int m1,m2;
			int summ1=0,summ2=0,j=0,i=0;
			double avg1,avg2=0;
			int k=0;
			
			
			ArrayList<Integer> cluster1 = new ArrayList<Integer>();  /*Array list for cluster since the number of 
											elements are not deterministic*/
			ArrayList<Integer> cluster2 = new ArrayList<Integer>();
			int[] myarray={3, 6, 10, 16, 19, 23, 30, 11, 25};       // Observations
			int random=(int)(Math.random()*8);                      //Generate Random number in the range of size of the array//
			
			int random2=(int)(Math.random()*8);
			while(random==random2)
			{
				random=(int)(Math.random()*8);		/* If both the random numbers generated happen to be 
									the same,keep
									generating a pair of random numbers until they are distinct*/
										
				random2=(int)(Math.random()*8);
			}
			
			m1=myarray[random];				/*Assign the random number needed for the algorith
									to the index of the array by using the random number
									generated above*/
			m2=myarray[random2];

			System.out.println(m1);					//RANDOM ELEMENTS from the Array//
			System.out.println(m2);

			 for(i=0;i<myarray.length;i++)			/* Run a loop for the entire length of the  
			 							array and compare every element 
										with both the random numbers generated 
											from the array*/
			 {
			 		int sum1=Math.abs(myarray[i]-m1);
			 		int sum2=Math.abs(myarray[i]-m2);
			 		if(sum1<=sum2)
			 		{
			 			cluster1.add(myarray[i]);		/*Determine if the element belongs
											to cluster1 or cluster2 */
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

			 	int size1=cluster1.size();				//determine the size of the cluster
			 	int size2=cluster2.size();

			 	for(i=0;i<size1;i++)
			 	{
			 		summ1=summ1+cluster1.get(i);
			 		

			 	}
			 	
			 	for(i=0;i<size2;i++)
			 	{
			 		 summ2=summ2+cluster2.get(i);
			 	}
			 	avg1=(double)summ1/size1;
			 	avg2=(double)summ2/size2;
			 	System.out.println("Average of cluster 1 is "+avg1);		/* print averages of both 
												clusters*/
			 	System.out.println("Average of cluster 2 is "+avg2);
			 	
			 	


		}
}
