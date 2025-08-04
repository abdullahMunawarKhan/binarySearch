import java.util.Scanner;

class Search
{
	static void BubbleSort(int A[])
	{
		int temp;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}	
	}
	
	static int binary(int A[],int right,int left,int x)
	{
		while(left<=right)
		{
			int mid=(right+left)/2;
			if(A[mid] == x)
			{
				return mid;
			}
			else if(A[mid]>x)
			{
				right=mid-1;			
			}
			else
			{
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int A[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of array :");
		
		// accepting values in array
		for(int i=0;i<A.length;++i)
		{
			A[i]=sc.nextInt();	
		}
		
		// printing values in array
		System.out.println("array before sorting");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println("");
		
		//sorting array
		BubbleSort(A);
		
		System.out.println("array after sorting");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		//binary search
		System.out.print("\nenter no. to be search :");
		int x=sc.nextInt();
		int right=A.length-1;
		int left=0;
	
		
		int a=binary(A,right,left,x);
		
		if(a== -1){
			System.out.println("element not found.");
		}else{
			System.out.println("element found");
		}
		sc.close();
		
	}
}

