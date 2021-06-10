import java.util.*;

public class Ejercicio1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int matriz[];
		int size;
		int impares = 0;
		int pares = 0;
		System.out.println("Ingrese la cantidad de numeros que desa generar");
		size = scanner.nextInt();
		matriz = new int[size];
		System.out.println("Los numeros que se generaron son: ");
		for (int i = 0; i < size; i++) {
			matriz[i] = (int)(Math.random() * 100 + 1);
			System.out.println( ( i + 1 )+". " + matriz[i]);
		}
		for (int i = 0; i < size ; i++) {
			if (matriz[i]%2==0) {
				pares = pares+1;
			} else {
				impares = impares+1;
			}
		}
		System.out.println("La cantidad de numeros pares es: " + pares);
		System.out.println("La cantidad de numeros impares es: " + impares);
	}


}

