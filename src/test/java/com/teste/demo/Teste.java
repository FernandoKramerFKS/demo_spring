package com.teste.demo;

import com.teste.demo.calculo.CalculoVetor;

public class Teste {

	public static void main(String[] args) {
	
		int a = 200;
		char b = 'i';
		
		int c = new CalculoVetor().CalcularVetor(a, b);
		System.out.println(c);

	}

}
