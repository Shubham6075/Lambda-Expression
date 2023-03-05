package Collections1;

import java.util.LinkedList;

public class LinkedList1 {

		public static void main(String[] args) {

			LinkedList<String> Name = new LinkedList<String>();
			// adding names
			Name.add("Shubham");
			Name.add("Naveen");
			Name.add("Ravi");
			System.out.println(Name);

			// adding other at first
			Name.addFirst("Sumit");
			System.out.println(Name);
			// adding other at last
			Name.addLast("Mohit");
			System.out.println(Name);
			// adding at middle
			Name.add(1,"Manav");
			System.out.println(Name);

			//removing name from index from starting : also can write Name.removeFirst()
			Name.remove();
			System.out.println(Name);

			// removing name from middle
			Name.remove(0);
			System.out.println(Name);

			// remove name from last
			Name.removeLast();
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
