package model.service;

import java.util.ArrayList;
import java.util.List;

public class ImprimeService<T> {
	List<T> lista = new ArrayList<>();

	public void adicionarValor(T valor) {
		lista.add(valor);
	}

	public T primeiro() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("Lista vazia!");
		}
		return lista.get(0);
	}

	public void imprimir() {
		System.out.print("[");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i = 1; i < lista.size(); i++) {
			System.out.print(",");
			System.out.print(lista.get(i));
		}
		System.out.print("]");
	}

}
