package atividade01EDD;

import javax.swing.JOptionPane;

public class Vetor {
	 	private String[] elementos;
	    protected int tamanho;
	    
	    public Vetor(int capacidade){
	        this.elementos = new String[capacidade];
	        this.tamanho = 0;
	    } 
	    
	    
		public void adiciona(String elemento){
	      this.aumentaCapacidade();
	      if(this.tamanho < this.elementos.length){
	          this.elementos[this.tamanho] = elemento;
	          this.tamanho++;
	      }
	    }
	    
	    public int tamanho(){
	        return this.tamanho;
	    }
	    
	    @Override
	    public String toString(){
	        StringBuilder s = new StringBuilder();
	        s.append("[");
	        
	        for(int i=0; i<this.tamanho-1; i++){
	            s.append(this.elementos[i]);
	            s.append(", ");
	        }
	        
	        if(this.tamanho> 0){
	            s.append(this.elementos[this.tamanho-1]);
	        }
	        
	        s.append("]");
	                
	        return s.toString();
	    }
	    
	    public String buscaPosicao(int posicao){
	            return elementos[posicao];	
	    }
	    
	    public int buscaElemento(String elemento){
	        for (int i=0; i<tamanho; i++){
	            if(elementos[i].equals(elemento)){
	                return i;
	            }
	        }
	        return -1;
	    }
	    
	   public void adicionaInicio(int posicao, String elemento){
	       this.aumentaCapacidade();
	       while(posicao < 0 || posicao > tamanho){
	    	   System.out.println("Inv�lido");
	       }
	       String aux;
	       String bux;
	       aux = this.elementos[posicao];
	       this.elementos[posicao] = elemento;
	            for(int i=posicao+1; i < this.tamanho; i++){
	            	bux = this.elementos[i];
	            	this.elementos[i] = aux;
	            	aux = bux;
	                
	            }
	   }
	   
	   private void aumentaCapacidade(){
	       if (this.tamanho == this.elementos.length){
	           String[] elementosNovos = new String[this.elementos.length * 2];
	           for (int i=0; i<this.elementos.length; i++){
	               elementosNovos[i] = this.elementos[i];
	           }
	           this.elementos = elementosNovos;
	       }
	   }
	   
	   public void remove(int posicao) throws Exception{
	       if(posicao >=0 && posicao < tamanho){
	           for(int i=posicao; i<this.tamanho-1; i++){
	               this.elementos[i] = this.elementos[i+1];
	           }
	           this.tamanho--;
	        } else {
	            throw new Exception("Posi��o Inv�lida");
	        } 
	   }

}
