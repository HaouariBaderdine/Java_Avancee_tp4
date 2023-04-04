package Stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class Activite_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).forEach(x -> System.out.println(x));

		Integer somme = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).mapToInt(Integer::intValue).sum();

		System.out.println("La somme est : " + somme);
	}
}
