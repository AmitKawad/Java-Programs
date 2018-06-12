public class ShellSort
{
	public static void main(String args[])
	{
		int[] intarray={20,35,-15,7,55,1,-22};
		int i,j;
		int gap;
		int newelement;

		for(gap=intarray.length/2;gap>0;gap=gap/2)
		{
			for(i=gap;i<intarray.length;i++)
			{
				newelement=intarray[i];
				j=i;
				while(j>=gap&& intarray[j-gap]>newelement)
				{
					intarray[j]=intarray[j-gap];
					j=j-gap;
				}
				intarray[j]=newelement;
			}
		}
		for(i=0;i<intarray.length;i++)
		{
			System.out.println(intarray[i]);
		}
	}
}