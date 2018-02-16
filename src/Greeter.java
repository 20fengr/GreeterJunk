
public class Greeter {
private int age;
private String name;
public Greeter() {
	age = 16;
	name = "riley";
}
public Greeter (String xname, int xage) {
	name = xname;
	age = xage;
}
public String toString() {
	return "Age: " + age + "Name: " + name;
}

}
