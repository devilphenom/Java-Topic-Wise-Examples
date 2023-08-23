import java.util.Scanner;
public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Names of your 10 Employees : ");
		String arr[] = new String[10];
		for (int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.next();
		}
		System.out.print("First Names of your 10 Employees are : ");
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}
		scan.close();
	}

}
