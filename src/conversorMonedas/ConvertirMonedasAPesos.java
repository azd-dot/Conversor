package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 826.29;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Chilenos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 907.76;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Chilenos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 1059.2;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Chilenos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 5.92;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Chilenos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.64;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Chilenos");
	}
}
