import java.util.Scanner;
class NumberPattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		printPattern(n);	
	} 
	public static void printPattern(int n){
		int x=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.printf("%-5d",x); 	x++;
			}
			System.out.println();
		}
	}
}







