package ifelse.ladder;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		System.out.println(" enter your marks");
		int marks= scan.nextInt();
		 Score s1= new Score();
		 s1.givegrade( marks);
	}
}
		

