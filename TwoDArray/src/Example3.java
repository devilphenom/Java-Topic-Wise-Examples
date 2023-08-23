import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Banks :");
		String arr[][]= new String[scan.nextInt()][];
		for (int i=1;i<=arr.length;i++) {
			System.out.println("Enter the number of Customers in  Bank "+i+" : ");
			arr[i-1]=new String[scan.nextInt()];
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the Name of the "+(j+1)+" Customer who is form Bank "+(i+1)+" :");
				arr[i][j] = scan.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j = 0;j<=arr[i].length-1;j++) {
				System.out.println("Name of the "+(j+1)+" Customer who is form Bank "+(i+1)+" is :"+arr[i][j]);
			}
		}	
	scan.close();
	}
	}
