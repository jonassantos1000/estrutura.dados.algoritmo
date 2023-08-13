package controller;

import model.Aluno;
import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(Long.valueOf(1), "teste aluno");
		
		//Testando Fila
		
		/*
		 * Lista<Aluno> listaAluno = new Lista<Aluno>();
		 * 
		 * for (int i = 0; i < 10; i++) { 
		 * Aluno aluno1 = new Aluno(Long.valueOf(i),
		 * "teste aluno"); listaAluno.add(aluno1); }
		 * 
		 * listaAluno.remove(0);
		 */
		
		//Testando Pilha
		
		/*
		 * Pilha<Aluno> pilhaAluno = new Pilha<Aluno>(2); pilhaAluno.push(aluno);
		 * pilhaAluno.push(aluno);
		 * 
		 * pilhaAluno.pop(); pilhaAluno.pop();
		 */
		
		
	}

}
