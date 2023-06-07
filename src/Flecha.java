import javax.swing.JOptionPane;

class Flecha {
	int longitud;
	String direccion;
	String Color;

	public void ingresarDatos() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha:"));
		direccion = JOptionPane.showInputDialog("Hacia que lado ira la flecha:");
		Color = JOptionPane.showInputDialog("Ingrese el color de la flecha:");
	}

	public void dibujarFlecha() {
		String flecha = "";
		if (direccion.equalsIgnoreCase("izquierda")) {
			flecha += "<";
		} 

		for (int i = 1; i <= longitud; i++) {
			flecha += "-";
		}
		
		if (direccion.equalsIgnoreCase("derecha")) {
			flecha += ">";
		}
		if (Color.equalsIgnoreCase("Negro")) {
			System.out.println(flecha);			
		} else {
			System.err.println(flecha);
		}
	}
}