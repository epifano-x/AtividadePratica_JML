package exercicio2;

public class Tabuleiro {
	
	
	private Peca[][] tabuleiro     = new Peca[8][8];
	private char     jogadorDaVez;
	

	public Tabuleiro(){		
	}
	
	/**
     * Valida o movimento da pe�a e se a pe�a movimentada � do jogador da vez
     *  
     */
    //@ requires peca.validaMovimento(novaLinha,novaColuna)==true &&
	//@          peca.cor == jogadorVez;
	//@
    //@ ensures  ????;
	public boolean move (Peca peca, int novaLinha, int novaColuna){

		return true;
	}
	
	
	/**
     * Verifica se um jogador est� em xeque 
     *  
     */
    //@ requires ????;
    //@ ensures  ???? 
	public boolean verificaXeque (char corPeca) {
		
	}

	/**
     * Encontra a posi��o no tabuleiro onde est� o rei da cor solicitada 
     *  
     */
    //@ requires ????;
    //@ ensures  ????
	public /*@ pure @*/ Peca rei(char corPeca){
				
	}
	
}
