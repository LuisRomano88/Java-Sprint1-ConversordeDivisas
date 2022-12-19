package conversorDeDivisas;

public class Validaciones {
	
	public boolean validarIngresoDatos(String str) {
		return str != null && str.matches("[0-9]");
	}

}
