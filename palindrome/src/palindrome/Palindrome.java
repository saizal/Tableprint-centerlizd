package palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the num");
	int no=s.nextInt();
	int temp=no;
	int sum=0;
	while(no>0);
	{
		int r=no%10;
	    sum =sum*10+r; 
		no=no/10;
	}
	if(temp==sum)
			{
		System.out.println("is palindrome number"+no);
			}
		else
		{
			System.out.println(" is not palindrome"+no);
			
		}
			}
	}

