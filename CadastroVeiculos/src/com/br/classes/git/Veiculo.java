package com.br.classes.git;

public abstract class Veiculo {
	private String cor;
	private String placa;
	private String nPortas;
	private String chassi;
	private String anoFabricacao;
	private String nEixos;
	private String marca;
	private String modelo;
	
	//getters and setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getnPortas() {
		return nPortas;
	}
	public void setnPortas(String nPortas) {
		this.nPortas = nPortas;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getnEixos() {
		return nEixos;
	}
	public void setnEixos(String nEixos) {
		this.nEixos = nEixos;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public abstract void setPotencia(String potencia);
	
	public abstract String getPotencia();	
}
