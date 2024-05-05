package numberpgms;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner So=new Scanner(System.in);
		int num,rev=0,rem=0;
		System.out.println("Enter any number");
		num=So.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("the reverse of the number is "+rev);
	}

}
