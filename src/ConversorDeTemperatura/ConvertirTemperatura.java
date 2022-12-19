package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void convertirCelsiusAfahrenheit(double valor) {
		double celsius = valor * 1.8 + 32;
		celsius = (double) Math.round(celsius * 100)/100;
		JOptionPane.showMessageDialog(null,"Grados Celsius a Fahrenheit\n"+valor +"° C" + " = " + celsius+"° F"  );
	}
	
	public void convertirFahrenheitAcelsius(double valor){
		double fahrenheit = (valor - 32)/1.8;
		fahrenheit = (double) Math.round(fahrenheit * 100) / 100;
		JOptionPane.showMessageDialog(null, "Grados Fahrenheit a Celsius\n"+valor +"° F" + " = " + fahrenheit+"° C");
	}
	
}
