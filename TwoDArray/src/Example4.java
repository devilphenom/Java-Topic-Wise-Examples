import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numebr of Games : ");
		int arr[][] = new int[scan.nextInt()][];
		for (int i = 0 ;i<=arr.length-1;i++) {
			System.out.println("Enter the number of palyers in Game "+(i+1)+" : ");
			arr[i]= new int[scan.nextInt()]; 
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the score of Player "+(j+1)+" in Game "+(i+1)+" : ");
				arr[i][j]= scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("The score of Player "+(j+1)+" in Game "+(i+1)+" is : "+arr[i][j]);
			}
		}
	}

}
