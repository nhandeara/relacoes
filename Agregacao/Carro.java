package Relacoes_classes.Agregacao;

public class Carro {
	
	private String modelo;
	private Motor motor; // Agregação
	
	public Carro(String modelol, Motor) {
		
		this.modelo = modelo;
		this.motor = motor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
