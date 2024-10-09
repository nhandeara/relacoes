package Relacoes_classes.Agregacao;

public class Principalagr {
public static void main(String[] args) {
		
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa("nhan");
		
		System.out.println("Empresa é: "+ empresa.getNome()+"\ndepartamento: "+departamento.getNome());

	}

}


