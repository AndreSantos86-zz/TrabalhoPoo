package JogoDaVelha;

import java.util.Scanner;
 // Jogador escolhe a posição a ser jogada a variavel POS armazena o numero digitado. 
public class Jogador{
	String pos;
	public String jogador() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a posição jogador 1 :" );
		pos = teclado.next();
		
		return pos;
	}
	
}