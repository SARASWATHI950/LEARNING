package demo;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println( " enter your score");
		int score= scan.nextInt();
		GradApp grade=new GradApp();
		grade.givegrade( score);
		
		
		
	}

}
