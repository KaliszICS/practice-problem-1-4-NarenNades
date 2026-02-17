/**
	* Lesson: Input
	* Author: Naren Nades
	* Date Created: February 9, 2023
	* Date Last Modified: February 17, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("What is your name: ");
		word = input.nextLine();
		System.out.println(word);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		int num1;
		System.out.print("Input a whole number: ");
		num1 = input.nextInt();
		System.out.println(num1*2+2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double num2;
		System.out.print("Input a radius: ");
		num2 = input.nextDouble();
		System.out.println(2*3.14*num2);
		System.out.println(3.14*num2*num2);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String name1;
		String name2;
		int age;
		System.out.print("Input a first name: ");
		name1 = input.nextLine();
		System.out.print("Input a last name: ");
		name2 = input.nextLine();
		System.out.print("Input an age: ");
		age = input.nextInt();
		System.out.println(name2+", "+name1+" - "+age);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Input a name: ");
		name = input.nextLine();
		System.out.print("Input an age: ");
		age = input.nextInt();
		int iq = age;
		age = age+3;
		System.out.println(name + age+"\n" + iq);
	}

}
