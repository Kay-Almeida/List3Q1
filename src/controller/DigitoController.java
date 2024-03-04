package controller;

public class DigitoController {
	public DigitoController() {
		super();
	}

	public int FuncaoDG(int n, int aux) {
		// Condição de parada dada por conta da operação recursiva ir diminuindo n até
		// ele não ter mais digitos
		if (n == 0) {
			return 0;
		} else {
			// a função diminui uma casa decimal (multiplicando o aux por 10) a cada chamada
			// e soma 1 a ela mesma para a contagem de digitos
			n = n - (n % aux);
			return 1 + FuncaoDG(n, aux * 10);

		}
	}

}
