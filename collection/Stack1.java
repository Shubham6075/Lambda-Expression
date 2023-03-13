package Collections1;
import java.util.LinkedList;
import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {

		Stack<String> Name = new Stack<String>();   // LIFO operation used by stack
		// adding names
		Name.push("Shubham");
		Name.push("Naveen");
		Name.push("Ravi");
		System.out.println(Name);

		// removing names
		Name.pop();
		System.out.println(Name);
	}
}
