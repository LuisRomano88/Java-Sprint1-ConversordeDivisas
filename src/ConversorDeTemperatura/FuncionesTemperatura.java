package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class FuncionesTemperatura {

	ConvertirTemperatura temperatura = new ConvertirTemperatura();

	public void convertirTemperatura(double valor) {

		String opcion = JOptionPane
				.showInputDialog(null, "Seleccionar una Opcion", "Temperaturas", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Celsius a Fahrenheit", "Fahrenheit a Celsius", }, "Seleccion")
				.toString();

		switch (opcion) {
		case "Celsius a Fahrenheit": {
			temperatura.convertirCelsiusAfahrenheit(valor);
			break;
		}
		case "Fahrenheit a Celsius": {
			temperatura.convertirFahrenheitAcelsius(valor);
			break;
		}
		}

	}
}
