package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste{

	public static void main(String[] args) {
		
		List<Cartelas> teste  = new ArrayList<Cartelas>();
		
		
		//Cartelas a1 = new Cartelas();
		
		Apostador a = new Apostador();
		
		for (int i = 0; i <= 20; i++) {
			teste.add(new Cartelas(i));
			
			Collections.shuffle(teste);
		}
		
		List<Object> list2 = teste.stream().limit(5).collect(Collectors.toList());

		System.out.println(teste);
		
		System.out.println(list2);
		
		System.out.println("teste git");
	}

}
