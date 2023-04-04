package Interface_lambda;

import java.util.function.IntPredicate;

@FunctionalInterface
interface Affichage {
	public void affichage_selectif(int[] tab, int x);
}

public class Exmple_1 {

	public static void main(String[] args) {

		int[] tab = { 1, 4, -2, 9, -3, 5, -3 };
		System.out.print("-- Les positifs de tab : ");

		affichage_selectif(tab, ee -> ee > 0);
	}

	private static void affichage_selectif(int[] tab, IntPredicate condition) {
		// TODO Auto-generated method stub
		for (int i = 0; i < tab.length; i++) {
			if (condition.test(tab[i])) {
				System.out.print(tab[i] + " ");
			}
		}
		System.out.println();
	}
}
