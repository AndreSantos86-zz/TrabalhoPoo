package JogoDaVelha;

import java.util.Random;

public class ComputadorC extends Computador{ // Computadro C funciona parecido com b, mais geramos dois numeros aleatorios somamos e dividimos por 2
	// para obter o numero final.
	String pos;
	public String Computadores() {
		Random random = new Random();
		int numero = random.nextInt(9); //recebemos um numero aleatorio entre 0 e 9,
		int num = random.nextInt(9);//recebemos um numero aleatorio entre 0 e 9,
		System.out.println("Escolha a posição Computador 3 :" );
		int divide = (numero+num)/2; // Soma os numeros aleatoriamente e divide por 2.
		System.out.println("A jogada do computador e :" + divide);
		pos = Integer.toString(divide) ;
		
		return pos;
				
	}

}
