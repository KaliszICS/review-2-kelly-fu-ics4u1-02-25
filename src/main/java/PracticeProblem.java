import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String prompt;
		prompt = in.nextLine();
		System.out.print(prompt);
		System.out.println();

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num1;
		num1 = in.nextInt();
		in.nextLine();

		System.out.print("In: ");
		int num2;
		num2 = in.nextInt();
		in.nextLine();

		int quotient=num1/num2;
		int remainder=num1%num2;

		System.out.println(quotient);
		System.out.println(remainder);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String text=in.nextLine();
		System.out.print(text +" was the text you wrote");
		System.out.println();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num3;
		num3 = in.nextInt();
		in.nextLine();
		System.out.println(num3 * 5);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Boolean flag = in.nextBoolean();
		in.nextLine();
		System.out.print(flag + " is a boolean");
		System.out.println();
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Double num4;
		num4 = in.nextDouble();
		in.nextLine();
		System.out.print(num4 - 3.2);
		System.out.println();
	}

}
