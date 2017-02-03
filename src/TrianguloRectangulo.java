
public class TrianguloRectangulo {
	//atributos
	private double cateto1;
	private double cateto2;
	//constructor
	public TrianguloRectangulo(double cateto1, double cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	//c�lculo de la hipotenusa
	public double calcularHipotenusa(){
		return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
	}
	//c�lculo del �rea
	public double calcularArea(){
		return cateto1 * cateto2 / 2.0;
	}
	//c�lculo del per�metro
	public double calcularPerimetro() {
		return cateto1 + cateto2 + calcularHipotenusa();		
	}
	@Override
	public String toString() {
		return "TrianguloRectangulo: "+cateto1+", "+cateto2+", "+Math.round(calcularHipotenusa()*100.0)/100.0;
	}
}
