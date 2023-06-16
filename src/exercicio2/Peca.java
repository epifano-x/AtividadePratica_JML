package exercicio2;

public abstract class Peca {
	
	// P para preta e B para Branca
	private char      cor;
	private int       linha, coluna;
	private Tabuleiro tabuleiro;
	
	/** invariantes de classe **/
	//@ invariant cor == 'P' || cor == 'B';
	//@ invariant linha >= 0 && coluna >= 0;
	//@ invariant tabuleiro != null;
	
	/**
	 * Verifica se a nova posição está desocupada ou está ocupada por uma peça do adversário 
	 */
	//@ requires novaLinha >= 0 && novaColuna >= 0;
	//@ ensures \result == (tabuleiro.getPeca(novaLinha, novaColuna) == null || tabuleiro.getPeca(novaLinha, novaColuna).getCor() != cor);

	public boolean abstract validaMovimento(int novaLinha, int novaColuna);
	


}
