package JogoDaVelha;

public class Tabuleiro {
	
String[][] tab = {{"1","2","3"},{"4","5","6"},{"7","8","9"}}; // Matriz armazenando numeros como referencia para jogada
	
//Apresentação da tabela do jogo da velha na tela, com laço for para varrer a matriz	
		public String tabela() {
			System.out.println("  JOGO DA VELHA ");
			System.out.println(" +----+----+----+");
			for(int i = 0;i<3;i++) {
				for(int j = 0;j<3;j++) {
					System.out.print(" | ");
					System.out.print(" "+ tab[i][j]);
					
				}
				System.out.println(" | ");
				System.out.println(" +----+----+----+");
			}
			return null;
		}
		
		public boolean VerificaPos(String pos) { // Verificar se a posição ja esta preenchida
			for(int i = 0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(tab[i][j].equals (pos)) // comparar a posição digitada com as posiçoes ja preenchidas
						return true;
				}
			}
			return false;
		}
		
		// Jogar armazena nas posiçoes da matriz  as jogadas escolhidas.
		public void Jogar(String pos, String j) {
			if(pos.equals("1"))
				tab[0][0]= j;
			else if(pos.equals("2"))
				tab[0][1]=j;
			else if(pos.equals("3"))
				tab[0][2]=j;
			else if(pos.equals("4"))
				tab[1][0]=j;
			else if(pos.equals("5"))
				tab[1][1]=j;
			else if(pos.equals("6"))
				tab[1][2]=j;
			else if(pos.equals("7"))
				tab[2][0]=j;
			else if(pos.equals("8"))
				tab[2][1]=j;
			else if(pos.equals("9"))
				tab[2][2]=j;
		
		}
		//  verifica quem venceu ou se empatou ou se o jogo continua, o vetor tem as jogadas de vitoria possiveis, e o for percorre o vetor
		// comparando se alguma das situaçoes foi atendida, caso contrario retorna empate.
		public String Situacao(int jogadas) {
			String[]Teste = new String[8];
			String vencedor = "null";
			if(jogadas == 9) {
				vencedor = "Empate";
				}
			Teste[0]= tab[0][0]+tab[0][1]+tab[0][2];
			Teste[1]= tab[1][0]+tab[1][1]+tab[1][2];
			Teste[2]= tab[2][0]+tab[2][1]+tab[2][2];
			Teste[3]= tab[0][0]+tab[1][0]+tab[2][0];
			Teste[4]= tab[0][1]+tab[1][1]+tab[2][1];
			Teste[5]= tab[0][2]+tab[1][2]+tab[2][2];
			Teste[6]= tab[0][0]+tab[1][1]+tab[2][2];// vertical
			Teste[7]= tab[0][2]+tab[1][1]+tab[2][0];// vertical
			
			for (int i = 0;i < Teste.length; i++) {
				if(Teste[i].equals("XXX")) {
					vencedor = "Jogador";
				}else if(Teste[i].equals("OOO")) {
					vencedor = "Computador"; // ou comp
				}
			}
			return vencedor;
		}
	
}
	
	

	

	

	



