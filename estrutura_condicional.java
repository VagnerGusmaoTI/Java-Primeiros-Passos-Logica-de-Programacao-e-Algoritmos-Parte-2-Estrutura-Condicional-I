import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//ESTRUTURA CONDICIONAL
		
		//É uma estrutura de controle que permite definir que um certo bloco de comandos
		//somente será executado dependendo de uma condição
		
		//Sintaxe da estrutura condicional
		
		//Simples:
		
		//if ( <condição> ) {
			//<comando 1>
			//<comando 2>
		//}

		//REGRA:
		//V: executa o bloco de comandos
		//F: pula o bloco de comandos
		
		int x = 10;
		
		System.out.println("Bom dia");
		
		if(x<0) {
			System.out.println("Boa tarde");
		}
		
		System.out.println("Boa noite");
		
		//Composta (ou de controle):
		
		//OBS: nunca colocar condição na frente do else
		
		//if ( <condição> ) {
			//<comando 1>
			//<comando 2>
			//}
			//else {
			//<comando 3>
			//<comando 4>
			//}
		
		//REGRA:
		//V: executa somente o bloco do if
		//F: executa somente o bloco do else
		
		int horas;
		
		System.out.println("\nQuantas horas?");
		
		horas = sc.nextInt();
		
		if(horas<12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		//E se eu tiver mais de duas possibilidades de condições?
		
		//Encadeamento de estruturas condicionais
		
		//OBS: nunca colocar condição na frente do else
		
		//if ( condição 1 ) {
		//comando 1
		//comando 2
		//}
		//else {
			//if ( condição 2 ) {
				//comando 3
				//comando 4
			//}
			//else {
				//comando 5
				//comando 6
			//}
		//}
		
		int horario;

		System.out.println("\nQual horário?");

		horario = sc.nextInt();

		if (horario < 12) {
			System.out.println("Bom dia");
		} 
		else {
			if(horario <= 18) {
			System.out.println("Boa tarde");
			}
			else {
			System.out.println("Boa noite");
			}
		}
		
		//Para mais de duas condições é possível também utilizar o encadeamento com else if, conforme o exemplo abaixo
		
		//Repare que a indentação fica mais padronizada e organizada com else if
		
		//if ( condição 1 ) {
			//comando 1
			//comando 2
		//}
		//else if ( condição 2 ) {
			//comando 3
			//comando 4
		//} 
		//else if ( condição 3 ) {
			//comando 5
			//comando 6
		//}
		//else {
			//comando 7
			//comando 8
		//}
		
		
		sc.close();
	}

}
