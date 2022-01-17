import javax.swing.*;

public class UsaMenus {
    public static void main (String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Menus");
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar barraMenu = new JMenuBar();
        JMenu meusContentores = new JMenu("Contentores");
        JMenuItem jmiFrame = new JMenuItem("JFrame");
        JMenuItem jmiPanel = new JMenuItem("JPanel");
        janela.setJMenuBar(barraMenu);
        barraMenu.add(meusContentores);
        meusContentores.add(jmiFrame);
        meusContentores.add(jmiPanel);
        janela.setVisible(true);
    }
}
