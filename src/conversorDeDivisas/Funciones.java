package conversorDeDivisas;

import javax.swing.JOptionPane;

public class Funciones {
	
	ConvertirMoneda monedas = new ConvertirMoneda();
	
	public void convertirMoneda(double valor) {
		
		String opcion = JOptionPane.showInputDialog(null, "Seleccionar una Opcion", "Monedas",
				JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Peso a Dólar", "Peso  a Euros","Peso a Libras Esterlinas",
						"Peso a Yen Japonés","Peso a Won Sur Coreano","Dolar a Peso","Euros a Peso",
						"Libras Esterlinas a Peso","Yen Japonés a Peso","Won Sur Coreano a Peso",
						}, "Seleccion").toString();
		
		switch (opcion) {
		case "Peso a Dólar": {
			monedas.convertirPesoArgentinoAdolarUsa(valor);
			break;
		}
		case "Peso  a Euros":{
			monedas.convertirPesoArgentinoAeuro(valor);
			break;
		}
		case "Peso a Libras Esterlinas":{
			monedas.convertirPesoArgentinoAlirasEsterlinas(valor);
			break;
		}
		case "Peso a Yen Japonés":{
			monedas.convertirPesoArgentinoAyen(valor);
			break;
		}
		case "Peso a Won Sur Coreano":{
			monedas.convertirPesoArgentinoAwon(valor);
			break;
		}
		
		case "Dolar a Peso":{
			monedas.convertirDolasUsaApesosArgentinos(valor);
			break;
		}
		
		case "Euros a Peso":{
			monedas.convertirEurosApesosArgentinos(valor);
			break;
		}
		
		case "Libras Esterlinas a Peso":{
			monedas.convertirLiraEsterlinaApesosArgentinos(valor);
			break;
		}
		
		case "Yen Japonés a Peso":{
			monedas.convertirYenApesosArgentinos(valor);
			break;
		}
		
		case "Won Sur Coreano a Peso":{
			monedas.convertirWonApesosArgentinos(valor);
			break;
		}
		

		}
		
	}
}











