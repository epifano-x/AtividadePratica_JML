package exercicio3;

public class TuringMachine {

    private char[] alphabet;
    private char[] auxiliaryAlphabet;
    private char[] tape;
    private int head;
    private String[] states;
    private String currentState;
    private String initialState;
    private String[] finalStates;
    private Transition[] transitions;

    // invariantes de classe

    //@ invariant alphabet.length > 0;
    //@ invariant head >= 0;
    //@ invariant currentState != null;
    //@ invariant initialState != null;
    //@ invariant finalStates != null;
    //@ invariant transitions != null;
    //@ invariant tape != null;
    //@ invariant auxiliaryAlphabet != null;

    public TuringMachine(String[] states, String initialState, String[] finalStates, char[] alphabet, char[] auxiliaryAlphabet, ...) {
        this.states = states;
        this.currentState = initialState;
        // ...
    }

    /**
     * A fita deve conter a entrada a ser processada e a entrada deve ser definida a partir 
     * do alfabeto da entrada. 
     */
    //@ requires input != null;
    //@ requires input.length > 0;
    //@ requires isInputValid(input);
    //@ ensures currentState == initialState && head == 0;
    //@ ensures isTapeInitialized(input);
    public void start(char[] input) {
        // ...
    }

    /**
     * Simula um passo da máquina de Turing.
     *  
     */
    //@ requires isTapeInitialized(tape);
    //@ ensures !accept() && !reject() ==> currentState != \old(currentState) || head != \old(head);
    //@ ensures accept() ==> currentState == \old(currentState) && head == \old(head);
    //@ ensures reject() ==> currentState == \old(currentState) && head == \old(head);
    public boolean step() {
        // ...
    }

    /**
     * Determina se a máquina de Turing aceita a entrada. 
     *  
     */
    //@ requires isTapeInitialized(tape);
    //@ ensures \result == (currentState.equals(finalStates[0]) || currentState.equals(finalStates[1]) || ...);
    public boolean accept() {
        // ...
    }

    /**
     * Determina se a máquina de Turing rejeita a entrada.
     *  
     */
    //@ requires isTapeInitialized(tape);
    //@ ensures \result == !accept();
    public boolean reject() {
        // ...
    }

}
