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

	@Override
	public String toString() {
		String dados = "Cor:" + this.getCor()+"\n";
		dados += "Ano de Fabricação:" + this.getAnoFabricacao()+"\n";
		dados += "Chassi:" + this.getChassi()+"\n";
		dados += "Marca:" + this.getMarca()+"\n";
		dados += "Modelo:" + this.getModelo()+"\n";
		dados += "Nº de Eixos:"+this.getnEixos()+"\n";
		dados += "Placa:" + this.getPlaca()+"\n";
		dados += "Nº de Portas:" + this.getnPortas();
		dados += "Cavalos de potência (cp):" + this.getPotencia();
		return dados;
	}

	
}
