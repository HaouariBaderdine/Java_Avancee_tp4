package Interface_lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class Exmple_2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("banana");
		list.add("apple");
		list.add("kiwi");

		Function<String, Integer> et = s -> s.length();

		list.stream().map(s -> et.apply(s)).forEach(s -> System.out.println(s));
		;

	}

}
