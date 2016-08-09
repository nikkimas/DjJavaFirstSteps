import java.util.Scanner;

class apples{
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.print("Enter first num: ");
		fnum = bucky.nextDouble();
		System.out.print("\n\nEnter second num: ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.print(answer);
	}
}