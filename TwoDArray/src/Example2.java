import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[][]= new int [4][];
		for (int i=1;i<=arr.length;i++) {
			System.out.println("Enter the number of Students in "+i+" class : ");
			arr[i-1]=new int[scan.nextInt()];
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the age of the "+(j+1)+" Student who is form class "+(i+1)+" :");
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the age of the "+(j+1)+" Student who is form class "+(i+1)+" is :"+arr[i][j]);
			}
		}	
	scan.close();
	}
}
