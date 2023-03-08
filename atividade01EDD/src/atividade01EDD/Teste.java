package atividade01EDD;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do Vetor: "));
		Vetor vetor = new Vetor(n);
		for(int i =0; i < n; i++){
				vetor.adiciona(JOptionPane.showInputDialog("Elemento: "));
		}
		System.out.println(vetor.toString()); 
		n = Integer.parseInt(JOptionPane.showInputDialog("Buscar elemento em qual posição?"));
		System.out.println(vetor.buscaPosicao(n));
		String f = JOptionPane.showInputDialog("Buscar posição de qual elemento");
		System.out.println(vetor.buscaElemento(f));
		f = JOptionPane.showInputDialog("Adicionar qual elemento? ");
		n = Integer.parseInt(JOptionPane.showInputDialog("Em qual posição? "));
		vetor.adicionaInicio(n, f);
		System.out.println(vetor.toString()); 
		
	}

}
