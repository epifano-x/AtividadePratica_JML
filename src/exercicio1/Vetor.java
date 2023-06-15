package exercicio1;

/* Considere um vetor "B" com "n" números inteiros. 
 * Considere os índices "j" e "k", onde 0 <= j < k < n. 
 * A notação B[j..k] expressa um segmento do vetor B (mas não pode ser escrita assim em JML).
 * 
 * Escreva expressões JML que descrevam precisamente as funcionalidades listadas a seguir.
*/


public class Vetor {

 /**	Todos os elementos no segmento B[j..k] são zero. 
  *
  **/
  //@ requires B.length > 0 && j < k;
  //@ ensures  \result == (\forall int i; j <= i && i <= k; B[i]==0);
  public boolean teste1(int B[], int j, int k){
	  
	  return true;
  }
 
  

  /** Todos os valores zero de B[0..n-1] estão no segmento B[j..k].
   *
   **/
  //@ requires B.length > 0 && j < k;
  //@ ensures  \result == (\forall int i; 0 <= i && i < j && k < i && i < B.length; B[i] != 0) ;
  public boolean teste2(int B[], int j, int k){
	  return true;
  }

  
/**	Nem todos os valores zero de B[0..n-1] estão em B[j..k]. 
 * (Especifique isto de duas maneiras, uma usando negação ('!') e outra sem negação. 
 *
 **/
//@ requires ????;
//@ ensures  ????;
  public boolean teste3 (int B[], int j, int k){
     return true;
  }

/**	O vetor B[0..n-1] contêm exatamente dois valores zero. 
 *
 **/
  //@ requires ????;
  //@ ensures  ????;
  public boolean teste4(int B[]){
	  
  }

  /** O vetor B[0..n-1] contêm pelo menos dois valores zero.
   *
   **/
   //@ requires ????;
   //@ ensures  ????;
  public boolean teste5(int B[]){

  /** O vetor B[0..n-1] contêm no máximo dois valores zero.
   *  
   **/
  //@ requires ????;
  //@ ensures  ????;
	  public boolean teste6(int B[]){

 /** Especifique o método "reverse" que inverte a ordem dos 
  * elementos no vetor B.
  *
  **/
  //@ requires ????;
  //@ ensures  ????;
  public static void reverse (int[] B){
	  
  }



	
}
