package conversorDeDivisas;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void convertirPesoArgentinoAdolarUsa(double valor) {
		
		double dolarUsa = valor * 0.0058 ;
		dolarUsa = (double) Math.round(dolarUsa * 100)/100;
		JOptionPane.showMessageDialog(null,"Pesos a Dolares\n"+"$ "+valor + " = " + "USD "+dolarUsa );
		
	}
	
	public void convertirPesoArgentinoAeuro(double valor) {
		
		double euro = valor * 0.0054;
		euro = (double) Math.round(euro * 100d)/100;
		JOptionPane.showMessageDialog(null,"Pesos a Euros\n"+"$ "+valor + " = " +"€"+euro);
		
	}
	
	public void convertirPesoArgentinoAlirasEsterlinas(double valor) {
		
		double lirasEsterlinas = valor * 0.0047;
		lirasEsterlinas = (double) Math.round(lirasEsterlinas * 100d)/100;
		JOptionPane.showMessageDialog(null,"Pesos a Liras Esterlinas\n"+"$ "+valor + " = "+"£"+lirasEsterlinas);
		
	}
	
	public void convertirPesoArgentinoAyen(double valor) {
		
		double yen = valor * 0.79;
		yen = (double) Math.round(yen * 100d)/100;
		JOptionPane.showMessageDialog(null,"Pesos a Yen Japones\n"+"$ "+valor + " = "+ "¥" + yen);
		
	}
	
	public void convertirPesoArgentinoAwon(double valor) {
		
		double won = valor * 7.64;
		won = (double) Math.round(won * 100d)/100;
		JOptionPane.showMessageDialog(null,"Pesos a Won Sur Coreano\n"+ "$ "+valor + " = " + "₩" + won);
		
	}
	
	// ------------------------------------------------------------------------------- //
	
	public void convertirDolasUsaApesosArgentinos(double dolar) {
		
		double peso = dolar / 0.0058;
		peso = (double) Math.round(peso * 100d)/100;
		JOptionPane.showMessageDialog(null,"Dolar Americano a Pesos\n"+ "U$D "+dolar + " = " + "$ "+peso );
		
	}
	
	public void convertirEurosApesosArgentinos(double euro) {
		
		double peso = euro / 0.0054;
		peso = (double) Math.round(peso * 100d)/100;
		JOptionPane.showMessageDialog(null,"Euros a Pesos\n"+ "€ "+euro + " = " + "$" + peso);
		
	}
	
	public void convertirLiraEsterlinaApesosArgentinos(double liraEsterlina) {
		
		double peso = liraEsterlina / 0.0047;
		peso = (double) Math.round(peso * 100d)/100;
		JOptionPane.showMessageDialog(null,"Liras Esterlinas a Pesos\n"+ "£ "+liraEsterlina + " = " + "$ "+peso);
		
	}
	
	public void convertirYenApesosArgentinos(double yen) {
		
		double peso = yen / 0.79;
		peso = (double) Math.round(peso * 100d)/100;
		JOptionPane.showMessageDialog(null,"Yen Japones a Pesos\n"+ "¥ "+yen+ " = " + "$ "+peso );
		
	}
	
	public void convertirWonApesosArgentinos(double won) {
		
		double peso = won / 7.64;
		peso = (double) Math.round(peso * 100d)/100;
		JOptionPane.showMessageDialog(null,"Won Sur Coreano a Pesos\n"+ "₩ "+won+ " = " + "$ "+peso);
		
	}
	
	


}
