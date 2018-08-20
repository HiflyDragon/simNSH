package startup;
 
import javax.swing.SwingUtilities;
 
import gui.frame.MainFrame;
import gui.panel.BagPanel;
import gui.panel.CreatePanel;
import gui.panel.MainPanel;
 
public class Bootstrap {
    public static void main(String[] args) throws Exception{

        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
                MainPanel.instance.workingPanel.show(CreatePanel.instance);
                MainPanel.instance.ItemPanel.show(BagPanel.instance);
            }
        });
    }
}