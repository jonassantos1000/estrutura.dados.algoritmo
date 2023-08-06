package controller;

import model.Aluno;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Aluno> listaAluno = new Lista<Aluno>();

		for (int i = 0; i < 10; i++) {
			Aluno aluno1 = new Aluno(Long.valueOf(i), "teste aluno");
			listaAluno.add(aluno1);
		}

		listaAluno.remove(0);
	}

}
