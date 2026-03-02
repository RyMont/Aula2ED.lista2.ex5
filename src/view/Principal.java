package view;

import controller.MDCController;

public class Principal {
	public static void main(String[] args) {
		MDCController mdc = new MDCController();
		int num1, num2, resultado;
		
		num1 = mdc.recebeValor();
		num2 = mdc.recebeValor();
		
		resultado = mdc.calculaMDC(num1, num2);
		System.out.print("O MDC entre " +num1 +" e " +num2 +" é: " +resultado);
	}
}
