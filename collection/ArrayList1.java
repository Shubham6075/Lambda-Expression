package Collections1;
import java.util.ArrayList;
public class ArrayList1 {
	public static void main(String[] args) {

		ArrayList<String> Name = new ArrayList<String>();
		// adding names
		Name.add("Shubham");
		Name.add("Naveen");
		Name.add("Ravi");
		System.out.println(Name);

		// adding other
		Name.add("Sumit");
		System.out.println(Name);
		// adding at any index
		Name.add(1,"Manav");
		System.out.println(Name);

		//removing name from index
		Name.remove(1);
		System.out.println(Name);

		// set name at specific index
		Name.set(1,"Ankur");
		System.out.println(Name);

		// get name from specific index
		System.out.println(Name.get(0));

		// clearing array at once
		Name.clear();
		System.out.println(Name);

	}
}
