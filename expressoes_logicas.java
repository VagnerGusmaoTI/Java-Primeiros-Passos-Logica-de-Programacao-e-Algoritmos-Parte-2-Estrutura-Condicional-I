
public class expressoes_logicas {

	public static void main(String[] args) {
		
		//ESTRUTURA CONDICIONAL
		
		// express�o -> resultado -> valor verdade (falso ou verdadeiro)
		
		// Operadores l�gicos:
		
		//&& E
		//|| OU
		//! N�O
		
		//OPERADOR E
		
		//Ideia por tr�s do operador "E"
		//Voc� pode obter uma habilita��o de motorista se:
		//� For aprovado no exame psicot�cnico, 
		//E
		//� For aprovado no exame de legisla��o, 
		//E
		//� For aprovado no exame de dire��o
		
		//Todas condi��es devem ser verdadeiras!
		
		//Exemplos de express�es l�gicas com operador E
		
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
		
		//Ideia por tr�s do operador "OU"
		//Voc� pode obter estacionar na vaga especial se:
		//� For idoso(a),
		//OU
		//� For uma pessoa com defici�ncia, 
		//OU
		//� For uma gestante
		
		//Pelo menos uma condi��o deve ser verdadeira!
		
		//Exemplos de express�es l�gicas com operador OU
		
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
		
		//OPERADOR N�O
		
		//Ideia por tr�s do operador "N�O"
		//Voc� tem direito a receber uma bolsa de estudos se voc�:
		//N�O
		//� Possuir renda maior que $ 3000,00
		//Exemplo: Jo�o renda 5000,00 e Jos� renda 2000,00. O segundo ganha a bolsa
		
		//O operador "N�O" inverte a condi��o
		
		//Exemplos de express�es l�gicas com operador N�O
		
		//(suponha x igual a 5)
		
		//!(X == 10) 			Resultado: V
		//!(X >= 2)  			Resultado: F
		//!(X <= 20 && X == 10) Resultado: V
		
		//Tabela verdade do operador "N�O"
		//A   ! A
		//F    V
		//V    F
	
	}

}
