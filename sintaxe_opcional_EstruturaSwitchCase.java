import java.util.Scanner;

public class sintaxe_opcional_EstruturaSwitchCase {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		//Estrutura switch-case
		//Quando se tem várias opções de fluxo a serem tratadas com base no 
		//valor de uma variável, ao invés de várias estruturas if-else encadeadas, 
		//alguns preferem utilizar a estrutura switch-case.
		
		//Sintaxe do switch-case
		//switch ( expressão ) {
		
		//case valor1:
		//comando1
		//comando2
		//break;
		
		//case valor2:
		//comando3
		//comando4
		//break;
		
		//default:
		//comando5
		//comando6
		//break;
		//}
		
		//Problema exemplo
		//Fazer um programa para ler um valor inteiro de 1 a 7 representando um 
		//dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
		//Escrever na tela o dia da semana correspondente, conforme exemplos.
		
		//Entrada:1 Saída: Dia da semana: domingo
		//Entrada:4 Saída: Dia da semana: quarta
		//Entrada:9 Saída: Dia da semana: valor inválido
		
		Scanner sc = new Scanner(System.in);
		
		//OPÇÃO 1 COM ESTRUTURA IF-ELSE
		
		int x = sc.nextInt();
		
		String dia;
		
		if (x == 1) {
		dia = "domingo";
		}
		else if (x == 2) {
		dia = "segunda";
		}
		else if (x == 3) {
		dia = "terca";
		}
		else if (x == 4) {
		dia = "quarta";
		}
		else if (x == 5) {
		dia = "quinta";
		}
		else if (x == 6) {
		dia = "sexta";
		}
		else if (x == 7) {
		dia = "sábado";
		}
		else {
		dia = "valor inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
		
		//OPÇÃO 2 COM ESTRUTURA SWITCH-CASE
		
		int y = sc.nextInt();
		
		String day;
		
		switch (y) {
		case 1:
			day = "domingo";
		break;
		case 2:
			day = "segunda";
		break;
		case 3:
			day = "terca";
		break;
		case 4:
			day = "quarta";
		break;
		case 5:
			day = "quinta";
		break;
		case 6:
			day = "sexta";
		break;
		case 7:
			day = "sábado";
		break;
		default:
			day = "valor inválido";
		break;
		}
		System.out.println("Dia da semana: " + day);
		
		sc.close();

	}

}
