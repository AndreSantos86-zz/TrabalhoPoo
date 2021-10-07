package JogoDaVelha;

// Jogo da Velha.
// Aluno: Andre Luis Santos RU:3312505.

import java.util.Scanner;


public class JogoVelha {

	public static void main(String[] args) {
		Tabuleiro joga =new Tabuleiro();// instanciando tabuleiro
		Jogador jogador = new Jogador();// instanciando jogador
		String pos;
		int Jogadas;
		int opcao = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		Computador comp;
		comp = null;
	// Selecionar o nivel do adversario computador	
		System.out.println(" Bem Vindo ao Jogo da Velha ");
		System.out.println(" Digite o nivel do Computador 1 , 2 ou 3 : ");
		opcao= teclado.nextInt();
		
			
		if(opcao==1) { 
				comp= new ComputadorA();// apos escolher a opção sera instanciado o computador.
		}
		else if(opcao ==2) {
				comp= new ComputadorB();
		}
		else if(opcao ==3) {
				comp= new ComputadorC();
		}
		
		
		
		
		Jogadas = 0;
		int vez=1; // para alterar a vez dos jogadors ,enquanto vale 1 jogador humano enquanto 2 computador.
		
		
		while(joga.Situacao(Jogadas).equals("null") ) {// Enquanto ainda tiver jogadas ou não tiver vencedor fica dentro desse laço de repetição  
			joga.tabela();	// Mostrar a tabela para jogar	
			if(vez==1) { //Jogador Humano
				pos = jogador.jogador();// recebe a posição da jogada escolhida pelo jogador humano
				
				while(!joga.VerificaPos(pos)) { // esse laço verifica se a posição escolhida ja esta preenchida.
					System.out.println(" jogada invalida ");// 
					System.out.println("Digite outra posição :");
					pos = jogador.jogador();
				}
	
				System.out.println("______________________");
				joga.Jogar(pos, "X"); //objeto joga, altera o estado do tabuleiro
				Jogadas++; //( para contar as vezes que foram jogadas por exemplo 
				vez=2;    // passa a vez para o Computador
			}
			//----- Jogada do Computador, repetido os laços de verificação de opcão de jogada igual as do jogador.
			else if(vez==2) {
				pos = comp.Computadores(); // recebe o valor de um dos computadores escolhidos no inicio do jogo,
				
				while(!joga.VerificaPos(pos)) { // apos o computador escolher, o numero tambem e verificado.
					System.out.println(" jogada invalida ");// 
					System.out.println("Digite outra posição");
					pos = comp.Computadores();
				}
				
				System.out.println("______________________");
				joga.Jogar(pos, "O");
				Jogadas++; //( para contar as vezes que foram jogadas por exemplo 
				vez=1; // passa a vez para o jogador 
			}
				
		}
		joga.tabela();
		System.out.println(" O "+joga.Situacao(Jogadas)+ " Venceu ");// Saida para mostrar o vencedor ou empate.	
	}	
}
