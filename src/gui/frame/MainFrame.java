package gui.frame;
 
import javax.swing.JFrame;
 
import gui.panel.MainPanel;
import util.GUIUtil;
 
public class MainFrame extends JFrame{
    public static MainFrame instance = new MainFrame();
     
    private MainFrame(){
        this.setSize(800,700);
        this.setTitle("逆水寒忠肝义胆之人模拟器 								   by ShiroMaple白枫 ");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
       // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        instance.setVisible(true);
    }
     
}