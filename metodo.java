import java.util.Scanner;

public class metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valorA;
int valorB;
int resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa valor de A");
		valorA = entrada.nextInt();
		
		System.out.println("Ingresa valor de B");
		valorB = entrada.nextInt();
		
		resultado = sumarNumero(valorA, valorB);
		System.out.println(resultado);
		
	}

	public static int sumarNumero(int a, int b) {
		int c = 0;

		c = a + b;

		return c;
	}
}
