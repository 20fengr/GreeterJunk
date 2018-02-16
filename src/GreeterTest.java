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
		
		Greeter[] greets = new Greeter[6];
		for (int j = 0; j < 6; j ++) {
			greets[j] = new Greeter();
		}
		for (Greeter temp : greets) {
			System.out.println(temp.toString());
		}
	}
}
