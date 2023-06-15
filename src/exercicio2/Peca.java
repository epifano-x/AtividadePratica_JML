package exercicio2;

public abstract class Peca {
	
	// P para preta e B para Branca
	private char      cor;
	private int       linha, coluna;
	private Tabuleiro tabuleiro;
	
    /**  invariantes de classe **/
	//@ invariant cor == "P" || cor == "B";
    //@ .....
	
	
	/**
     * Verifica se a nova posi��o est� desocupada ou est� 
     * ocupada por uma pe�a do advers�rio 
     *  
     */
    //@ requires ????;
    //@ ensures  \result == tabuleiro[novaLinha][novaColuna] == NULL && ????;
	public boolean abstract validaMovimento(int novaLinha, int novaColuna);
	


}
