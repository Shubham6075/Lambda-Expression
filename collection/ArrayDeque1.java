package Collections1;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {

		ArrayDeque<String> Name = new ArrayDeque<>();   // FIFO operation
		// adding names
		Name.add("Shubham");
		Name.add("Naveen");
		Name.add("Ravi");

		System.out.println(Name);

		// removing names
		Name.remove();
		System.out.println(Name);
	}
}
