package ExceptionHandling;

public class Number_Format_Exception_Ex {
	public static void main(String args[])
	{
		try{
			int num=Integer.parseInt ("XYZ") ;
			System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println("Number format exception occurred");
		}
	}
}
