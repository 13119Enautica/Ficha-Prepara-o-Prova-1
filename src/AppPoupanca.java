import javax.swing.*;

public class AppPoupanca extends JFrame{
    private JTextField campo_juros, campo_anos, campo_deposito;
    private JLabel lb_juros, lb_anos, lb_deposito, lb_total,lb_resultado;
    private JButton ok;
    public AppPoupanca() {
        super("Poupanca");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel painel = new JPanel();
        this.getContentPane().add(painel);
        lb_juros = new JLabel("Juros ao mês %:");
        campo_juros = new JTextField(15);
        painel.add(lb_juros);
        painel.add(campo_juros);
        lb_anos = new JLabel("Num. de anos:");
        campo_anos = new JTextField(15); painel.add(lb_anos);
        painel.add(campo_anos);
        lb_deposito = new JLabel("Depósito mensal em Euros:");
        campo_deposito = new JTextField(15);
        painel.add(lb_deposito);
        painel.add(campo_deposito);
        lb_total = new JLabel("Total poupado em Euros:");
        painel.add(lb_total);
        lb_resultado = new JLabel("");
        painel.add(lb_resultado);
        ok = new JButton("OK");
        painel.add(ok); }
    public static void main(String args[]) {
        AppPoupanca janela = new AppPoupanca();
        janela.setBounds(100,100,350,160);
        janela.setVisible(true);
    }
}
