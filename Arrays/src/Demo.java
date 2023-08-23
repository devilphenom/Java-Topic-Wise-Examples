import java.util.Scanner;
public class Demo {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the Array Elements : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Array Contents are : " );
		for(int i=0;i<=arr.length-1;i++) {
			 System.out.print(arr[i]+ " ");
		}
		scan.close();
	}
}
