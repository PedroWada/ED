package estruturaestatica;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args){
        Fila<Integer> filaNormal = new Fila<Integer>();
        Fila<Integer> filaPreferecial = new Fila<Integer>();
        int p = 0;
        int senha = 0;
        while(p != 999){
            p = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite 1 para enfileirar \n"+
            "Digite 2 para ver a fila \n"+1+
            "Digite 3 para desenfileirar \n"+
            "Digite 999 para finalizar"));

        switch(p){
            case 1:
                senha+=1;
                filaNormal.enfileira(senha);
                System.out.println(filaNormal.toString());
                break;
            case 2:
                System.out.println(filaNormal.toString());
                break;
            case 3:
                filaNormal.desenfileira();
                System.out.println(filaNormal.toString());
                break;
            case 999:
                break;
        }

        }


    }
}
