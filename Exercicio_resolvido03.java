import java.util.Scanner;

public class Exercicio_resolvido03 {

	public static void main(String[] args) {
		
		// ESTRUTURA CONDICIONAL
		
		//Fazer um programa para ler tr�s n�meros inteiros. Em seguida, mostrar qual o
		//menor dentre os tr�s n�meros lidos. Em caso de empate, mostrar apenas uma vez.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (x < y && x < z) {
		System.out.println("MENOR = " + x);
		}
		else if (y < z) {
		System.out.println("MENOR = " + y);
		}
		else {
		System.out.println("MENOR = " + z);
		}
		
		sc.close();
	
	}

}
