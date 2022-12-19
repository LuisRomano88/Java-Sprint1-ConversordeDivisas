package conversorDeDivisas;

import javax.swing.JOptionPane;

import ConversorDeTemperatura.FuncionesTemperatura;

public class Principal {

	public static void main(String[] args) {

		Funciones monedasFunciones = new Funciones();
		Validaciones validaciones = new Validaciones();
		FuncionesTemperatura funcionesTemperatura = new FuncionesTemperatura();

		boolean menu = true;

		while (menu) {

			String opciones = JOptionPane
					.showInputDialog(null, "Seleccionar una Opcion", "Menu", JOptionPane.QUESTION_MESSAGE, null,
							new Object[] { "Conversor de Monedas", "Conversor de Temperatura", "Conversor de Medidas" },
							"Seleccion")
					.toString();

			switch (opciones) {
			case "Conversor de Monedas": {

				try {
					String input = JOptionPane.showInputDialog("Ingrese un valor");
					validaciones.validarIngresoDatos(input);
					double valor = Double.parseDouble(input);
					monedasFunciones.convertirMoneda(valor);

				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Dato Invalido", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;

			}
			case "Conversor de Temperatura":
				try {
					String input = JOptionPane.showInputDialog("Ingrese un valor");
					validaciones.validarIngresoDatos(input);
					double valor = Double.parseDouble(input);
					funcionesTemperatura.convertirTemperatura(valor);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Dato Invalido", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

			int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?", "CONFIRMAR",
					JOptionPane.YES_NO_OPTION);

			if (JOptionPane.YES_OPTION == seleccion) {

			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				menu = false;
			}
		}

	}

}
