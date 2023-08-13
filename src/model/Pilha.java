package model;

import java.util.EmptyStackException;
import java.util.Objects;

public class Pilha<T> {

	private Object[] objects;
	private Integer posicaoAtual = 0;

	public Pilha(Integer tamanhoPilha) {
		if (Objects.isNull(tamanhoPilha) || tamanhoPilha < 1) {
			throw new IllegalArgumentException("Informe um tamanho valido para a pilha");
		}

		this.objects = new Object[tamanhoPilha];
	}

	public void push(T e) {
		if (isPilhaCheia()) {
			throw new IllegalArgumentException("Não foi possivel adicionar elemento, pois a pilha está cheia.");
		}

		objects[posicaoAtual++] = e;
	}

	public void pop() {
		if (isPilhaVazia()) {
			throw new IllegalArgumentException("Não foi possivel remover, pois a pilha está vazia.");
		}

		objects[--posicaoAtual] = null;
	}
	
	public T peek() {
		if (isPilhaVazia()) {
			throw new EmptyStackException();
		}
		
		return (T) objects[posicaoAtual - 1];
	}

	public boolean isPilhaVazia() {
		return (this.posicaoAtual - 1) < 0;
	}

	public boolean isPilhaCheia() {
		return this.objects.length == posicaoAtual;
	}

}
