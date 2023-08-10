import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		System.out.println(" enter your age");
		int age=scan.nextInt();
		if( age>=18)
		{
			System.out.println(" you are eligible for voting");
		}
		else
		{
			System.out.println(" your are not eligible for voting");
		}
	}

}
