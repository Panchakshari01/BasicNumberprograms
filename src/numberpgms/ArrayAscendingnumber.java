package numberpgms;

public class ArrayAscendingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {1,2,5,8,90,76,-1,0,55};
		int temp=0;
		for(int x=0;x<array.length;x++)
		{
			for(int y=x+1;y<array.length;y++)
			{
				if(array[x]>array[y]) 
				{
					temp=array[x];
					array[x]=array[y];
					array[y]=temp;
				}
			}
		}
		for(int x=0;x<array.length;x++)
		{
			System.out.println(array[x]);
		}
	}

}
