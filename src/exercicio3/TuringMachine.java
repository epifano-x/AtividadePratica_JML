package exercicio3;

public class TuringMachine {
	
	private char[]       alphabet;
	private char[]       auxiliaryAlphabet;
	private char[]       tape;
	private int          head;
	private String[]     states;
	private String       currentState;
	private String       initialState;
	private String[]     finalStates;
	private Transition[] transitions;

	//  invariantes de classe
	
	//@ invariant alphabet.length > 0;
    //@ invariant head >= 0;
    //@ invariant .........;
    //@ invariant .........;
    // .....

	
	public TuringMachine(String[] states, String initialState, String[] finalStates, char[] alphabet, ...){
		this.states       = states;
		this.currentState = initialState;
		// .....
	}
	
	/**
     * A fita deve conter a entrada a ser processada e a entrada deve ser definida a partir 
     * do alfabeto da entrada. 
     */
    //@ requires getSymbol();
    //@ ensures  currentState == initialState && .... ;
	public void start(char[] input){

	}
	
	/**
     * Simula um passo da m�quina de Turing.
     *  
     */
    //@ requires ????;
    //@ ensures  ????;
	public boolean step(){
		
	}
	
	 /**
      * Determina se a m�quina de Turing aceita a entrada. 
      *  
      */
    //@ requires ????;
    //@ ensures  ????;
	//@                       
	public boolean accept(){
		
	}
	
	/**
     * Determina se a m�quina de Turing rejeita a entrada.
     *  
     */
    //@ requires ????;
    //@ ensures  ????;
	public boolean reject(){
		
	}

}
