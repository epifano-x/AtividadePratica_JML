package exercicio2;

public class Tabuleiro {
	
	private Peca[][] tabuleiro = new Peca[8][8];
	private char jogadorDaVez;
	
	public Tabuleiro() {
	}
	
	/**
	 * Valida o movimento da peça e se a peça movimentada é do jogador da vez
	 */
	//@ requires peca.validaMovimento(novaLinha, novaColuna) == true && peca.getCor() == jogadorDaVez;
	//@ ensures tabuleiro[novaLinha][novaColuna] == peca && tabuleiro[antigaLinha][antigaColuna] == null;
	public boolean move(Peca peca, int novaLinha, int novaColuna) {
		// Implementação do método de movimentação
		return true;
	}
	
	/**
	 * Verifica se um jogador está em xeque
	 */
	//@ requires corPeca == 'P' || corPeca == 'B';
	//@ ensures \result == true se o jogador está em xeque, \result == false caso contrário;
	public boolean verificaXeque(char corPeca) {
		// Implementação da verificação de xeque
		return true;
	}
	
	/**
	 * Encontra a posição no tabuleiro onde está o rei da cor solicitada
	 */
	//@ requires corPeca == 'P' || corPeca == 'B';
	//@ ensures \result != null && \result.getCor() == corPeca && \result instanceof Rei;
	public /*@ pure @*/ Peca rei(char corPeca) {
		 // Implementação da busca pelo rei
		return null;
	}
}
