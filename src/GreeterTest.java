import java.util.Scanner;

public class GreeterTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		String name = input.nextLine();
		System.out.println("Enter age");
		int age = input.nextInt();
		Greeter riley = new Greeter(name, age);

		System.out.println(riley.toString());
	}
}
