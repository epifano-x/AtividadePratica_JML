package exercicio4;

public class Grafo {
	
	private /*@ public_spec  @*/ Vertice[] vertices;
	private                      Aresta[]  arestas;
	
    // *********************
	// invariantes de classe
	// *********************
	
	// O grafo deve ter pelo menos um vértice
	//@ invariant vertices.length > 0;
	
	
	/**
     * Adicionar novo vértice 
     */
    //@ requires vertice != null;
    //@ ensures vertices[vertices.length-1] == vertice;
	public void novoVertice(Vertice vertice){
		// Implementação do método
	}
	
	/**
     * Adicionar nova aresta 
     */
    //@ requires vOrigem != null && vDestino != null;
    //@ ensures arestas[arestas.length-1].vOrigem == vOrigem && arestas[arestas.length-1].vDestino == vDestino;
	public void novaAresta (Vertice vOrigem, Vertice vDestino){
		// Implementação do método
	}

	
	/**
     * Remove um vértice do grafo. Entretanto, o vértice só poderá ser
     * removido se não houver arestas incidindo nele ou partindo dele. 
     */
    //@ requires vertice != null;
    //@ ensures \result == true && (\forall int i; i >= 0 && i < arestas.length; !arestas[i].vOrigem.equals(vertice) && !arestas[i].vDestino.equals(vertice));
	public boolean removerVertice (Vertice vertice){
		// Implementação do método
		return true;
	}

	/**
     * Remove um vértice do grafo e também as arestas relacionadas a ele. 
     */
    //@ requires vertice != null;
    //@ ensures (\forall int i; i >= 0 && i < arestas.length; !arestas[i].vOrigem.equals(vertice) && !arestas[i].vDestino.equals(vertice));
	public void removerVerticeComArestas (Vertice vertice){
		// Implementação do método
	}
	
	
	/**
     * Verifica se existe um caminho entre dois vértices  
     */
    //@ measured_by arestas.length;
	//@ requires vOrigem != null && vDestino != null;
    //@ ensures \result == (\exists int i,j; i >= 0 && i < arestas.length && j >= 0 && j < arestas.length; arestas[i].vOrigem.equals(vOrigem) && arestas[j].vDestino.equals(vDestino) && (existeCaminho(arestas[i].vDestino, arestas[j].vOrigem) || arestas[i].vDestino.equals(arestas[j].vOrigem)));
	public /*@ pure @*/ boolean existeCaminho (Vertice vOrigem, Vertice vDestino){
		// Implementação do método
		return true;
	}


	/**
     * Retorna o caminho (sequência de vértices) entre dois vértices.  
     */
    //@ requires vOrigem != null && vDestino != null && existeCaminho(vOrigem, vDestino);
    //@ ensures \result[0] == vOrigem && \result[\result.length-1] == vDestino && (\exists int j; j >= 0 && j < arestas.length; arestas[j].vOrigem == \result[i] && arestas[j].vDestino == \result[i+1]);
	public /*@ pure @*/ Vertice[] caminho (Vertice vOrigem, Vertice vDestino){
		// Implementação do método
		return null;
	}

	
	/**
     * Verifica se um dado grafo é subgrafo  
     */
    //@ requires subgrafo != null;
    //@ ensures \result == true;
	public boolean subGrafo (Grafo subgrafo){
		// Implementação do método
		return true;
	}


}
