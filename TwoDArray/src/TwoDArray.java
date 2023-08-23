import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of classes and students : ");
		int arr[][]= new int[scan.nextInt()][scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the marks of student "+(j+1)+" of class "+(i+1)+" :");
				arr[i][j]=scan.nextInt();			
			}
		}
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("marks of student " +(j+1)+ " of class " +(i+1)+ ":"+arr[i][j]);
			}
		}
		scan.close();
	}
	
	

}
