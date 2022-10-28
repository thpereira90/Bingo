package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cartelas {
	
	List<Integer> lista = Arrays.asList();
	private int numeroSerie;
	private int numerosCartela;
	private String q = "";

	public Cartelas(int i) {
		this.numerosCartela = i;
	}

	@Override
	public String toString() {
		return this.q + numerosCartela;
	}

	public List<Integer> getLista() {
		return lista;
	}
	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}
	
}