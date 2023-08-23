
public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1();
		example2();
		example3();
		example4();
	}
	static void example1() {
		int a = 10;
		int b;
		b= a++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("================================");
	}

	static void example2() {
		int a = 10;
		int b;
		b= ++a + ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("================================");
	}
	
	static void example3() {
		int a = 10;
		int b;
		b= a-- + --a + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("================================");
	}
	
	static void example4() {
		int a = 10;
		int b;
		b= --a + a++ + --a + a-- + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("================================");
	}

}
