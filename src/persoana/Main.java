package persoana;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Persoana[] persoane = { new Persoana("Pop", "Ana", 12), new Persoana("Copescu", "Anastasia", 20),
				new Persoana("Topovici", "AnaMaria", 38) };

		for (int i = 0; i < persoane.length; i++) {
			System.out.println(persoane[i].nume);

		}
		Arrays.sort(persoane);

		for (int i = 0; i < persoane.length; i++) {
			System.out.println(persoane[i].nume);

		}

	}

}
