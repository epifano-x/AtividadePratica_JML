package exercicio4;

public class Grafo {
	
	private /*@ public_spec  @*/ Vertice[] vertices;
	private                      Aresta[]  arestas;
	
    // *********************
	// invariantes de classe
	// *********************
	
	// O grafo deve ter pelo menos um v�rtice
	//@ invariant .........;
	
	
	/**
     * Adicionar novo v�rtice 
     */
    //@ requires true;
    //@ ensures  ????;
	public void novoVertice(Vertice vertice){
		
	}
	
	/**
     * Adicionar nova aresta 
     */
    //@ requires ????;
    //@ ensures  ????;
	public void novaAresta (Vertice vOrigem, Vertice vDestino){
		
	}

	
	/**
     * Remove um vertice do grafo. Entretanto, o v�rtice s� poder� ser
     * removido se n�o houver arestas incidindo nele ou partindo dele. 
     */
    //@ requires ????;
    //@ ensures  ????;
	public boolean removerVertice (Vertice vertice){
		return true;
	}

	/**
     * Remove um vertice do grafo e tamb�m as arestas relacionadas a ele. 
     */
    //@ requires ????;
    //@ ensures  ????;
	public void removerVerticeComArestas (Vertice vertice){
		
	}
	
	
	/**
     * Verifica se existe um caminho entre dois v�rtices  
     */
    //@ measured_by (arestas.length());
	//@ requires ????;
    //@ ensures  \result == (\exists int i,j;
	
	//@                              arestas[i].vOrigem.equals(vOrigem) && 
	//@                              arestas[j].vDestino.equals(vDestino) &&
	//@                              i>=0 && i<arestas.length && j>=0 && j<arestas.length;	
	
	//@                              existeCaminho(arestas[i].vDestino, arestas[j].vOrigem) ||
	//@                              arestas[i].vDestino.equals(arestas[j].vOrigem));
	
	public /*@ pure @*/ boolean existeCaminho (Vertice vOrigem, Vertice vDestino){
		return true;
	}


	/**
     * Retorna o caminho(sequencia de v�rtices) entre dois v�rtices.  
     */
    //@ requires ????;
    //@ ensures  existeCaminho(vOrigem, vDestino) ==> 
	//@               (\forall int i; 
	//@                        i>=0 && i<result.length-1; 
	//@                        \result[0]        == vOrigem  && 
	//@                        \result[length-1] == vDestino &&
	//@                         (\exists int j; j>=0 && j<arestas.length;
	//@                                    arestas[j].vOrigem  == \result[i] &&
	//@                                    arestas[j].vDestino == \result[i+1])));
	
	public /*@ pure @*/ Vertice[] caminho (Vertice vOrigem, Vertice vDestino){
		return null;
	}

	
	/**
     * Verifica se um dado grafo � subgrafo  
     */
    //@ requires ????;
    //@ ensures  ????;
	public boolean subGrafo (Grafo subgrafo){
		return true;
	}


}
