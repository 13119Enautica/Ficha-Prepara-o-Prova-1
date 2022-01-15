import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
public class textfield {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("JFrame");
        janela.setSize(400,400);
        janela.setLocation(350,100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel rotulo = new JLabel("Escreva o seu nome: ");
        Icon imagem = new ImageIcon("src/esp32_cam03_latest.jpg");
        JLabel rotulo01 = new JLabel("esp32_cam03",imagem,CENTER);
        janela.add(rotulo01);
        janela.pack();
        janela.setVisible(true);
    }
}
