import java.util.Locale;
import java.util.Scanner;

public class sintaxe_opcional_OperadoresDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		//Operadores de atribui��o cumulativa
		//a += b; a = a + b;
		//a -= b; a = a - b;
		//a *= b; a = a * b;
		//a /= b; a = a / b;
		//a %= b; a = a % b;
		
		//Problema exemplo
		
		//Uma operadora de telefonia cobra R$ 50.00 por um plano b�sico que
		//d� direito a 100 minutos de telefone. Cada minuto que exceder a
		//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		//quantidade de minutos que uma pessoa consumiu, da� mostrar o valor
		//a ser pago.
		
		//Ex: entrada = 25 min / sa�da = 50.00 reais
		//Ex: entrada = 110 min / sa�da = 120.00 reais
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0; //Usando operador de atribui��o cumulativa
			//conta = conta + (minutos - 100) * 2.0; Poderia ser assim tamb�m
		}
		
		System.out.printf("O valor da conta � R$ %.2f%n", conta);
		
		sc.close();
		
	}

}
