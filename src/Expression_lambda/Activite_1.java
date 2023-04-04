package Expression_lambda;
import java.util.ArrayList;

public class Activite_1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("banana");
		list.add("apple");
		list.add("kiwi");

		// trier la liste par ordre alphabétique
		list.sort((String x1, String x2) -> x1.compareToIgnoreCase(x2));

		// afficher la liste triée à l’écran.
		list.forEach(x -> System.out.println(x));
	}

}
