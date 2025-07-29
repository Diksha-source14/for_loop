package forLoop;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int num =6;
		for(int i =1;i<=num;i++) {
			fact = fact*i;
		}//end for
		System.out.println(fact);
	}//end main

}//end class
