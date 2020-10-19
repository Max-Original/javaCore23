package practise;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class AplicationFunctionalInterfaces {

	public static void main(String[] args) {

		Predicate<Integer> isPositive = x -> x > 0;
		System.out.println(isPositive.test(5));
		System.out.println(isPositive.test(-1));

		BinaryOperator<Integer> multyply = (x, y) -> x * y;
		System.out.println(multyply.apply(5, 5));

		UnaryOperator<Integer> square = x -> x * x;
		System.out.println(square.apply(5));

		Function<Integer, String> convert = x -> String.valueOf(x) + "$";
		System.out.println(convert.apply(1000));

		Consumer<Integer> printer = x -> System.out.printf("%d $ \n", x);
		printer.accept(200);

		Supplier<User> userFactory = () -> {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter user name");
			String name = in.next();
			return new User(name);
		};

		User user1 = userFactory.get();
		User user2 = userFactory.get();

		System.out.println("user1 name = " + user1.getName());
		System.out.println("user2 name = " + user2.getName());

	}

}

class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
};