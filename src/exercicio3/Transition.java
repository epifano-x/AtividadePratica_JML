package exercicio3;

public class Transition {
	
	// atributos
	
	// estado corrente da máquina
	private String state;
	// símbolo sob a cabeça de leitura da máquina 
	private char symbol;
	// estado resultante da transição
	private String targetState;
	// símbolo a ser gravado na fita
	private char symbolGravado;
		
	// movimentação da cabeça de leitura (D para direita e E para esquerda)
    private char moviment;

    //@ public invariant state != null;
    //@ public invariant targetState != null;
    
    public Transition(String cs, char s, String ts, char m){
    	state = cs;
    	symbol = s;
    	targetState = ts;
    	moviment = m;
    }

    //@ ensures \result != null;
	public String getCurrentState() {
		return state;
	}

	//@ ensures \result == symbol;
	public char /*@ pure @*/ getSymbol() {
		return symbol;
	}

	//@ ensures \result != null;
	public String getTargetState() {
		return targetState;
	}

	//@ ensures \result == moviment;
	public char getMoviment() {
		return moviment;
	}
}
