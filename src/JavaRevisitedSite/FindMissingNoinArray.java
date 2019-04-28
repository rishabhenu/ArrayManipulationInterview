package JavaRevisitedSite;

public class FindMissingNoinArray {
	static int count=0;
	public static void main(String args[])
	{
		FindMissingNoinArray obj=new FindMissingNoinArray();
		int[] input= {1,2,3,4,5,6,0,7,8,9,10};
		
		Object o[]=obj.findMissingNo(input, 0);
		
		System.out.println(o[1]);
		
		if((boolean)o[1])
		{
			System.out.println("element is found at index : "+o[0]);
		}
		else System.out.println("element is not found");
		
	}
	
	Object[] findMissingNo(int[] a,int b)
	{
		int[] temp=orderArray(a);
		int initial=0,end=a.length;
		int middle=0;
		Object[] o= {0,false};
		
		for(int i=0;i<a.length;i++)
		{
			middle=(initial+end)/2;
			count++;
			
			if(a[middle]>b)
			{
				end=middle;
//				end--;
			}
			else if(a[middle]<b)
			{
				initial=middle;
//				initial++;
			}
			else if(a[middle]==b)
			{
				o[0]=middle;
				o[1]=true;
				return o;
			}			
		}
		
		return o;
	}
	
	int[] orderArray(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				temp=a[i];
				a[i]=smaller(a[i],a[j]);
				a[j]=greater(temp,a[j]);
			}
		}
		return a;
	}
	
	int greater(int a,int b)
	{
		return (a<b)?b:a;
	}
	
	int smaller(int a, int b)
	{
		return (b<a)?b:a;
	}
}
