package JogoDaVelha;

public class ComputadorA extends Computador {
	public static int contador = 1; // Este contador e utilizado para retornar um numero em sequencia toda vez que o metodo for chamado.
	String pos;
	public String Computadores() {
		System.out.println(" Jogada computador 1 :");
		System.out.println(" A jogada do Computador é:"+ contador);
		pos = Integer.toString(contador);
		contador ++; // quando usamos esse metodo ele incrementa um numero, retornando para a variavel pos.
		
		return pos;
	}

}
