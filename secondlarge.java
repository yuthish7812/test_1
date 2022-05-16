package array;

public class secondlarge {
	public static void main(String  arg[])
	{
		int list[]= {10,20,30,40,50,60,70};
		int max1 = 0;
		int max2 = 0;
		for(int i=0;i<list.length;i++)
		{
			if(max1 < list[i])
			{
				max2 = max1;
				max1 = list[i]; 
						
			}else if(max2 < list[i])
			{
				max2 = max1;
				
			}
			
		}
		System.out.println("1st max number is "+ max1 +",2nd max Number :"+max2);
		//System.out.print(max2);
	}

}
