package atividade01EDD;

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
	    
	   
	   
	   public void aumentaCapacidade(){
	       if (this.tamanho == this.elementos.length){
	           String[] elementosNovos = new String[this.elementos.length * 2];
	           for (int i=0; i<this.elementos.length; i++){
	               elementosNovos[i] = this.elementos[i];
	           }
	           this.elementos = elementosNovos;
	       }
	   }
	   
	   public void remove(int posicao){
	       if(posicao >=0 && posicao < tamanho){
	           for(int i=posicao; i<this.tamanho-1; i++){
	               this.elementos[i] = this.elementos[i+1];
	           }
	           this.tamanho--;
	        } else {
	           System.out.println("Posição Inválida");
	        } 
	   }

}
