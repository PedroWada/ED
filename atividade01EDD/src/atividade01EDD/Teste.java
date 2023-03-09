package atividade01EDD;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		int p = 0;
		System.out.println("Sistema de controle de armazenamento");
		System.out.println("--------------------------------------------------");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do Armazén: "));
		Vetor vetor = new Vetor(n);
		while(p != 999){
		p = Integer.parseInt(JOptionPane.showInputDialog(
			"Digite 1 para adicionar: "+ "\n"+
			"Digite 2 para buscar elemento: \n"+
			"Digite 3 para buscar a posição: \n"+
			"Digite 4 para remover elemento:  \n"+
			"Digite 5 para analisar armazém \n"+
			"Digite 999 para sair! " ));

		switch(p){
			case 1:
				vetor.adiciona(JOptionPane.showInputDialog("Elemento : "));
				break;
			case 2:
				vetor.buscaElemento(JOptionPane.showInputDialog("Buscar elemento em qual posicao?"));
				break;
			case 3:
				vetor.buscaPosicao(Integer.parseInt(JOptionPane.showInputDialog("Em qual posicao? ")));
				break;
			case 4:
				vetor.remove(Integer.parseInt(JOptionPane.showInputDialog("Remover elemento de qual posição? ")));
				break;
			case 5:
				System.out.println(vetor.toString());
				break;
			case 999:
				System.out.println("Finalizado!");
				break;
			default:
				System.out.println("Inválido! Tente novamente! ");
				break;
		}
	}	
	}

}
