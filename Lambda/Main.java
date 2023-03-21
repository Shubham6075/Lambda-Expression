package Lambda;

public class Main {
	public static void main(String[] args) {
		System.out.println("My System Starts....");

		// 1 : create separate class and implements this interface
		MyInter myInter = new MyInterImpl();
		myInter.sayHello();


     /*
      2 : anonymous class for implementing interface

		MyInter i = new MyInter() {
			@Override
			public void sayHello(){
				System.out.println("this is first anonymous class");
			}
		};
		i.sayHello();

		MyInter i2 = new MyInter() {
			@Override
			public void sayHello() {
				System.out.println("this is my second anonymous class");
			}
		};
		i2.sayHello();

		*/

        // 3. using our interface with lambda expression
          MyInter i = ()->{
	          System.out.println("this is first time i am using lambda");
          };
		  i.sayHello();

		  MyInter i2 = ()->{
			  System.out.println("this is second time i am using lambda");
		  };
		  i2.sayHello();

		  SumInter sumInter = (int a, int b)->{
			  return a+b;
		  };
		System.out.println(sumInter.sum(2,6));
		System.out.println(sumInter.sum(6,8));

        LengthInter lengthInter = str -> str.length();
		System.out.println("Length of String : " +lengthInter.getLength("Shubham Rathee"));


	}
}
