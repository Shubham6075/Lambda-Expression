package ExceptionHandling;

public class Index_Out_Of_Bond_Ex {
	public static void main(String args[])
	{
		try{
			String str="beginnersbook";
			System.out.println(str.length());
			char c = str.charAt(40);
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException.");
		}
	}
}
