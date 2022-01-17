import javax.swing.*;

public class UsaJOption {
    public static void main (String[] args) {
        int opcaoEscolhida = JOptionPane.showConfirmDialog(null,
                "Deseja guardar as alterações?");
        System.out.println("A opção escolhida foi: "+ opcaoEscolhida);
        String nome = JOptionPane.showInputDialog("Escreva o seu nome: ");
        System.out.println("O nome inserido foi: "+nome);
        String[] tipoLigacao = {"Wireless", "ADSL", "Fibra Otica"};
        int escolha = JOptionPane.showOptionDialog(null,"Escolha uma das ligações", "Tipo)s de ligação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoLigacao,"Wireless");
        System.out.println("A opção escolhida foi: " + escolha);
        JOptionPane.showMessageDialog(null,"Obrigado!");
    }
}
