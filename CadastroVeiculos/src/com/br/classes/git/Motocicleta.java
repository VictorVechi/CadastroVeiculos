package com.br.classes.git;

public class Motocicleta extends Veiculo{
	private String cilindradas;
	
	
	
	@Override
	public void setPotencia(String potencia) {
		// TODO Auto-generated method stub
		this.cilindradas = potencia;
	}

	@Override
	public String getPotencia() {
		// TODO Auto-generated method stub
		return this.cilindradas;
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
		dados += "Nº de Portas:" + this.getnPortas()+"\n";
		dados += "Cilindadras (cc):"+this.getPotencia();
		return dados;
	}
	
	
}
