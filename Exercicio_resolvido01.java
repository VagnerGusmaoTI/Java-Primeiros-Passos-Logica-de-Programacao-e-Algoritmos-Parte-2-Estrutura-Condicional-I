import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido01 {

	public static void main(String[] args) {
		
		// ESTRUTURA CONDICIONAL
		
		//Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
		//segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
		//aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
		//seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
		//os valores devem ter uma casa decimal.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notaFinal = nota1+nota2;
		
		if(notaFinal >= 60.00) {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
			System.out.println("REPROVADO");
		}
		
		//Poderia ser feito também apenas com a condição simples.
		//Após a declaração da variável notaFinal, poderia ser:
		
		//System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		//if (notaFinal < 60.0) {
			//System.out.println("REPROVADO");
			//}
	
		sc.close();

	}

}
