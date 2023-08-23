import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Persons : ");
		int personCount = scan.nextInt();
		boolean arr[]= new boolean[personCount];
		for (int i=0;i<=personCount-1;i++) {
			System.out.print("Enter the Merital Status of person "+(i+1)+" true for married and false for not married : ");
			arr[i] = scan.nextBoolean();
		}
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.println("marital status of person "+(i+1)+" is : "+arr[i]);
		}
		scan.close();
	}
}
