package com.teste.demo.calculo;

public class CalculoVetor {
	
	public int CalcularVetor(int valor, char opcao) {

		int[] va = new int[11];
		
		for (int i = 1; i < va.length; i++) {
			if(i % 3 == 0) {
				va[i] = (int) Math.round(i * 0.3 * valor);
			}else {
				va[i] = (int) Math.round(i * 0.1 * valor);
			}
		}
		
		int soma = 0;
		
		if(opcao == 'p') {
			for (int i = 1; i < va.length; i++) {
				if(i % 2 == 0) {
					soma += va[i];
				}				
			}
		}else if(opcao == 'i'){
			for (int i = 1; i < va.length; i++) {
				if(i % 2 != 0) {
					soma += va[i];
				}
			}
		}
		return soma;	
	}

}
