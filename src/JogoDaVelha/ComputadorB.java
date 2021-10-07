package JogoDaVelha;

import java.util.Random;

public class ComputadorB extends Computador { // O computador B utiliza numeros gerados aleatoriamente de 1 a 9.
	String pos;
	public String Computadores() {
		Random random = new Random(); // instanciando ramdom
		int numero = random.nextInt(9); // recebemos um numero aleatorio entre 0 e 9,
		System.out.println("Escolha a posição Computador 2 :" );
		System.out.println(" A jogada do computador é:" + numero);
		pos = Integer.toString(numero) ;// armazena o numero na variavel pos, como numero e inteiro e pos string, altera o numero para string.
		
		return pos;
	}

}// a classe ramdom gera os numeros
