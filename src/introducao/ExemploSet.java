package introducao;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("Dados da Collection: " + setFrutas);
		
		for (String fruta: setFrutas) {
			if(fruta != null) {
				System.out.println("A posição de " + fruta + " é: " + fruta.hashCode());
			}
		}
	}

}
