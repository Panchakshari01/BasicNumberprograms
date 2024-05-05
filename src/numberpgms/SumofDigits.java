package numberpgms;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner So=new Scanner(System.in);
		int num,sum=0,rem=0;
		System.out.println("Enter any Digits");
		
		num=So.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("the sum of digit is :"+sum);
	}

}
