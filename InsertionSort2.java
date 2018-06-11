class Dcoder
{
	public static void main(String args[])
	{
		int[] intarray={20,35,-15,7,55,1,-22};
		
		int i;
		for(int FirstUnsortedIndex=1;FirstUnsortedIndex<intarray.length;FirstUnsortedIndex++)
		{
			int newelement=intarray[FirstUnsortedIndex];

			for(i=FirstUnsortedIndex;i>0 && intarray[i-1]>newelement;i--)
			{
				intarray[i]=intarray[i-1];
			}
			intarray[i]=newelement;
		}
		for(i=0;i<intarray.length;i++)
		{
			System.out.println(intarray[i]);
		}
	}
}