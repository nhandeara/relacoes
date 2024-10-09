package Relacoes_classes.associao;

public class Main {

	public static void main(String[] args) {
		Universidade universidaded = new Universidade ("USP");
		
		Estudante estudante = new Estudante("joao", universidade);
		
		System.out.println("Estudante: "+ estudante.getNome()+"\nUniversidade: " + universidade.getNome());

	}

}
