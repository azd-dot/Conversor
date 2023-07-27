package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Chilenos a Dólar", "De Pesos Chilenos a Euro", "De Pesos Chilenos a Libras","De Pesos Chilenos a Yen","De Pesos Chilenos a Won Coreano","De Dólar a Pesos Chilenos", "De Euro a Pesos Chilenos", "De Libras a Pesos Chilenos","De Yen a Pesos Chilenos","De Won Coreano a Pesos Chilenos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}
