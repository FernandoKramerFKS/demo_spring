package com.teste.demo.modelo;

import java.io.Serializable;

public class ModeloVetor implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	private int valor;
	private char opcao;
	private int resposta;
	
	
	public ModeloVetor() {

	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public char getOpcao() {
		return opcao;
	}
	public void setOpcao(char opcao) {
		this.opcao = opcao;
	}
	public int getResposta() {
		return resposta;
	}
	public void setResposta(int resposta) {
		this.resposta = resposta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + valor;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloVetor other = (ModeloVetor) obj;
		if (valor != other.valor)
			return false;
		return true;
	}
	
}
