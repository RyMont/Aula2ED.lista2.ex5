package controller;

import javax.swing.JOptionPane;

public class MDCController {
	
	public int calculaMDC(int a, int b) {
		if (a == b) {
			return a;
		}
		if (a > b) {
			return calculaMDC(a-b, b);
		}
		else {
			return calculaMDC(b, a);
		}
		
	}
	
	public int recebeValor() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		return num;
	}
}
