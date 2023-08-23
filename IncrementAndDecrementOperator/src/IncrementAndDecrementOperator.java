
public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preIncrement();
		postIncrement();
		preDecrement();
		postDecrement();
		
	}
	
	static void preIncrement() {
		int a = 10;
		//pre-increment
		++a;
		System.out.println(a);
	}

	static void postIncrement() {
		int a = 10;
		//post-increment
		a++;
		System.out.println(a);
	}
	
	static void preDecrement() {
		int a = 10;
		//pre-decrement
		--a;
		System.out.println(a);
	}
	
	static void postDecrement() {
		int a = 10;
		//post-decrement
		a--;
		System.out.println(a);
	}
}
