import java.util.Scanner;

public class IngresoPorTeclado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese algo:");
		String linea = teclado.nextLine();
		System.out.println(linea);
		double d = teclado.nextDouble();
		System.out.println(d);
	}
}
