import java.util.Scanner;
public class threeDAyyar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of School : ");
		int arr[][][] = new int[scan.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of class in School "+(i+1)+" : ");
			arr[i]= new int[scan.nextInt()][]; 
		}
		
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the number of students in class "+(j+1)+" of School "+(i+1)+" :");
				arr[i][j] = new int[scan.nextInt()];
			}
		}
		for(int i = 0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Enter the marks of Student "+(k+1)+" of class "+(j+1)+" from School "+(i+1)+" :");
					arr[i][j][k] = scan.nextInt();				}
			}
		}

	
	for(int i = 0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			for(int k = 0;k<=arr[i][j].length-1;k++) {
				System.out.print(arr[i][j][k]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("--------------------");
	}

}

}
