package hoidanit;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Name");
		String name = scanner.nextLine();
		System.out.println("Input Score");
		int score = scanner.nextInt();
		System.out.println(name + " có điểm = " + score);
		scanner.close();
	}
}
