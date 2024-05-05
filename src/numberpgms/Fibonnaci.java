package numberpgms;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0,y=1;
		int num1=0;
		System.out.println(x);
		System.out.println(y);
		for(int a=1;a<=10;a++)
		{
			num1=x+y;
			x=y;
			y=num1;
			System.out.println(num1);
		}
	}

}
