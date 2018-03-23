/* K means Clustering algorithm in Java*/






import java.util.*;
import java.lang.Math; 

class Dcoder
{
		public static void main(String args[])
		{
			int m1,m2,a,b;
			int summ1=0,summ2=0,j=0,i=0;
			int sum1,sum2;
			int m11=0,m22=0;
			double avg1,avg2=0,avgg1,avgg2;
			
			
			
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
			 		 sum1=Math.abs(myarray[i]-m1);
			 		sum2=Math.abs(myarray[i]-m2);
			 		if(sum1<=sum2)
			 		{
			 			cluster1.add(myarray[i]);
			 			
			 		}
			 		else
			 		{
			 			cluster2.add(myarray[i]);
			 			
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
			 	avg1=(double)summ1/size1;
			 	avg2=(double)summ2/size2;
			 	
			 	System.out.println("Average of cluster 1 is "+avg1);
			 	System.out.println("Average of cluster 2 is "+avg2);
			 	m1=(int)Math.round(avg1);
			 		m2=(int)Math.round(avg2);

			 		System.out.println("new m1 "+m1);
			 		System.out.println("new m2 "+m2);

			 	if(avg1!=m1 && avg2!=m2)
			 	do
			 	{
            			 size1=0;
			 	size2=0;
			 	summ1=0;
			 	summ2=0;
			 		cluster1.clear();
			 		cluster2.clear();
			 		
			 		
				 		for(i=0;i<myarray.length;i++)
				 		{
					 		 int sum3=Math.abs(myarray[i]-m1);
					 		 int sum4=Math.abs(myarray[i]-m2);
					 		if(sum3<=sum4)
					 		{
					 			cluster1.add(myarray[i]);
					 			
					 			
					 			
					 		}
					 		else
					 		{
					 			cluster2.add(myarray[i]);
					 			
					 			
					 		}


				 		} 
				 		a=m1;
				 		b=m2;
				 System.out.println("printing cluster 1");
				 System.out.println(cluster1);
				 System.out.println("Printing cluster 2");
				 System.out.println(cluster2);
				  size1=cluster1.size();
			 	 	size2=cluster2.size();

			 	for(i=0;i<size1;i++)
			 	{
			 		summ1=summ1+cluster1.get(i);
			 		

			 	}
			 	
			 	for(i=0;i<size2;i++)
			 	{
			 		 summ2=summ2+cluster2.get(i);
			 	}
			 	avgg1=(double)summ1/size1;
			 	avgg2=(double)summ2/size2;
			 	m1=(int)Math.round(avgg1);
			 		m2=(int)Math.round(avgg2);
			 		 
			 	
			 	System.out.println("Average of cluster 1 is"+avgg1);
			 	System.out.println("Average of cluster 2 is"+avgg2);
			 	System.out.println("new m1 "+m1);
			 	System.out.println("new m2 "+m2);

			 	

				 
				

			 	}
			 	while(m1!= a && m2!=b);
			 	
			 	
			 	


		}
}



				/* OUTPUT
				30
				19
				printing cluster 1
				[30, 25]
				Printing cluster 2
				[3, 6, 10, 16, 19, 23, 11]
				Average of cluster 1 is 27.5
				Average of cluster 2 is 12.571428571428571
				new m1 28
				new m2 13
				printing cluster 1
				[23, 30, 25]
				Printing cluster 2
				[3, 6, 10, 16, 19, 11]
				Average of cluster 1 is26.0
				Average of cluster 2 is10.833333333333334
				new m1 26
				new m2 11
				printing cluster 1
				[19, 23, 30, 25]
				Printing cluster 2
				[3, 6, 10, 16, 11]
				Average of cluster 1 is24.25
				Average of cluster 2 is9.2
				new m1 24
				new m2 9
				printing cluster 1
				[19, 23, 30, 25]
				Printing cluster 2
				[3, 6, 10, 16, 11]
				Average of cluster 1 is24.25
				Average of cluster 2 is9.2
				new m1 24
				new m2 9
				*/

    
