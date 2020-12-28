package com.br.classes.git;

public class Carro extends Veiculo{
	private String cavalos;//cp
	
	
	@Override
	public void setPotencia(String potencia) {
		// TODO Auto-generated method stub
		this.cavalos = potencia;
	}

	@Override
	public String getPotencia() {
		// TODO Auto-generated method stub
		return this.cavalos;
	}

}
