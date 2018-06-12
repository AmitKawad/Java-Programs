import java.util.*;
public class SelectionSort
{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int[] myarray=new int[10];
		int lastunsortedindex,i,j;
		System.out.println("Enter the elements");
		for(i=0;i<10;i++)
		{
			myarray[i]=scan.nextInt();
		}
		for(lastunsortedindex=myarray.length-1;lastunsortedindex>0;lastunsortedindex--)
		{
			int largest=0;
			for(i=1;i<=lastunsortedindex;i++)
			{
				if(myarray[i]>myarray[largest])
				{
					largest=i;
				}
			}
			swap(myarray,largest,lastunsortedindex);
		}

		for(i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
	}
	public static void swap(int[] array,int i, int j)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}