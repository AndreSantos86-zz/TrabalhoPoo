package JogoDaVelha;

import java.util.Scanner;
 // Jogador escolhe a posi��o a ser jogada a variavel POS armazena o numero digitado. 
public class Jogador{
	String pos;
	public String jogador() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a posi��o jogador 1 :" );
		pos = teclado.next();
		
		return pos;
	}
	
}