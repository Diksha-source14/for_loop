package forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num =sc.nextInt();
			
			boolean flag = true;
			for(int i=2 ;i<num ;i++) {
				if(num % i==0) {
					flag = false;
				}//end if
				
			}//end for
			
			if(flag==true) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}//end if-else
		}//end while
		
	}//end main

}//end class
