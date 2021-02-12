package com.br.classes.git;

public class Motocicleta extends Veiculo {
	private String cilindrada;

	@Override
	public void setPotencia(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getPotencia() {
		return this.cilindrada;
	}

}
