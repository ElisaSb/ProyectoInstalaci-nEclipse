
public class TestPalabra {
	public static void main(String[] args) {
		String palabraPrueba = "luna ";
		Palabra palabra = new Palabra(palabraPrueba.trim());
		System.out.printf("%s\n", palabra);
		System.out.printf("Palabra en mayúscula: %s\n", palabra.convertirContenidoMayuscula());
		System.out.printf("Palabra en minúscula: %s\n", palabra.convertirContenidoMinuscula());	
		System.out.printf("Número de letras de la palabra: %d\n", palabra.contarLetras());
		System.out.printf("Primera letra de la palabra en minúscula: %c\n", palabra.devolverPrimeraLetraMinuscula());
		System.out.printf("Última letra de la palabra en mayúscula: %c\n", palabra.devolverUltimaLetraMayuscula());
		System.out.printf("Palabra reemplazada: %s\n", palabra.reemplazarLetrasContenido('u', 'Z'));
	}
}