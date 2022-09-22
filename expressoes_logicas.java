
public class expressoes_logicas {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		// expressão -> resultado -> valor verdade (falso ou verdadeiro)
		
		// Operadores lógicos:
		
		//&& E
		//|| OU
		//! NÃO
		
		//OPERADOR E
		
		//Ideia por trás do operador "E"
		//Você pode obter uma habilitação de motorista se:
		//• For aprovado no exame psicotécnico, 
		//E
		//• For aprovado no exame de legislação, 
		//E
		//• For aprovado no exame de direção
		
		//Todas condições devem ser verdadeiras!
		
		//Exemplos de expressões lógicas com operador E
		
		//(suponha x igual a 5)
		
		//X <= 20 && X == 10 			Resultado: F
		//X > 0 && X != 3 	 			Resultado: V
		//X <= 20 && X == 10 && X != 3  Resultado: F
		
		//Tabela verdade do operador "E"
		//A	 B 	A && B
		//F  F 	  F
		//F  V 	  F
		//V  F 	  F
		//V  V 	  V
		
		//OPERADOR OU
		
		//Ideia por trás do operador "OU"
		//Você pode obter estacionar na vaga especial se:
		//• For idoso(a),
		//OU
		//• For uma pessoa com deficiência, 
		//OU
		//• For uma gestante
		
		//Pelo menos uma condição deve ser verdadeira!
		
		//Exemplos de expressões lógicas com operador OU
		
		//(suponha x igual a 5)
		
		//X == 10 || X <= 20 		 Resultado: V
		//X > 0 || X != 3 			 Resultado: V
		//X <= 0 || X != 3 || X != 5 Resultado: V
		
		//Tabela verdade do operador "OU"
		//A   B   A || B
		//F   F     F
		//F   V     V
		//V   F     V
		//V   V     V
		
		//OPERADOR NÃO
		
		//Ideia por trás do operador "NÃO"
		//Você tem direito a receber uma bolsa de estudos se você:
		//NÃO
		//• Possuir renda maior que $ 3000,00
		//Exemplo: João renda 5000,00 e José renda 2000,00. O segundo ganha a bolsa
		
		//O operador "NÃO" inverte a condição
		
		//Exemplos de expressões lógicas com operador NÂO
		
		//(suponha x igual a 5)
		
		//!(X == 10) 			Resultado: V
		//!(X >= 2)  			Resultado: F
		//!(X <= 20 && X == 10) Resultado: V
		
		//Tabela verdade do operador "NÃO"
		//A   ! A
		//F    V
		//V    F
	
	}

}
