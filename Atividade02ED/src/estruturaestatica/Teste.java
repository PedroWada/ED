package estruturaestatica;

import javax.swing.JOptionPane;

public class Teste {
    
    public static void main(String[] args){
        Fila<Integer> fila = new Fila<Integer>();
        int p = 0;
        int senha = 0;
        while(p != 999){
            p = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite 1 para enfileirar \n"+
            "Digite 2 para ver a fila \n"+
            "Digite 3 para desenfileirar \n"+
            "Digite 999 para finalizar"));

        switch(p){
            case 1:
                senha+=1;
                fila.enfileira(senha);
                System.out.println(fila.toString());
                break;
            case 2:
                System.out.println(fila.toString());
                break;
            case 3:
                fila.desenfileira();
                System.out.println(fila.toString());
                break;
            case 999:
                break;
        }

        }


    }
}
