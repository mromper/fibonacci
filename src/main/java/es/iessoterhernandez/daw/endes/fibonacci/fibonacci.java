package es.iessoterhernandez.daw.endes.fibonacci;

public class fibonacci {
	private int numero;

	public fibonacci(int numero) {
		this.numero = numero;
	}

	public void calculoFibonacci() {
		int n1 = 1, n2 = 1;
		System.out.print(n1 + " ");
		for (int i = 2; i <= numero; i++) {
			System.out.print(n2 + " ");
			n2 = n1 + n2;
			n1 = n2 - n1;
		}
	}
}
