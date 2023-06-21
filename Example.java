package ExceptionHandling;

import java.util.Scanner;

public class Example {
	public static void main(String[] args){
		System.out.println("Started......");
		Scanner scanner = new Scanner(System.in);
		try {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			System.out.println("We have got two numbers ......");
			int result = n1 / n2;
			System.out.println("Result :" + result);
		}catch(ArithmeticException e){
			System.out.println("n2 can't be 0 !!");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("Error !! ");
			System.out.println(e.getMessage());
		}finally{
			// always executed
			System.out.println("I am in finally block");
			System.out.println("Closing all the resources ...");
		}
		System.out.println("Terminated...");

	}
}
