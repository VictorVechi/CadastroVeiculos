package com.br.classes.git;

public class Carro extends Veiculo {
	private String cavaloVapor;
	private String porta;

	@Override
	public void setPotencia(String cavaloVapor) {
		this.cavaloVapor = cavaloVapor;

	}
	
	public String getPotencia() {
		return this.cavaloVapor;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getPorta() {
		return this.porta;
	}
}
