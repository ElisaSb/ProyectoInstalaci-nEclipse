
public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generamos 10 números aleatorios
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		//generar 10 números enteros entre el 0 y el 100
		for (int i = 0; i < 100; i++) {
			int numero = (int) (Math.random() * 101);
			System.out.println(numero);
		}
	}

}
