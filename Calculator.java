import java.util.Scanner;

class Calculator {

	public static int addNum(int n, int m) {
		return (n + m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number -> ");
		int n = sc.nextInt();
		System.out.print("Enter Second Number -> ");
		int m = sc.nextInt();
		int result = 0;
		System.out.println("Enter + for Addition");
		System.out.println("Enter - for Subtraction");
		System.out.println("Enter * for Multiplication");
		System.out.println("Enter / for Division");
		System.out.println("Enter % for Modulos");
		System.out.println("Enter Your Choice -> ");
		char c = sc.next().charAt(0);
		switch (c) {

			case '+': {
				result = addNum(n, m);
				System.out.println("Result is -> " + result);
			}
				break;

			// case '-' :{
			// result =subNum(n,m);
			// System.out.println("Result is -> "+result);
			// }
			// break;

			// case '*' : {
			// result =multiNum(n,m);
			// System.out.println("Result is -> "+result);
			// }
			// break;

			// case '/' : {
			// result =divNum(n,m);
			// System.out.println("Result is -> "+result);
			// }
			// break;

			// case '%' : {
			// result =modNum(n,m);
			// System.out.println("Result is -> "+result);
			// }
			// break;

			default:
				System.out.println("Invalid Input	");

		}

	}

}