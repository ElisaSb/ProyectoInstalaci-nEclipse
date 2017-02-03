import javax.swing.JOptionPane;

public class TestTrianguloRectangulo {
	public static void main(String[] args) {
		//creamos un objeto TrianguloRectangulo
		String inputCateto1 = JOptionPane.showInputDialog("Inserta para el cateto 1");
		String inputCateto2 = JOptionPane.showInputDialog("Inserta para el cateto 2");
		TrianguloRectangulo t = new TrianguloRectangulo(Double.parseDouble(inputCateto1), Double.parseDouble(inputCateto2));
		//System.out.println(t);
		//System.out.printf("Hipotenusa: %.2f\n�rea: %.2f\nPer�metro " + "%.2f\n", t.calcularHipotenusa(), t.calcularArea(), t.calcularPerimetro());
		String mensaje = "Hipotenusa " + t.calcularHipotenusa()+"\n"+"�rea: "+t.calcularArea()+"\n"+"Per�metro: "+t.calcularPerimetro();
		JOptionPane.showMessageDialog(null, t, "Triangulo Rect�ngulo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mensaje, "Triangulo Rect�ngulo", JOptionPane.INFORMATION_MESSAGE);
	}

}
